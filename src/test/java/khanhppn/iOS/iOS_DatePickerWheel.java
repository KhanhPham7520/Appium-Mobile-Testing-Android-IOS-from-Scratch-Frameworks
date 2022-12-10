package khanhppn.iOS;

import khanhppn.android.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class iOS_DatePickerWheel {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("iOS");
        pickerWheelPrevious(driver);
    }

    public static void pickerWheelNext(AppiumDriver driver){
        driver.findElementByAccessibilityId("PickerViewController").click();

        boolean flag = false;

        JavascriptExecutor js = (JavascriptExecutor) driver;

        while (!flag) {
            WebElement readPickerWheel = driver.findElementByAccessibilityId("Red color component value");

            Map<String, Object> params = new HashMap<>();
            params.put("order", "next");
            params.put("offset", 0.15);
            params.put("element", ((RemoteWebElement) readPickerWheel).getId());
            js.executeScript("mobile: selectPickerWheelValue", params);
        if(readPickerWheel.getText().equals("90")){
            flag = true;
        }
        }
    }

    public static void pickerWheelPrevious(AppiumDriver driver){
        driver.findElementByAccessibilityId("PickerViewController").click();

        boolean flag = false;

        JavascriptExecutor js = (JavascriptExecutor) driver;

        while (!flag) {
            WebElement readPickerWheel = driver.findElementByAccessibilityId("Blue color component value");

            Map<String, Object> params = new HashMap<>();
            params.put("order", "previous");
            params.put("offset", 0.15);
            params.put("element", ((RemoteWebElement) readPickerWheel).getId());
            js.executeScript("mobile: selectPickerWheelValue", params);
        if(readPickerWheel.getText().equals("50")){
            flag = true;
        }
        }
    }
}
