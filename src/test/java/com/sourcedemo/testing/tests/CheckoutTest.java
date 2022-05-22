package com.sourcedemo.testing.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {
    @Test
    public void testCancelButton() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsListPage.clickCart();
        yourCartPage.clickCheckoutButton();
        checkoutPage.clickCancelButton();
        Assert.assertEquals(yourCartPage.getCartTitle(), "YOUR CART");
    }

    @Test
    public void testContinueButton() {
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsListPage.clickCart();
        yourCartPage.clickCheckoutButton();
        checkoutPage.setFirstName("firstname");
        checkoutPage.setLastName("lastname");
        checkoutPage.setZipCode("12345");



    }
}
