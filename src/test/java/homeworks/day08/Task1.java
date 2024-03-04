package homeworks.day08;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;
public class Task1 extends TestBase {
    @Test
    public void test() {
        // Go to URL: http://demo.guru99.com/test/guru99home/
        driver.get("http://demo.guru99.com/test/guru99home/");

        // Find the number of iframes on the page
        List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
        System.out.println("Number of iframes on the page: " + iframe.size());

        // Link to the third iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
        driver.switchTo().frame(2);
        //driver.findElement(By.linkText("JMeter Made Easy")).click();

        // Exit the iframe and return to the main page.
        driver.switchTo().defaultContent();
    }
}