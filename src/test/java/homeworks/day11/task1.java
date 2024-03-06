package homeworks.day11;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class task1 extends TestBase {

    @Test
    public void test() {
        //Go to URL:https://facebook.com/
        driver.get("https://facebook.com/");

        //Print all the cookies.
        Set<Cookie> cookies=driver.manage().getCookies();
        for(Cookie w:cookies){
            System.out.println(w);
        }
        //Get Cookie.
        System.out.println("------------------------------");
        Cookie fr = driver.manage().getCookieNamed("fr");
        System.out.println("fr = " + fr);
        System.out.println("------------------------------");

       System.out.println("fr.getValue() = " + fr.getValue()); // value of the cookie
        System.out.println("------------------------------");
        //Find the total number of cookies.
        int sizeCookies = cookies.size();
        System.out.println("sizeCookies = " + sizeCookies);
        System.out.println("------------------------------");

        //Add Cookie.
        Cookie newCookie = new Cookie("animal","cat");
        driver.manage().addCookie(newCookie);
        driver.manage().getCookies().forEach(t-> System.out.println(t));
        System.out.println("------------------------------");

        //Edit Cookie.

        //Delete Cookie.
        driver.manage().deleteCookie(newCookie);
        driver.manage().deleteCookieNamed("animal");
        driver.manage().getCookies().forEach(System.out::println);
        System.out.println("------------------------------");

        //Delete All Cookies.
        driver.manage().deleteAllCookies();
        driver.manage().getCookies().forEach(System.out::println);
        System.out.println("end here----------------------");


    }

}
