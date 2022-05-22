package com.sourcedemo.testing.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void testLogout(){
        loginPage.openPage();
        loginPage.loginWithStandardUser();
        leftMenuPage.clickLeftMenu();
        leftMenuPage.clickLogout();
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
    }
}
