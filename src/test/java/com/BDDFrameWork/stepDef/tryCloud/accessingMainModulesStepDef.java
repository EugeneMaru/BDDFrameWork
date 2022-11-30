package com.BDDFrameWork.stepDef.tryCloud;

import com.BDDFrameWork.utilities.ConfigurationReader;
import com.BDDFrameWork.utilities.Driver;
import com.BDDFrameWork.utilities.tryCloud.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class accessingMainModulesStepDef {

    Login login = new Login();

    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        login.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(io.cucumber.datatable.DataTable dataTableMainModules) throws InterruptedException {
        List<WebElement> menuModulesList = new ArrayList<>(Driver.getDriver().findElements(By.xpath("//li[@tabindex='-1']")));
        System.out.println(menuModulesList);
        for (WebElement each : menuModulesList) {
            each.click();
            Thread.sleep(1000);
            Assert.assertTrue(Driver.getDriver().getTitle().contains(each.getText()));
            Driver.getDriver().navigate().back();
            Thread.sleep(1000);
        }
    }

}
