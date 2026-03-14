package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")
    public WebElement linkedInIcon;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")
    public WebElement facebookIcon;

    @FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
    public WebElement forgotYourPasswordLink;


}
