package com.sourcedemo.testing.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class YourCartTest extends BaseTest {
    @Test
    public void testContinueShopping() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsListPage.clickCart();
        yourCartPage.clickContinueShopping();
        Assert.assertEquals(productsListPage.getPageTitle(), "PRODUCTS");
    }
    @Test
    public void testCheckoutButton() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsListPage.clickCart();
        yourCartPage.clickCheckoutButton();
        Assert.assertEquals(checkoutPage.getCheckoutTitle(), "CHECKOUT: YOUR INFORMATION");
    }
}
