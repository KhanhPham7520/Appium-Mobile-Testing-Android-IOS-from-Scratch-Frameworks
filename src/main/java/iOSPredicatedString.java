import io.appium.java_client.AppiumDriver;

public class iOSPredicatedString {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("iOS");

        //MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Activity Indicators");
       // MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Activity Indicators");
        driver.findElementByAccessibilityId("Alert Views").click();
    }
}
