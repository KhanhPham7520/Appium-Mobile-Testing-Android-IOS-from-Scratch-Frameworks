import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import org.openqa.selenium.WebElement;

public class iOSPredicatedString {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("iOS");

        //MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Activity Indicators");
       // MobileElement myElement = (MobileElement) driver.findElementByAccessibilityId("Activity Indicators");
        driver.findElementByAccessibilityId("Alert Views").click();
    }
}
