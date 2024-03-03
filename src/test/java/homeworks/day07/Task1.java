package homeworks.day07;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        WebElement jsAlert = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
        jsAlert.click();
        Thread.sleep(1000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert =driver.switchTo().alert();
        alert.accept();


        WebElement jsConfirm = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        jsConfirm.click();
        Thread.sleep(1000);

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait2.until(ExpectedConditions.alertIsPresent());
        Alert alert2 =driver.switchTo().alert();
        alert2.accept();

        WebElement jsPrompt= driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
        jsPrompt.click();
        Thread.sleep(1000);

        driver.switchTo().alert().sendKeys("js prompt");

        driver.switchTo().alert().accept();



    }
}
