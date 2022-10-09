package khanhppn;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AppiumPractice extends BaseTest {

    @Test
    public void AppiumTest() throws MalformedURLException {
        //Actual Information
        //xpath, id, accessbilityId, classname, androidUIAutomator
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Text']")).click();

    }
}
