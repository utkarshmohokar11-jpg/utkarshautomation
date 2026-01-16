package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTestNGReports {

    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void setupReport() {
        ExtentSparkReporter reporter =
                new ExtentSparkReporter("reports/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // create test BEFORE execution
        test = extent.createTest("Google Title Test");
    }
    
    @Test
    public void googleTitleTest() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        test.info("Page title is: " + title);
        Assert.assertEquals(title, "Googlewsdc"); // FAILS
    }

    
    //hello
    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.fail(result.getThrowable());
        }
        else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test passed");
        }
        else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test skipped");
        }
        driver.quit();
    }
    
    @AfterSuite
    public void flush() {
        extent.flush();
    }
}
