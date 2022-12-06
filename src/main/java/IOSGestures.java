import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class IOSGestures {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("iOS");
        scrollDownGesture(driver);
    }

    public static void swipeGesture(AppiumDriver driver){
        WebElement element = driver.findElementByAccessibilityId("Activity Indicators");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "up");
        params.put("element", ((RemoteWebElement) element).getId());
        js.executeScript("mobile: swipe", params);
    }
    public static void scrollUpGesture(AppiumDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "up");
        js.executeScript("mobile: scroll", params);
    }
    public static void scrollDownGesture(AppiumDriver driver){
        WebElement childElement = driver.findElementByAccessibilityId("Web View");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("element",((RemoteWebElement)childElement).getId());
       // params.put("direction", "down");
        params.put("toVisible", true); // scroll until element is presence on UI
        js.executeScript("mobile: scroll", params);
    }
}
