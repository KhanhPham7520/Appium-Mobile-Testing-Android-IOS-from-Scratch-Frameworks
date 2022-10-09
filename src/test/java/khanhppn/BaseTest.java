package khanhppn;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void configureApp() throws MalformedURLException {
        String appUrl = "/Users/khanhpham/Appium_Project/src/test/java/resources/ApiDemos-debug.apk";

        service = new AppiumServiceBuilder()
                .withAppiumJS(new File(
                        "/Users/khanhpham/node_modules/appium/node_modules/es6-mapify/build/lib/main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("KhanhPPN_Device");
        options.setApp(appUrl);

        //AndroidDriver, iOS Driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        service.stop();
    }
}
