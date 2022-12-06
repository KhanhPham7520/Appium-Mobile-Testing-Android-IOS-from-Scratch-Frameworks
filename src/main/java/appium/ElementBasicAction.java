package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;


public class ElementBasicAction {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("Android");

        By views = MobileBy.AccessibilityId("Views");
    }
}
