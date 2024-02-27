package homeworks.day03;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task1 {
    static WebDriver driver;
    By searchBox = By.name("q");
    By results = By.id("result-stats");



    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void greenMailTest() {
        driver.get("https://www.google.com/");
        driver.findElement(searchBox).sendKeys("Green Mile"+ Keys.ENTER);
        String totalResult =driver.findElement(results).getText();
        System.out.println("total result = " +totalResult);
    }

    @Test
    public void Premonition() {
        driver.get("https://www.google.com/");
        driver.findElement(searchBox).sendKeys("Premonition"+ Keys.ENTER);
        String totalResult =driver.findElement(results).getText();
        System.out.println("total result = " +totalResult);
    }


    @After
    public void tearDown() {
        // Close the browser after all searches are performed
        driver.quit();
    }
}
