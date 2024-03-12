package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C03  {
   static WebDriver driver = new ChromeDriver();
    @BeforeClass
    public static  void setUp(){
         driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void teardowm(){
        // driver.quit();
    }

    @Test
    public void facebook(){
        driver.get("https://www.facebook.com");
    }

    @Test(dependsOnMethods = {"facebook"})
    public void google(){
        driver.get("https://www.google.com");
    }

    @Test(dependsOnMethods ={"google"} )
    public void amazon(){
        driver.get("https://www.amazon.com");

    }
}
