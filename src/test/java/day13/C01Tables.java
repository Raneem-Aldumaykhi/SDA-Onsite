package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C01Tables extends TestBase {
    @Test
    public void test() {
        //Go to URL: http://demo.guru99.com/test/web-table-element.php
        driver.get("http://demo.guru99.com/test/web-table-element.php");

        //To find third row of table
        WebElement thirdRow = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        System.out.println("thirdRow = " + thirdRow.getText());
        //To get 3 rd row 's 2nd column data
        WebElement thirdRow2 = thirdRow.findElement(By.xpath(".//td[2]"));
        System.out.println("thirdRow2 = " + thirdRow2.getText());

        //Get all the values of a Dynamic Table
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
        for (WebElement row : rows) {
            // Find all columns in each row
            List<WebElement> columns = row.findElements(By.tagName("td"));

            // Iterate through each column
            for (WebElement column : columns) {
                // Print the text of each column
                System.out.print(column.getText() + "\t");
            }
            System.out.println();

        }
    }
}
