package day05;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01ChromeOptions {
    static WebDriver driver;

    @Test
    public void test(){

        ChromeOptions options =new ChromeOptions();
        options.addArguments("--lang=en");

        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("headless");
        options.addArguments("disable-popup-blocking");
        options.addArguments("disable-infobars");

        driver=new ChromeDriver();
        driver.get("https://www.google.com");





    }
}
