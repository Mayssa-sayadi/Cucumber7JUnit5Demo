package com.example.definitions;

import com.example.utils.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {
//hooks = c'est sont les annotations
    private static WebDriver driver;

    @Before
    public static void setUp(){
        HelperClass.setUpDriver();
    }

    @After
    public static void tearDown(Scenario scenario){
        //validate if scenario has failed or not
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        HelperClass.tearDown();
    }
}
