package khanhppn.lesson;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import khanhppn.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class Lesson_39_Drag_And_Drop_Gesture extends BaseTest {

    @Test
    public void dragAndDropTest() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        WebElement source = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) source).getId(),
                "endX", 619,
                "endY", 510
        ));
        Thread.sleep(3000);
    }

}
