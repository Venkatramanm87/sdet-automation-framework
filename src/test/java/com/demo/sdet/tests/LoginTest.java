package com.demo.sdet.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.demo.sdet.base.BaseTest;
import com.demo.sdet.dataprovider.LoginDataProvider;
import com.demo.sdet.driver.DriverFactory;
import com.demo.sdet.model.LoginData;
import com.demo.sdet.pages.DashboardPage;
import com.demo.sdet.pages.LoginPage;
import com.demo.sdet.reports.TestListener;


@Listeners(TestListener.class)
public class LoginTest extends BaseTest {


    @Test(
        dataProvider = "loginData",
        dataProviderClass = LoginDataProvider.class
    )
    public void verifyLogin(LoginData loginData) {


        LoginPage loginPage =
                new LoginPage(DriverFactory.getDriver());


        DashboardPage dashboardPage =
        		loginPage.login(
                loginData.getUsername(),
                loginData.getPassword()
        );
        Assert.assertTrue(
                dashboardPage.isProductsDisplayed(),
                "Products page was not displayed after login"
        );
    }

}