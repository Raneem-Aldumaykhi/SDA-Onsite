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
import java.util.List;

/*
Launch the browser.
Open "https://demoqa.com/select-menu".
Select the Standard Multi-Select using the element id.
Verifying that the element is multi-select.
Select 'Opel' using the index and deselect the same using index.
Select 'Saab' using value and deselect the same using value.
Deselect all the options.
Close the browser.
*/

public class C04DropDownExercise {
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
    public void dropDownTest3(){
        WebElement element = driver.findElement(By.id("cars"));
        // Create select object
        Select select = new Select(element); // To use select methods tag name must be "select"

        System.out.println("select.isMultiple()= "+select.isMultiple());
        Boolean multi = select.isMultiple();
        Assert.assertEquals("true", multi.toString() );

        //Select 'Opel' using the index and deselect the same using index.
        select.selectByIndex(2);
        List<WebElement> option = select.getOptions();
        option.get(2).isSelected();
        Assert.assertTrue(option.get(2).isSelected());


        //Select 'Saab' using value and deselect the same using value.
        select.selectByValue("saab");
        Assert.assertEquals(2,select.getAllSelectedOptions().size());

       /*
       Assert using another way:

       ( List<WebElement> option2 = select.getOptions();
        option2.get(1).isSelected();
        Assert.assertTrue(option2.get(1).isSelected());*/

        //Deselect all the options.

        select.deselectByValue("saab");
        System.out.println("select.getAllSelectedOptions().get(0).getText() = " + select.getAllSelectedOptions().get(0).getText());
    }
}

