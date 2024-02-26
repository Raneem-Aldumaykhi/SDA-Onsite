package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C06PageSourceTest {
    public static void main(String[] args) {
       //  🡪 Go to the Amazon URL: https://www.amazon.com/
        // 🡪 Verify that it writes "Performance Metrics" or " Gateway" from the Source code.
        String str1 ="Type the characters you see in this image";
        String str2 ="Amazon";

        WebDriver driver =new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        String sorceCode =driver.getPageSource();
        System.out.println("sorceCode = "+sorceCode);

        if(sorceCode.contains(str1) || sorceCode.contains(str2))
            System.out.println("Test pass");
        else
            System.out.println("Test Fail");

        System.out.println(sorceCode.contains(str1));
        System.out.println(sorceCode.contains(str2));

        driver.quit();

    }
}
