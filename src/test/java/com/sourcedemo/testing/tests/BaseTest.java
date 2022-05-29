package com.sourcedemo.testing.tests;

import com.sourcedemo.testing.pages.*;
import com.sourcedemo.testing.utils.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected LoginPage loginPage;
    protected ProductsListPage productsListPage;
    protected LeftMenuPage leftMenuPage;
    protected YourCartPage yourCartPage;
    protected CheckoutPage checkoutPage;
    protected PropertyReader propertyReader;
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        productsListPage = new ProductsListPage(driver);
        leftMenuPage = new LeftMenuPage(driver);
        yourCartPage = new YourCartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        propertyReader = new PropertyReader();
    }

    @AfterMethod(alwaysRun=true)
    public void closeBrowser() {
        driver.quit();
    }
}
