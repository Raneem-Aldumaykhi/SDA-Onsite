package homeworks.day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Task1 {

    /*Task 1:
Go to URL: https://demoqa.com/radio-button
Verify whether all 3 options given to the question can be selected.
When each option is selected, print the following texts on the console.*/
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //Go to URL: https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");

    }

    @AfterClass
    public static void tearDown() {
        // driver.quit();
    }
@Test
    public void radButtonTest() throws InterruptedException {

        //Then click on the radio buttons.
        List<WebElement> radButtons=driver.findElements(By.xpath("//input[@name='like']"));

    for (WebElement button: radButtons){
        button.click();
        assertTrue(button.isSelected());
        Thread.sleep(1000);
}}}
