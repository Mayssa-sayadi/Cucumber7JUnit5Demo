package com.example.definitions;

import com.example.actions.HomePageActions;
import com.example.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginPageDefinitions {

    HomePageActions homePageActions = new HomePageActions();
    // ========== BACKGROUND ==========

    @Given("User is on HRMLogin page {string}")
    public void userIsOnHrmLoginPage(String url) {
        HelperClass.openPage(url);

    }

    // ========== LOGIN ==========

    @When("User enters username as {string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String username, String password) {

    }

    @Then("User should be able to login successfully and new page open")
    public void userShouldBeAbleToLoginSuccessfullyAndNewPageOpen() {
        // verify home page
        Assertions.assertTrue(homePageActions.getHomePageText().contains("Dashboard"));
    }

    // ========== INVALID LOGIN ==========

    @Then("User should be able to see error message {string}")
    public void userShouldBeAbleToSeeErrorMessage(String errorMessage) {
        // TODO: implement step
    }

    // ========== SOCIAL LINKS ==========

    @Then("User should be able to see FaceBook Icon")
    public void userShouldBeAbleToSeeFaceBookIcon() {
        // TODO: implement step
    }

    @Then("User should be able to see LinkedIn Icon")
    public void userShouldBeAbleToSeeLinkedInIcon() {
        // TODO: implement step
    }

    // ========== FORGOT PASSWORD ==========

    @When("User clicks on forgot your password link")
    public void userClicksOnForgotYourPasswordLink() {
        // TODO: implement step
    }

    @Then("User should navigate to new Page")
    public void userShouldNavigateToNewPage() {
        // TODO: implement step
    }
}
