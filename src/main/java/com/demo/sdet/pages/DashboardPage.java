package com.demo.sdet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {


    private By productsTitle =
            By.xpath("//span[contains(text(),'Products')]");


    public DashboardPage(WebDriver driver) {

        super(driver);

    }


    public boolean isProductsDisplayed() {

        return isDisplayed(productsTitle);

    }

}