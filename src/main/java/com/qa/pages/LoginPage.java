package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseTest {
    private static AppiumDriver driver;

    @AndroidFindBy(accessibility = "test-Username")
    private MobileElement usernameTxtbox;

    @AndroidFindBy(accessibility = "test-Password")
    private MobileElement passwordTxtbox;

    @AndroidFindBy(accessibility = "test-LOGIN")
    private MobileElement loginBtn;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Error message']/android.widget.TextView")
    private MobileElement errorMsg;

    public LoginPage enterUsername(String username){
        sendKeys(usernameTxtbox, username);
        return this;
    }

    public LoginPage enterPassword(String password){
        sendKeys(passwordTxtbox, password);
        return this;
    }

    public ProductPage pressLoginBtn(){
        click(loginBtn);
        return new ProductPage();
    }

    public String getErrTxt(){
        return getAttribute(errorMsg, "text");
    }




}
