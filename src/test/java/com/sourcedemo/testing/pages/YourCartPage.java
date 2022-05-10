package com.sourcedemo.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCartPage extends BasePage {
    public YourCartPage (WebDriver driver) {
        super(driver);
    }
    private By title = By.className("title");
    private By continueShopping = By.id("continue-shopping");
    private By checkoutButton = By.id("checkout");

    public String getCartTitle() {
        return driver.findElement(title).getText();
    }
    public WebElement getContinueShopping() {

        return driver.findElement(continueShopping);
    }
    public WebElement getCheckoutButton() {
        return driver.findElement(checkoutButton);
    }
    public YourCartPage clickContinueShopping() {
        getContinueShopping().click();
        return new YourCartPage(driver);
    }
    public YourCartPage clickCheckoutButton() {
        getCheckoutButton().click();
        return new YourCartPage(driver);
    }
}
