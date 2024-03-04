package day08;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C04WindowHandle01 extends TestBase {
    // driver.getWindowHandle(); -> Returns the window handle (ID) of the active window or tab.
// driver.getWindowHandles(); -> Returns all window handles (IDs) of open windows or tabs as a Set.
// driver.switchTo().window(id); -> Allows us to switch to the window or tab with the specified window handle (ID).
// driver.switchTo().newWindow(TAB); -> Creates a new tab.
// driver.switchTo().newWindow(WINDOW); -> Creates a new window.

// Open browser
// Open https://www.amazon.com/ in the open tab
// Create a new tab
// Open https://www.linkedin.com/ in the open tab
// Create a new window
// Open https://opensource-demo.orangehrmlive.com/web/index.php/auth/login in the window that opens

    @Test
    public void test(){
        driver.get("https://www.amazon.com");
        String handel1=driver.getWindowHandle();

        // Create a new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");
        String handel2=driver.getWindowHandle();


        driver.switchTo().window(handel1);





    }
}
