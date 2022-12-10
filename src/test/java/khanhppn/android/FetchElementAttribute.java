package khanhppn.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FetchElementAttribute {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("Android");

        By accesssibility = MobileBy.AccessibilityId("Accessibility");
    }
}
