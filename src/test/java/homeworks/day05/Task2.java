package homeworks.day05;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;


public class Task2 {
/*            * breakout task: (in a separate class)
            * navigate to this url https://www.saucedemo.com/v1/inventory.html
            * add the first item you find to your cart
     * open your cart*
            * assert that the item name is correct inside the cart
     */

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void testAddToCart() {
        // Navigate to the specified URL
        driver.get("https://www.saucedemo.com/v1/inventory.html");

        // Add the first item to the cart
        WebElement addToCart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        addToCart.click();

        // Open the cart
        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();

        // Get the item name from the cart
        WebElement NameOfItemInCart = driver.findElement(By.className("inventory_item_name"));
        String NameOfItem = NameOfItemInCart.getText();

        // Assert that the item name is correct inside the cart
        assertEquals("Sauce Labs Backpack", NameOfItem);

}
}
