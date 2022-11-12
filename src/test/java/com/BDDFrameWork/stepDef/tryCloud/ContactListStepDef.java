package com.BDDFrameWork.stepDef.tryCloud;

import com.BDDFrameWork.pages.tryCloud.ContactListPage;
import com.BDDFrameWork.utilities.ConfigurationReader;
import com.BDDFrameWork.utilities.Driver;
import com.BDDFrameWork.utilities.tryCloud.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactListStepDef {

    Login login = new Login();
    ContactListPage contactListPage = new ContactListPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        login.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        Thread.sleep(1000);
    }

    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {
        contactListPage.contactsMenu.click();
    }

    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {

      Assert.assertTrue(Integer.parseInt(contactListPage.numberOfContacts.getText()) > 2);
    }
}
