package com.BDDFrameWork.stepDef.tryCloud;

import com.BDDFrameWork.pages.tryCloud.LoginPage;
import com.BDDFrameWork.utilities.ConfigurationReader;
import com.BDDFrameWork.utilities.Driver;
import com.BDDFrameWork.utilities.tryCloud.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginValidCredentialsStepDef {

    LoginPage loginPage = new LoginPage();
    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String username, String password) {
        loginPage.inputUsername.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);

    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();
    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Dashboard - Trycloud");
        Driver.closeDriver();
    }

}
