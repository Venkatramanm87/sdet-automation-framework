package com.demo.sdet.serenity.steps;

import com.demo.sdet.driver.DriverFactory;
import com.demo.sdet.pages.DashboardPage;
import com.demo.sdet.pages.LoginPage;

import io.cucumber.java.en.*;

import io.cucumber.java.en.*;

import org.junit.Assert;


public class LoginSteps {


    private LoginPage loginPage;
    private DashboardPage dashboardPage;


    @Given("user launches the application")
    public void launchApplication() {

        DriverFactory.getDriver()
                .get("https://www.saucedemo.com/");


        loginPage =
            new LoginPage(
                DriverFactory.getDriver()
            );
    }


    @When("user logs in with username {string} and password {string}")
    public void login(
            String username,
            String password) {

        dashboardPage =
            loginPage.login(
                username,
                password
            );
    }


    @Then("products page should be displayed")
    public void verifyProductsPage() {


    	Assert.assertTrue(
    	        "Products page was not displayed after login",
    	        dashboardPage.isProductsDisplayed()
    	);

    }

}