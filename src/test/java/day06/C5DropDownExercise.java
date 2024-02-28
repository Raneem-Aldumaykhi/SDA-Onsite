package day06;


import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/*https://demoqa.com/select-menu
Get all the options of the dropdown
Options size
Print all test
Verify the dropdown has option "Black"
Print FirstSelectedOptionTest
Select option "Yellow"*/
public class C5DropDownExercise {
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
    public void dropDownTest4(){
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        // Create select object
        Select select = new Select(element); // To use select methods tag name must be "select"
        List<WebElement> options =select.getOptions();

        //Option size
        int sizeOfOptions =options.size();

        //print all test
        for(WebElement option:options){
            System.out.println( option.getText());
        }
        //Verify the dropdown has option "Black"

        List<String> colors = new ArrayList<>();
        for(WebElement option : options){
            colors.add(option.getText());
        }

        Assert.assertTrue(colors.contains("Black"));

        // Print FirstSelectedOptionTest
        System.out.println("select.getFirstSelectedOption() = " + select.getFirstSelectedOption());
        //Select option "Yellow"
        select.selectByVisibleText("Yellow");







    }


}
