package com.qa.pages;

import com.qa.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;

public class ProductPage extends BaseTest {
    private static AppiumDriver driver;

    @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'PRODUCTS')]")
    private MobileElement productTitle;


    public String getTitle(){
        return getAttribute(productTitle,"text");
    }

}
