package homeworks.day06;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static homeworks.day06.day06Challenge.driver;
public class Task3 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        // Launch Browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @Test
    public void test() {
        // Open "https://demoqa.com/select-menu"
        driver.get("https://demoqa.com/select-menu");

        // Select the Standard Multi-Select using the element id
        WebElement multiElement = driver.findElement(By.id("cars"));
        Select multiSelect1 = new Select(multiElement);

        // Verifying that the element is multi-select
        if (multiSelect1.isMultiple()) {
            System.out.println("The element : multi-select.");
        } else {
            System.out.println("The element : not multi-select.");
        }

        // Select 'Opel' using the index and deselect the same using index
        multiSelect1.selectByIndex(2);

        multiSelect1.deselectByIndex(2);


        // Select 'Saab' using value and deselect the same using value
        multiSelect1.selectByValue("saab");

        multiSelect1.deselectByValue("saab");


        // Deselect all the options
        multiSelect1.deselectAll();

    }




    @AfterClass
    public static void tearDown() {
        // Close the browser
        // driver.quit();
    }
}
