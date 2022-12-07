package appium;

import appium.android.CreateDriverSession;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;
import io.appium.java_client.android.appmanagement.AndroidTerminateApplicationOptions;
import org.openqa.selenium.By;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class interactWithApps {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        driver.findElement(views).click();

        runAppInBackground(driver);
    }

    public static void terminateApp(AppiumDriver driver) throws InterruptedException {
        Thread.sleep(5000);
         driver.terminateApp("io.appium.android.apis");
    }

    public static void installApp(AppiumDriver driver){
        String andAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
        driver.installApp(andAppUrl, new AndroidInstallApplicationOptions().withReplaceEnabled());
    }

    public static void checkAppInstalled(AppiumDriver driver){
        System.out.println(driver.isAppInstalled("io.appium.android.apis"));
    }

    public static void runAppInBackground(AppiumDriver driver) throws InterruptedException {
        Thread.sleep(5000);
        driver.runAppInBackground(Duration.ofMillis(5000));
    }





}
