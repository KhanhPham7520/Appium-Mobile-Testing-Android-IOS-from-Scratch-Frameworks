package khanhppn.assignment;

import io.appium.java_client.AppiumBy;
import khanhppn.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Exercise extends BaseTest {



    @Test
    public void verifyDialogWithMessageDisplaySuccessfully() {
        Assert.assertTrue(
                driver.findElement(AppiumBy.id("io.appium.android.apis:id/two_buttons")).isDisplayed());
    }

    @Test
    public void verifyCancelDialogWithMessageDisplaySuccessfully() {
        Assert.assertTrue(
                driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).isDisplayed());
    }

}
