package homeworks.day03;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task4 {
static WebDriver driver;
By calculator = By.xpath("/html/body/div/div[3]/div[2]/div[2]/div[1]/p/a");
By number1 =By.xpath("/html/body/div/div[3]/form/div[1]/input[1]");
By number2 =By.xpath("/html/body/div/div[3]/form/div[1]/input[2]");
By calculate =By.xpath("/html/body/div/div[3]/form/div[2]/input");
By result =By.xpath("/html/body/div/div[3]/div/p/span");
    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void CTest(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement first= driver.findElement(calculator);
        first.click();
        driver.findElement(number1).sendKeys("5");
        driver.findElement(number2).sendKeys("6");
        WebElement second= driver.findElement(calculate);
        second.click();
        String totalResult =driver.findElement(result).getText();
        System.out.println("total result = " +totalResult);

    }
}
