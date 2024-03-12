package day14;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02TestNG {

    @Test()
    public void  b(){
        System.out.println("Test01 has executed");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"b"})
    public void  a(){
        System.out.println("Test02 has executed");

    }

    }
