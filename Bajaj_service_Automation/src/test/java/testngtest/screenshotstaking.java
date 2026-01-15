package testngtest;

import java.io.File; 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class screenshotstaking {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-vahan-v3-0.excellonconnect.com/");
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);

			File dest = new File(
					"C:\\Users\\utkarshm\\eclipse-workspace\\BajajIDMSAutomation\\Bajaj_service_Automation\\src\\test\\resources\\screenshot\\masterloginpage.png");
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}driver.quit();
	}
	screenshotstaking s = new screenshotstaking();
}
