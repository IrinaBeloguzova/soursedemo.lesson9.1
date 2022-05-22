package com.sourcedemo.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsListPage extends BasePage {
    private By title = By.className("title");
    private By cart= By.id("shopping_cart_container");

    public ProductsListPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return driver.findElement(title).getText();

    }

    public WebElement getCart() {
        return driver.findElement(cart);
    }

    public ProductsListPage clickCart() {
        getCart().click();
        return new ProductsListPage(driver);
    }
}
