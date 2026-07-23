package com.demo.sdet.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demo.sdet.config.ConfigReader;
import com.demo.sdet.driver.DriverFactory;
import java.time.Duration;

public class BaseTest {

	@BeforeMethod
	public void setUp() {

	    DriverFactory.initializeDriver();

	    DriverFactory.getDriver().get(
	            ConfigReader.getProperty("baseUrl"));

	    DriverFactory.getDriver().manage().timeouts().implicitlyWait(
	            Duration.ofSeconds(
	                    Long.parseLong(
	                            ConfigReader.getProperty("implicitWait"))
	            ));

	}
    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();

    }

}