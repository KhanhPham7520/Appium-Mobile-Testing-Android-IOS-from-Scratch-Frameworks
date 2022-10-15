package khanhppn.exercise;

import io.appium.java_client.AppiumBy;
import khanhppn.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic_01_Assertion_Get_Locator extends BaseTest {

    @Test
    public void testMenuLabelAppearCorrectly() {
        String actualAccessibilityLbl = driver.findElement(AppiumBy.accessibilityId("Accessibility")).getText();
        Assert.assertEquals(actualAccessibilityLbl, "Accessibility");
    }

}
