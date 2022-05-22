package com.sourcedemo.testing.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsListTest extends BaseTest {
    @Test
    public void testCart(){
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        productsListPage.clickCart();
        Assert.assertEquals(yourCartPage.getCartTitle(), "YOUR CART");

    }
}
