package day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C03Dropdown02 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

    @Test
    public void dropDownTest(){
        // first locate the webElement
        WebElement element = driver.findElement(By.xpath("//*[@id=\"oldSelectMenu\"]"));

        // Create select object
        Select select = new Select(element); // To use select methods tag name must be "select"

        // use select methods to select option
        select.selectByIndex(3); // index 3 =4th element ---> yellow
        // select by value -> we should inspect
        select.selectByValue("4"); // by value
        element.click();
        element.sendKeys(Keys.DOWN);
        element.sendKeys(Keys.ENTER);

        select.selectByValue("red");// by value "red"

        select.selectByVisibleText("Purple");
        System.out.println("select.isMultiple()= "+select.isMultiple());
        WebElement element2 =driver.findElement(By.id("cars"));
        Select select2 = new Select(element2);

        System.out.println("select2.isMultiple() ="+select2.isMultiple()); //true can select multiple option







    }
}


