package com.BDDFrameWork.stepDef.libraryApp;

import com.BDDFrameWork.utilities.tryCloud.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class us5_borrowedBooksStatistics_StepDef {

    Login login = new Login();

    @Given("Establish the database connection")
    public void establish_the_database_connection() {

    }
    @When("I execute query to find most popular book genre")
    public void i_execute_query_to_find_most_popular_book_genre() {

    }
    @Then("verify {string} is the most popular book genre.")
    public void verify_is_the_most_popular_book_genre(String string) {

    }
}