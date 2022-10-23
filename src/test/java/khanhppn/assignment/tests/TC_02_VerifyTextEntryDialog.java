package khanhppn.assignment.tests;

import io.appium.java_client.AppiumBy;
import khanhppn.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_02_VerifyTextEntryDialog extends BaseTest {

    @Test
    public void testVerifyTextEntryDialogDisplaySuccessfully() {
        String username = "Khanh Pham";
        String password = "12345";

        driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
        driver.findElement(AppiumBy.id("io.appium.android.apis:id/username_edit"))
                .sendKeys(username);
        driver.findElement(AppiumBy.id("io.appium.android.apis:id/password_edit"))
                .sendKeys(password);
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='OK']")).click();
        driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();

        Assert.assertEquals(driver.findElement(AppiumBy.id("io.appium.android.apis:id/username_edit")).getText(),
                username);
    }
}
