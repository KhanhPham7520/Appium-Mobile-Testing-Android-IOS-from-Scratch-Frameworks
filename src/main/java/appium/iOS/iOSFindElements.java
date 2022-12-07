package appium.iOS;

import appium.android.CreateDriverSession;
import io.appium.java_client.AppiumDriver;

public class iOSFindElements {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("iOS");

        //MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Activity Indicators");

    }
}
