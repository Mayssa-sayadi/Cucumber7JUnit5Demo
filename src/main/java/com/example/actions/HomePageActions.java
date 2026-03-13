package com.example.actions;

import com.example.locators.HomePageLocators;
import com.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class HomePageActions{

    HomePageLocators homePageLocators = null;

    public HomePageActions(){
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
    }
    //get username Sfrom home page

    public String getHomePageText(){
        return homePageLocators.homePageUserName.getText();
    }
}
