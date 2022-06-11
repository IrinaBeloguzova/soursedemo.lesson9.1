package com.sourcedemo.testing.pages;

import com.sourcedemo.testing.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    PropertyReader reader= new PropertyReader();

    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector(".error-message-container.error");

    //public static final String STANDARD_USERNAME = ;
    //public static final String DEFAULT_PASSWORD = "secret_sauce";
    public static final String PROBLEM_USER = "problem_user";

    public LoginPage setUserName(String userName) {
        driver.findElement(userNameField).sendKeys(userName);
        return this;
    }

    public LoginPage setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public WebElement getLoginButton() {

        return driver.findElement(loginButton);
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
    public void openPage() {
        driver.get(reader.getProperty("login.url"));
    }

    public ProductsListPage clickLogin() {
        getLoginButton().click();
        return new ProductsListPage(driver);
    }

    public ProductsListPage loginWithStandardUser() {
        return login(reader.getUserName(), reader.getPassword());
    }

    public ProductsListPage login(String username, String password) {
        setUserName(username);
        setPassword(password);
        return clickLogin();
    }
}
