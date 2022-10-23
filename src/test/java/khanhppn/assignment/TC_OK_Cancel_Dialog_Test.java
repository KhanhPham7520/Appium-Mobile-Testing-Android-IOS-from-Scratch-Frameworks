package khanhppn.assignment;

import io.appium.java_client.AppiumBy;
import khanhppn.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_OK_Cancel_Dialog_Test extends BaseTest {

//    @BeforeMethod
//    public void navigateToViews(){
//        driver.findElement(AppiumBy.accessibilityId("App")).click();
//    }

    @Test
    public void testDialogTestAfterClickOK(){
        Assert.assertFalse(driver.findElement(AppiumBy.id("android:id/alertTitle")).isDisplayed());
    }

    @Test
    public void testDialogTestAfterClickCancel(){
        System.out.println("testDialogTestAfterClickCancel");
    }
}
