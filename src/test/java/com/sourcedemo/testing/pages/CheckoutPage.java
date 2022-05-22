package com.sourcedemo.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    private By title = By.className("title");
    private By cancelButton = By.id("cancel");
    private By continueButton = By.id("continue");
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By zipCodeField = By.id("postal-code");

    public CheckoutPage setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    }
    public CheckoutPage setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    }
    public CheckoutPage setZipCode(String zipCode) {
        driver.findElement(zipCodeField);
        return this;
    }

    public String getCheckoutTitle() {
        return driver.findElement(title).getText();
    }
    public WebElement getCancelButton() {
        return driver.findElement(cancelButton);
    }
    public WebElement getContinueButton() {
        return driver.findElement(continueButton);
    }
    public CheckoutPage clickCancelButton() {
        getCancelButton().click();
        return new CheckoutPage(driver);
    }
    public CheckoutPage clickContinueButton() {
        getContinueButton().click();
        return new CheckoutPage(driver);
    }
}
