package khanhppn.iOS;

import khanhppn.android.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class iOS_TouchAndHold {
    public static void main(String[] args) throws Exception {
            AppiumDriver driver = CreateDriverSession.initilizeDriver("iOS");
            touchAndHold(driver);
        }


    public static void touchAndHold(AppiumDriver driver) {
        driver.findElementByAccessibilityId("Steppers").click();

        WebElement element = driver.findElementByAccessibilityId("");

        Map<String, Object> params = new HashMap<>();
        params.put("elementId",((RemoteWebElement)element).getId());
        params.put("duration",5);
        driver.executeScript("mobile: touchAndHold", params);
}
}

