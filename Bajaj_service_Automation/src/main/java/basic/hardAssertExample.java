package basic;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardAssertExample {

	
	@Test(enabled = false)
	public void hardAssertionExample() {
	    System.out.println("Step 1: Test Started");
	    Assert.assertEquals("Login", "Logins", "Title mismatch");
	    System.out.println("Step 2: This will NOT execute");
	}
	
	@Test(enabled = false)
	public void hard2() {
		Assert.assertNotEquals("login", "ksc");
		System.out.println();
	}
	
	@Test(enabled = false)
	public void tsae() {
		Assert.fail();
	}
	
	
	@Test
	public void logincheck() {
	WebDriver driver = new ChromeDriver();
    driver.get("https://qa-idms-v3-0.excellonconnect.com/dashboard");
 
    String autualtitle = driver.getTitle();
    String expectedtitle = "Bajaj iDMS j";
    
    Assert.assertEquals(autualtitle, expectedtitle,"mismatch");
	}
	
	@Test
	public void verifyLoginPageUI() {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://qa-idms-v3-0.excellonconnect.com/dashboard");
	    SoftAssert softAssert = new SoftAssert();
	    String autualtitle = driver.getTitle();
	    String expectedtitle = "Bajaj iDMS j";
	    softAssert.assertEquals(autualtitle, expectedtitle,"mismatch");
	    softAssert.assertAll(); // Mandatory 
	}
	
	
	
	
}
