package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loadtheurl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		WebElement username1= driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		username1.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password1 = driver.findElement(By.cssSelector("input[type^=\"passwor\"]"));
		password1.sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		
		
		WebElement hover1 = driver.findElement(By.xpath("//button[@title=\"Assign Leave\"] "));
		Actions as = new Actions(driver);
		as.moveToElement(hover1).perform();
		
		/*
		 * Actions rightclick1 = new Actions(driver);
		 * rightclick1.contextClick(hover1).perform();
		 */
		
		Actions rightclick1 = new Actions(driver);
		rightclick1.doubleClick(hover1).perform();
		//rightclick1.dragAndDrop(2, hover1).perform()
		
		
		rightclick1.sendKeys(Keys.PAGE_DOWN).perform();
		rightclick1.sendKeys(Keys.PAGE_UP).perform();
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("wsasdeda");
		
		
		
		//
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
		 * WebElement che =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id("sddda"));
		 * che.click();
		 */
		
		
		//mouse hover
		
		/*
		 * WebElement hover =
		 * driver.findElement(By.xpath("//button[@title=\"Assign Leave\"] "));
		 */	
		
		
	/*	Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/viewPimModule\"]"));
		s.click();
		
		WebElement dropdownES = driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']"));
		Select select = new Select(dropdownES);
		select.selectByVisibleText("Freelance");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollby(0,300)");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollby(0,-300)");
		
		JavascriptExecutor js123 = (JavascriptExecutor) driver;
		js.executeScript("History.go(0)");*/
		
		
		//==============================================//================================//============================
		
		
		
		
		
		
		
		
		
	}
}
