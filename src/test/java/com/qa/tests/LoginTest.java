package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage;
    ProductPage productPage;

    @BeforeMethod
    public void beforeMethod(){
        loginPage = new LoginPage();
    }

    @AfterMethod
    public void afterMethod(){

    }

    @Test
    public void invalidUserName(){
        loginPage.enterUsername("invalidusername");
        loginPage.enterPassword("secret_sauce");
        productPage = loginPage.pressLoginBtn();
        Assert.assertEquals(loginPage.getErrTxt(),
                "Username and password do not match any user in this service.");
    }
}
