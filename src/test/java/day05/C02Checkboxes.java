package day05;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class C02Checkboxes {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver =new ChromeDriver();
        ChromeOptions options =new ChromeOptions();
        options.addArguments("start-maximized");
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @AfterClass
    public static void tearDown(){
       // driver.quit();
    }

    @Test
    public void checkboxTest(){
        List<WebElement> checkboxes =driver.findElements(By.xpath("//*[@type='checkbox']"));
        if(!checkboxes.get(0).isSelected()){
            checkboxes.get(0).click();
            System.out.println("checkbox(0)selected");
        }else {
            System.out.println("alredy selected");
        }
        Assert.assertTrue(checkboxes.get(0).isSelected());
        Assert.assertTrue(checkboxes.get(1).isSelected());

    }
}
