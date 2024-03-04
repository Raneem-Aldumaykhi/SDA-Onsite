package homeworks.day02;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tasks {
    public static void main(String[] args) {
        // TASK 1
        // Invoke Chrome Browser
        WebDriver driver;
        driver =new ChromeDriver();

       // Navigate to URL: https://www.w3schools.com/
        driver.navigate().to("https://www.w3schools.com/");

      // Navigate to URL: https://stackoverflow.com/
        driver.navigate().to("https://stackoverflow.com/");

      // Come back to the w3schools using the back command.
        driver.navigate().back();

      // Again go back to the stackoverflow website using forward command
        driver.navigate().forward();

     // Refresh the Browser using refresh command.
        driver.navigate().refresh();

     // Close the Browser.
        driver.quit();


     // TASK 2

     // Go to www.yahoo.com
        driver.get("https://de.yahoo.com/?p=us");
     // Maximize Window
        driver.manage().window().maximize();
     // Go to www.amazon.com
        driver.get("https://www.amazon.com/");
     // Maximize Window
        driver.manage().window().maximize();
     // Navigate Back
        driver.navigate().back();
     // Navigate Forward
        driver.navigate().forward();
     // Refresh The Page
        driver.navigate().refresh();



     //TASK 3
    // Expected Title

    // Set Path of the Chrome driver
    // Launch Chrome browser
    // Open URL of Website
    // Maximize Window
    // Get Title of current Page
    // Validate/Compare Page Title
    // Close Browser




    }
    }

