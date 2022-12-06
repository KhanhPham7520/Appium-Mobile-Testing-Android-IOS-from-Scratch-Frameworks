import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class AndroidGestures {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("Android");
        scrollGesture(driver);
    }

    public static void clickGesture(AppiumDriver driver){
        WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']"));
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
           "elementId",((RemoteWebElement) element).getId()
        ));
    }
    public static void dragAndDropGesture(AppiumDriver driver){
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Drag and Drop']")).click();

        WebElement element = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement) element).getId(),
                "endX", 649, "endY", 100
        ));
    }

    public static void swipeGesture(AppiumDriver driver){
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Gallery']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Photos']")).click();

        WebElement element = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Gallery/android.widget.ImageView[1]"));

        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement) element).getId(),
                "direction", "left",
                "percent", 0.75
        ));
    }

    public static void scrollGesture(AppiumDriver driver){
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']")).click();
        boolean canScrollMore = (boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(

                "direction","down",
                "percent",1.0
        ));
    }

}
