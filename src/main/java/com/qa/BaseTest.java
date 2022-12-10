package com.qa;

import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class BaseTest {
    protected AppiumDriver driver;
    protected Properties props;
    InputStream inputStream;

    public BaseTest(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Parameters({"platformName","platformVersion","deviceName"})
    @BeforeTest
    public void beforeTest(String platformName, String platformVersion, String deviceName) throws Exception {
        props = new Properties();
        String propFileName = "src/test/resource/config.properties";
        inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        props.load(inputStream);

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("newCommandTimeout", 300);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//        String andAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
//                + File.separator + "resources" + File.separator + "app/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";
        URL appUrl = getClass().getClassLoader().getResource(props.getProperty("androidAppLocation"));
        caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
        caps.setCapability(MobileCapabilityType.APP, appUrl);
        caps.setCapability("appActivity", props.getProperty("androidAppActivity"));

        URL url = new URL(props.getProperty("appiumURL"));
        driver = new AndroidDriver(url, caps);
        String sessionId = driver.getSessionId().toString();
    }

    public void waitForElementVisibility(MobileElement e){
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.invisibilityOf(e));
    }

    public void click(MobileElement e){
        waitForElementVisibility(e);
        e.click();
    }

    public void sendKeys(MobileElement e, String inputChar){
        waitForElementVisibility(e);
        e.sendKeys(inputChar);
    }

    public String getAttribute(MobileElement e, String attribute){
        waitForElementVisibility(e);
        return e.getAttribute(attribute);
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
