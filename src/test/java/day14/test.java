package day14;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class test {
    public static void main(String[] args) {
        ExtentTest extentTest;
        ExtentReports extentReports;
        ExtentSparkReporter extentSparkReporter;

        extentReports =new ExtentReports();
        extentTest = extentReports.createTest("test1");

        String path =System.getProperty("user.dir")+"/test-output/reportsTest/index.html";
        extentSparkReporter=new ExtentSparkReporter(path);
        extentReports.attachReporter(extentSparkReporter);
    }
}
