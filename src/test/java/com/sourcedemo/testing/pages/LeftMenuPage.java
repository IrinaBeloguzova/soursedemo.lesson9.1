package com.sourcedemo.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftMenuPage extends BasePage {
    public LeftMenuPage (WebDriver driver) {
        super(driver);
    }
    public By leftMenu= By.id("react-burger-menu-btn");
    public By logout = By.id("logout_sidebar_link");

    public WebElement getLeftMenu() {
        return driver.findElement(leftMenu);
    }
    public WebElement getLogout() {
        return driver.findElement(logout);
    }
    public LeftMenuPage clickLeftMenu() {
        getLeftMenu().click();
        return new LeftMenuPage(driver);
    }
    public LeftMenuPage clickLogout() {
        getLogout().click();
        return new LeftMenuPage(driver);
    }
}
