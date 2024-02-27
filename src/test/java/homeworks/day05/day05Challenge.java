package homeworks.day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class day05Challenge {
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterClass
    public static void tearDown() {
        //driver.quit();
    }

    @Test
    public void Test(){
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
        Assert.assertEquals("To-Do List", driver.getTitle());

        driver.findElement(By.xpath("/html/body/div/input")).sendKeys("first"+ Keys.ENTER);
        WebElement deleteButton = driver.findElement(By.xpath("/html/body/div/ul/li[1]/span/i"));
        deleteButton.click();


    }
}
