package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
               /*
        Open URL: https://www.google.com/
        Maximize the window.
        Print the position and size of the page.
        Minimize the page.
        Wait 5 seconds in the icon state and maximize the page.
        Print the position and dimensions of the page in maximized state.
        Make the page fullscreen.
        Close the Browser.

         */
        WebDriver driver =new ChromeDriver();

        // Open URL: https://www.google.com/
        driver.get("https://www.google.com");

        // Maximize the window.
        driver.manage().window().maximize();

        // Print the position and size of the page.
        Point position1 =driver.manage().window().getPosition();
        int xCoord =position1.getX();
        int yCoord =position1.getY();
        System.out.println("position1.toString() = " + position1.toString());
        System.out.println("xCoord = " + xCoord);
        System.out.println("yCoord = " + yCoord);
        //soutv
        Dimension size1 =driver.manage().window().getSize();
        System.out.println("size1.getWidth() = " + size1.getWidth());
        System.out.println("size1.getHeight() = " + size1.getHeight());
        System.out.println("size1.toString() = " + size1.toString());


        // Minimize the page.
        driver.manage().window().minimize();

        // Wait 5 seconds in the icon state and maximize the page.
        Thread.sleep(5000);
        driver.manage().window().maximize();

        // Print the position and dimensions of the page in maximized state.
        Point position2 =driver.manage().window().getPosition();
        Dimension size2 =driver.manage().window().getSize();
        System.out.println("size2.toString() = " + size2.toString());

        driver.manage().window().maximize();

        // Make the page fullscreen.
        driver.manage().window().fullscreen();

        // Close the Browser.
        driver.quit();

    }
}
