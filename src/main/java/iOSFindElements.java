import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class iOSFindElements {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("iOS");

        MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Activity Indicators");
        System.out.println(myElement.getText());
    }
}
