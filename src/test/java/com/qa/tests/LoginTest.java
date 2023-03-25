package com.qa.tests;

import com.qa.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductPage;
import org.aspectj.apache.bcel.classfile.Method;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    LoginPage loginPage;
    ProductPage productPage;

    @BeforeMethod
    public void beforeMethod(Method m){
        loginPage = new LoginPage();
        System.out.println("\n" + "**** Starting Test ****" + m.getName());
    }



    @Test
    public void invalidUserName() {
        loginPage.enterUsername("invalidusername");
        loginPage.enterPassword("secret_sauce");
        productPage = loginPage.pressLoginBtn();
        Assert.assertEquals(loginPage.getErrTxt(),
                "Username and password do not match any user in this service.");
    }

    @Test
    public void verifyStandardUser() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        productPage = loginPage.pressLoginBtn();

        Assert.assertEquals(productPage.getProductTitle(),"PRODUCTS");

    }


    //invalid password
    @Test
    public void invalidPassword() {
        loginPage.enterUsername("invalidusername");
        loginPage.enterPassword("1234546");
        productPage = loginPage.pressLoginBtn();
        Assert.assertEquals(loginPage.getErrTxt(),
                "Username and password do not match any user in this service.");
    }
}
