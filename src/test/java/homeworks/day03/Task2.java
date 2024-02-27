package homeworks.day03;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class Task2 {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver= new ChromeDriver();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        // Click on Locators - Find By Playground Test Page
        driver.findElement(By.partialLinkText("Locators - Find")).click();

        // Print the URL
        String url1 = driver.getCurrentUrl();
        System.out.println("url1 = " + url1);

        // Navigate back
        driver.navigate().back();

        // Print the URL
        String url2 = driver.getCurrentUrl();
        System.out.println("url2 = " + url2);

        // Click on WebDriver Example Page
        driver.findElement(By.id("webdriverexamplepage")).click();

        // Print the URL
        String url3 = driver.getCurrentUrl();
        System.out.println("url3 = " + url3);

        // Enter value 🡪 20 and Enter to "Enter Some Numbers inputBox"
        driver.findElement(By.xpath("//input[@name]")).sendKeys("20"+ Keys.ENTER);
        // And then verify 'two, zero' message is displayed on page
        boolean isMessageIsDisplay=driver.findElement(By.id("message")).isDisplayed();
        Assert.assertTrue(isMessageIsDisplay);
    }
    @After
    public void tearDown() {
        // Close the browser after all searches are performed
        driver.quit();}
}
