package homeworks.day03;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task3 {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Go to https://id.heroku.com/login.
        driver.get("https://id.heroku.com/login");

    }

    @Test
    public void test(){
        // Enter an e-mail address.
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("rba.tmimi@gmail.com");
        // Enter a password.
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("1234");

        // Click on the Login button.
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        // There was a problem with your login.
        //If text is visible, print "Registration Failed".
        //If the text is not visible, print "Registered".
        WebElement errorMessage = driver.findElement(By.className("panel-footer"));
        if (errorMessage.isDisplayed()) {
            System.out.println("Registration Failed");
        } else {
            System.out.println("Registered");
        }
    }
    @AfterClass
    public static void tearDown(){

        // Close all pages.
        driver.quit();
    }
}









