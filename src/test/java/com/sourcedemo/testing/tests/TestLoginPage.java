package com.sourcedemo.testing.tests;

import com.sourcedemo.testing.pages.LoginPage;
import com.sourcedemo.testing.utils.PropertyReader;
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
        loginPage.setUserName(propertyReader.getUserName()).setPassword("").clickLogin();
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
        loginPage.setUserName(LoginPage.PROBLEM_USER).setPassword(propertyReader.getPassword()).clickLogin();
        Assert.assertEquals(productsListPage.getPageTitle(), "PRODUCTS");
    }

    @Test
    public void testEmptyUserName(){
        loginPage.openPage();
        loginPage.setUserName("").setPassword(propertyReader.getPassword()).clickLogin();
        Assert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required");
    }
}
