package khanhppn.lesson;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionForIOS {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 14");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        caps.setCapability(MobileCapabilityType.UDID,"FAD8F7D6-E79D-4ECE-B791-63CB1285CFA8");
        String appUrl = System.getProperty("user.dir")+ File.separator + "src" + File.separator +"main"
                + File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";
        caps.setCapability(MobileCapabilityType.APP, appUrl);

        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new IOSDriver(url, caps);
    }
}
