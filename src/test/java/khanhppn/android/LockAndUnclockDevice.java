package khanhppn.android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class LockAndUnclockDevice {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        ((AndroidDriver) driver).lockDevice();
        System.out.println(((AndroidDriver<?>) driver).isDeviceLocked());
        ((AndroidDriver<?>) driver).unlockDevice();


    }

}
