package com.demo.sdet.tests;

import org.testng.annotations.Test;

import com.demo.sdet.base.BaseTest;
import com.demo.sdet.driver.DriverFactory;

public class LoginTest extends BaseTest {


    @Test
    public void openApplication() {

        DriverFactory.getDriver()
                .get("https://www.saucedemo.com");


    }

}