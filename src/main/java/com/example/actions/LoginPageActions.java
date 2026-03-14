package com.example.actions;

import com.example.locators.LoginPageLocators;
import com.example.utils.HelperClass;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {

    LoginPageLocators loginPageLocators = null;

    public LoginPageActions(){
        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
    }
    // Set user name in textbox
    public void setUserName(String strUserName) {
        loginPageLocators.username.clear();
        loginPageLocators.username.sendKeys(strUserName);
    }

    // Set password in password textbox
    public void setPassword(String strPassword) {
        loginPageLocators.password.clear();
        loginPageLocators.password.sendKeys(strPassword);
    }

    // click on login Button
    public void clickLogin() {
        loginPageLocators.loginBtn.click();
    }

    public String getErrorMessage(){
        return loginPageLocators.errorMessage.getText();
    }

    // LinkedIn Icon is Displayed
    public Boolean getLinkedInIcon() {
        return loginPageLocators.linkedInIcon.isDisplayed();
    }

    // FaceBook Icon is Displayed
    public Boolean getFaceBookIcon() {
        return loginPageLocators.facebookIcon.isDisplayed();
    }

    // Click on Forget Your Password Link
    public void clickOnForgetYourPasswordLInk() {
        loginPageLocators.forgotYourPasswordLink.click();
    }

    public void login(String strUserName, String strPassword) {
        // Fill user name
        this.setUserName(strUserName);
        // Fill password
        this.setPassword(strPassword);
        // Click Login button
        this.clickLogin();
    }

}
