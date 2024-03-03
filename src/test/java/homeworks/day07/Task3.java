package homeworks.day07;


    import org.junit.AfterClass;
    import org.junit.Assert;
    import org.junit.BeforeClass;
    import org.junit.Test;
    import org.openqa.selenium.*;
    import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.FluentWait;
    import org.openqa.selenium.support.ui.Wait;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.time.Duration;

public class Task3 {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }
    @Test
    public void test(){

        //click on "Click me, to Open an alert after 5 seconds" button

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();

        // Wait for the alert to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to the alert and accept it
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //click on "Change Text to Selenium Webdriver"
        WebElement ChangeText =  driver.findElement(By.id("populate-text"));
        ChangeText.click();

        //verify "Selenium Webdriver" message is displayed
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait2.until(ExpectedConditions.textToBePresentInElementLocated(By.id("h2"), "Selenium Webdriver"));

        Assert.assertTrue(driver.findElement(By.id("h2")).getText().equals("Selenium Webdriver"));

        //click on "Display button after 10 seconds" button
        WebElement DisplayButton =  driver.findElement(By.id("display-other-button"));
        DisplayButton.click();

        //verify the button is displayed
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("hidden")) );

        //click on "Enable button after 10 seconds" button
        WebElement EnableButton =  driver.findElement(By.id("enable-button"));
        EnableButton.click();

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait4.until(ExpectedConditions.presenceOfElementLocated(By.id("disable")));


        }
    }


