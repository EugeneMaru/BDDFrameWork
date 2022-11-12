package com.BDDFrameWork.stepDef.tryCloud;

import com.BDDFrameWork.pages.tryCloud.LoginPage;
import com.BDDFrameWork.utilities.ConfigurationReader;
import com.BDDFrameWork.utilities.Driver;
import com.BDDFrameWork.utilities.tryCloud.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InvalidCredentialsLogin_StepDef {

    LoginPage loginPage = new LoginPage();


    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));


    }
    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        loginPage.inputUsername.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();

    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String message) {
       Assert.assertEquals(loginPage.invalidCredentialsErrorMessage.getText(), message);
       Driver.closeDriver();
    }
}
