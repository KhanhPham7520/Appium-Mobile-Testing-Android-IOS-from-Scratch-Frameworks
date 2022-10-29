package General_Store.tests;

import General_Store.BaseGeneralStore;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class TC_01 extends BaseGeneralStore {

    @Test
    public void testProductScreenDisplayedSuccessfully() {
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        scrollToAnElementByText(driver, "Belarus");
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Belarus']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter name here']"))
                .sendKeys("Pham Phan Nhat Khanh");
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    }
}
