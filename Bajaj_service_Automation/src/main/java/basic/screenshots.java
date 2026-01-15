package basic;

import java.io.File; 
import java.io.IOException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class screenshots {
	public static void main(String[] args) {
		        // Launch Chrome browser
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		
		        
		        // Open URL
		        driver.get("https://www.google.com");
		        
		        
		        
		        try {
		            // Take screenshot
		            TakesScreenshot ts = (TakesScreenshot) driver;
		            File src = ts.getScreenshotAs(OutputType.FILE);
		            
		            // Destination path
		            File dest = new File("C:\\Users\\utkarshm\\eclipse-workspace\\BajajIDMSAutomation\\Bajaj_service_Automation\\src\\test\\resources\\screenshot\\test.png");
		            
		            
		            
		            // Copy file to destination
		            FileUtils.copyFile(src, dest);
		            
		            System.out.println("Screenshot taken successfully!");
		            
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        
		        // Close browser
		        driver.quit();
		    }
		



}
