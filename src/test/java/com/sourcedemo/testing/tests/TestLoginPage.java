package com.sourcedemo.testing.tests;

import com.sourcedemo.testing.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest {
    @Test
    public void testSuccessLogin(){
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        Assert.assertEquals(productsListPage.getPageTitle(), "PRODUCTS");
    }

    @Test
    public void testEmptyPassword(){
        loginPage.openPage();
        loginPage.setUserName(LoginPage.STANDARD_USERNAME).setPassword("").clickLogin();
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Password is required");
    }
    @Test
    public void testFailedLogin(){
        loginPage.openPage();
        loginPage.login("nouser", "nopassword");
        Assert.assertEquals(loginPage.getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void testProblemUser(){
        loginPage.openPage();
        loginPage.setUserName(LoginPage.PROBLEM_USER).setPassword(LoginPage.DEFAULT_PASSWORD).clickLogin();
        Assert.assertEquals(productsListPage.getPageTitle(), "PRODUCTS");
    }

    @Test
    public void testEmptyUserName(){
        loginPage.openPage();
        loginPage.setUserName("").setPassword(LoginPage.DEFAULT_PASSWORD).clickLogin();
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }
}
