package khanhppn.learning.Topic_01_Gesture;

import io.appium.java_client.AppiumBy;
import khanhppn.BaseTest;
import org.testng.annotations.Test;

import static java.time.Duration.ofSeconds;

public class AppiumGesture extends BaseTest {

    @Test
    public void testScrollGestureDemo() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.
                androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TestSwitcher\"));"));
        Thread.sleep(2000);
    }


}
