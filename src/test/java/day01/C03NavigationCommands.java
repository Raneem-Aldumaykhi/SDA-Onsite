package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03NavigationCommands {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.get("https://www.amazon.com");
        driver.get("https://www.clarusway.com");


        //back()
        System.out.println("url"+driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("title"+driver.getTitle());

        //forward
        driver.navigate().forward();
        System.out.println("driver.getCurrentUrl()"+driver.getCurrentUrl());

        //refresh
        driver.navigate().refresh();

        //to
        driver.navigate().to("https://www.amazon.com");
        driver.quit();

    }
}
