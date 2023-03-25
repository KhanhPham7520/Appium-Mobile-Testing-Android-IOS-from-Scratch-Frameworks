package khanhppn.iOS;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class iOS_CreateDriverSession {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 11 Pro");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        caps.setCapability(MobileCapabilityType.UDID,"00008030-001571C62688802E");
        caps.setCapability("xcodeOrgId","L8T9J4R323");
        caps.setCapability("xcodeSigningId","iPhone Developer");
        caps.setCapability("bundleId","");

        String appUrl = "/Volumes/KhanhData/Udemy_course/src/test/resources/app/saucelab-2.7.1.ipa";

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AppiumDriver driver = new IOSDriver(url, caps);

    }
}
