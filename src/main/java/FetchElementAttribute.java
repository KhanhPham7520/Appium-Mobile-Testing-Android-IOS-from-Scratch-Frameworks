import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FetchElementAttribute {
    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateDriverSession.initilizeDriver("Android");

        By accesssibility = MobileBy.AccessibilityId("Accessibility");
        System.out.println("Text : "+ driver.findElement(accesssibility).getText());
        System.out.println("long-clickable Attribute : "+ driver.findElement(accesssibility).getAttribute("long-clickable"));
        System.out.println("Displayed Attribute : "+ driver.findElement(accesssibility).getAttribute("displayed"));
        System.out.println("Selected : "+ driver.findElement(accesssibility).isSelected());
        System.out.println("Enabled : "+ driver.findElement(accesssibility).isEnabled());
        System.out.println("Displayed : "+ driver.findElement(accesssibility).isDisplayed());
    }
}
