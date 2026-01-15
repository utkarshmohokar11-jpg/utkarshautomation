package testngtest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class screenshotoffailedtestcase {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();              // ❗ missing
        driver.manage().window().maximize();
        driver.get("https://qa-vahan-v3-0.excellonconnect.com/");
    }
    

    @Test
    public void failingTest() {
        WebElement si = driver.findElement(By.id("nonExistingElement"));
        si.click(); // this will fail → screenshot taken
    }
    
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {   // ❗ removed semicolon
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            String timeStamp =
                    new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
            File dest = new File(
                    System.getProperty("user.dir")
                    + "/screenshots/failure_" + timeStamp + ".png");
            dest.getParentFile().mkdirs();
            FileUtils.copyFile(src, dest);
            System.out.println("Screenshot taken successfully");
        }
        driver.quit();
    }
}
