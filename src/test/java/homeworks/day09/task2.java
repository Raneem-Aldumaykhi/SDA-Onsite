package homeworks.day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.time.Duration;

public class task2 extends TestBase {
    @Test
    public void sliderTest(){
        By slider = By.xpath("//*[@id=\"js-rangeslider-0\"]/div[2]");

        driver.get("https://rangeslider.js.org/");
        WebElement sliderButton = driver.findElement(slider);
        actions
                .dragAndDropBy(sliderButton,100,0)
                .pause(Duration.ofSeconds(2))
                .dragAndDropBy(sliderButton,-100,0)
                .build()
                .perform();

    }
}
