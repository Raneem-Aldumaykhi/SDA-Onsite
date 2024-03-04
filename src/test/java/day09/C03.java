package day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03 extends TestBase {

   // Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    //Fill in capitals by country.
    @Test
    public void test(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo =driver.findElement(By.id("box1"));
        WebElement Stockholm =driver.findElement(By.id("box2"));
        WebElement Washington =driver.findElement(By.id("box3"));
        WebElement Copenhagen =driver.findElement(By.id("box4"));
        WebElement seolE =driver.findElement(By.id("box5"));
        WebElement romeE =driver.findElement(By.id("box6"));
        WebElement Madrid =driver.findElement(By.id("box7"));

        WebElement Norway =driver.findElement(By.id("box101"));
        WebElement Sweden =driver.findElement(By.id("box102"));
        WebElement United_States =driver.findElement(By.id("box103"));
        WebElement Denmark =driver.findElement(By.id("box104"));
        WebElement korea =driver.findElement(By.id("box105"));
        WebElement italy =driver.findElement(By.id("box106"));
        WebElement Spain =driver.findElement(By.id("box107"));



        Actions actions =new Actions(driver);
        actions .dragAndDrop(seolE,korea)
         .dragAndDrop(romeE,italy)
                .dragAndDrop(oslo,Norway)
                .dragAndDrop(Stockholm,Sweden)
                .dragAndDrop(Washington,United_States)
                .dragAndDrop(Copenhagen,Denmark)
                .dragAndDrop(Madrid,Spain).perform();



    }
}
