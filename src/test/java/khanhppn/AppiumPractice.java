package khanhppn;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumPractice {
    @Test
    public void AppiumTest() throws MalformedURLException {
        String appUrl = "/Users/khanhpham/Appium_Project/src/test/java/resources/ApiDemos-debug.apk";

        AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(new File(
                        "/Users/khanhpham/node_modules/appium/node_modules/es6-mapify/build/lib/main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("KhanhPPN_Device");
        options.setApp(appUrl);

        //AndroidDriver, iOS Driver
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);


        //Actual Information
        //xpath, id, accessbilityId, classname, androidUIAutomator
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Text']")).click();

        driver.quit();
        service.stop();
    }
}
