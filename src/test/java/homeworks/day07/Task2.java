package homeworks.day07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task2 {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        String username = "admin";
        String password = "admin";
        String url = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";
        Thread.sleep(1000);



        String expectedUrl = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("authentication successful", expectedUrl, actualUrl);





    }
}
