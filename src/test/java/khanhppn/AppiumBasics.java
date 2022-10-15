package khanhppn;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppiumBasics extends BaseTest {

    @Test
    public void TestClickApp() throws MalformedURLException {
        //Actual Information
        //xpath, id, accessbilityId, classname, androidUIAutomator
      //  driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.accessibilityId("App"));
    }

    @Test
    public void testWifiSettingName() {
        //Actual Information
        //xpath, id, accessbilityId, classname, androidUIAutomator, tagName[@attribute]
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.className("android.widget.RelativeLayout")).click();


        //tagName[@attribute] -> //tagName
        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();

        Assert.assertEquals(alertTitle,"WiFi settings");

        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Rahul Wifi");
        driver.findElement(AppiumBy.id("android:id/button1")).click();
    }

}
