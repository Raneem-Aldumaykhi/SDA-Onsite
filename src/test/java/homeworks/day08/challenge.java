package homeworks.day08;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class challenge extends TestBase {
    @Test

    public void test(){
        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");

        // Set up WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.switchTo().frame(0);

        // Find and fill form fields
        WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Name-li\"]/div[2]/div/span[1]/input")));
        firstNameInput.sendKeys("Raneem");

        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id=\"Name-li\"]/div[2]/div/span[2]/input"));
        lastNameInput.sendKeys("aldumaykhi");

        List<WebElement> radio= driver.findElements(By.xpath("//*[@id=\"Radio-li\"]/div[2]/div"));
        System.out.println(radio.size());

        radio.get(0).click();

        WebElement dropdown = driver.findElement(By.id("Dropdown-arialabel"));

        Select select = new Select(dropdown);
        select.selectByIndex(1);


        //List<WebElement> checkbox= driver.findElements(By.xpath("//*[@id=\"Checkbox-li\"]"));
        //System.out.println(checkbox.size());

        //checkbox.get(0).click();


// check box
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@for='Checkbox_1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//*[@for='Checkbox_2']"));
        WebElement checkbox3 = driver.findElement(By.xpath("//*[@for='Checkbox_3']"));

        checkbox1.click();
        checkbox3.click();

        WebElement star1 = driver.findElement(By.xpath("//*[@id=\"Rating-li\"]/div[2]/div/div[1]/a[1]"));
        WebElement star2 = driver.findElement(By.xpath("//*[@id=\"Rating-li\"]/div[2]/div/div[1]/a[2]"));
        WebElement star3 = driver.findElement(By.xpath("//*[@id=\"Rating-li\"]/div[2]/div/div[1]/a[3]"));
        WebElement star4 = driver.findElement(By.xpath("//*[@id=\"Rating-li\"]/div[2]/div/div[1]/a[4]"));
        WebElement star5 = driver.findElement(By.xpath("//*[@id=\"Rating-li\"]/div[2]/div/div[1]/a[5]"));

        star4.click();
        List<WebElement> starsList = new ArrayList<>();

        // Find and add each WebElement to the list
        starsList.add(driver.findElement(By.xpath("//*[@id=\"Rating-li\"]/div[2]/div/div[1]/a[1]")));
        starsList.add(driver.findElement(By.xpath("//*[@id=\"Rating-li\"]/div[2]/div/div[1]/a[2]")));
        starsList.add(driver.findElement(By.xpath("//*[@id=\"Rating-li\"]/div[2]/div/div[1]/a[3]")));
        starsList.add(driver.findElement(By.xpath("//*[@id=\"Rating-li\"]/div[2]/div/div[1]/a[4]")));
        starsList.add(driver.findElement(By.xpath("//*[@id=\"Rating-li\"]/div[2]/div/div[1]/a[5]")));


        WebElement submit = driver.findElement(By.xpath("//*[@id=\"formAccess\"]/div[1]/div/div/button"));
        submit.click();

        String expctedURL = "https://clarusway.getlearnworlds.com/sda-test-registration-form";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("submited",expctedURL,actualURL);





    }
}
