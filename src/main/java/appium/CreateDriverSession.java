package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class CreateDriverSession {
    public static AppiumDriver initilizeDriver(String platformName) throws Exception{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        caps.setCapability("newCommandTimeout", 300);

        URL url = new URL("http://0.0.0.0:4723/");

        switch (platformName) {
            case "Android":
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "KhanhPham");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                caps.setCapability("newCommandTimeout", 300);
                String andAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
                caps.setCapability(MobileCapabilityType.APP, andAppUrl);
                return new AndroidDriver(url, caps);
            case "iOS":
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                caps.setCapability(MobileCapabilityType.UDID, "FAD8F7D6-E79D-4ECE-B791-63CB1285CFA8");
                String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";
                caps.setCapability(MobileCapabilityType.APP, iOSAppUrl);
              //  caps.setCapability("bundleId","com.apple.Maps");
                return new IOSDriver(url, caps);
                default :
            throw new Exception("Invalid platform");
        }
    }

}
