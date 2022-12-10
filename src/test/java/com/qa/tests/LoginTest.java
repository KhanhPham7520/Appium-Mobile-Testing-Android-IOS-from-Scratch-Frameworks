package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductPage;
import org.testng.annotations.*;

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
        loginPage.enterPassword("invalidusername");
        loginPage.enterPassword("secret_sauce");
        productPage = loginPage.pressLoginBtn();
    }
}
