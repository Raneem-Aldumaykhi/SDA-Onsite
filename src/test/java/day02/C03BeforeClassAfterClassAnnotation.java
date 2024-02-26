package day02;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03BeforeClassAfterClassAnnotation {
    WebDriver driver;
    @BeforeClass
      public void beforeClass(){
        driver = new ChromeDriver();
        System.out.println("Before class method is executed...");
    }

    @AfterClass
       public  void afterClass(){
          driver.quit();
          System.out.println("After Classs method is executed...");
    }


}
