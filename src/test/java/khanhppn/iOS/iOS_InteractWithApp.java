package khanhppn.iOS;

import khanhppn.android.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class iOS_InteractWithApp {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("iOS");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Activity Indicators");
        driver.findElement(views).click();

        Thread.sleep(5000);
        terminateApp(driver);
    }

    public static void terminateApp(AppiumDriver driver){
        driver.terminateApp("com.example.apple-samplecode.UICatalog");
    }

    public static void installApp(AppiumDriver driver){
        String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "app/UIKitCatalog-iphonesimulator.app";
    }

}
