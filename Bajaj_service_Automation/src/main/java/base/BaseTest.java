package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.ConfigReader;
import utils.WaitUtils;


public class BaseTest {
	protected WebDriver driver;
    protected WaitUtils wait;
    
    
    @BeforeClass
    public void setup()	{
    	String browser = ConfigReader.getProperty("browser");
    	
    	if(browser.equalsIgnoreCase("Chrome")) {
    		driver =new ChromeDriver();
    	}
    	else if(browser.equalsIgnoreCase("firefox")) {
    		driver = new FirefoxDriver();
    	}
    	else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
    	}else {
            throw new RuntimeException("Browser not supported: " + browser);  
    	}
    	driver.manage().window().maximize();
    	wait = new WaitUtils(driver);
    	
    	driver.get(ConfigReader.getProperty("url"));
    }
    
    @AfterClass
    public void teardown() {
    	driver.quit();
    }
    
    }



