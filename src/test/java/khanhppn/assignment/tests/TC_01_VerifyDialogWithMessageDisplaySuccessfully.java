package khanhppn.assignment.tests;

import io.appium.java_client.AppiumBy;
import khanhppn.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_VerifyDialogWithMessageDisplaySuccessfully extends BaseTest {

    @Test
    public void testVerifyDialogWithMessageDisplaySuccessfully() {
        driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
        Assert.assertTrue(driver.findElement(AppiumBy.id("android:id/alertTitle")).isDisplayed(),
                "ERR - The title should be appeared");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='OK']")).click();
    }

}


