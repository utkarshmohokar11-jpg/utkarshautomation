package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

import utils.ConfigReader;
import utils.WaitUtils;

public class LoginPage {
	private WebDriver driver;
	private WaitUtils wait;

	private By mobilenumer12 = By.id("mobileNo");
	private By sendotp = By.id("otpButton");
	private By enterotp = By.xpath("//input[@id=\"enterOtp\"]");
	private By sign = By.xpath("//button[@type=\"submit\"]");

	public LoginPage(WebDriver driver, WaitUtils wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void enterMobileNumber() {
		String number = ConfigReader.getProperty("mobileNumber");
		wait.waitForVisibility(mobilenumer12).sendKeys(number);
	}
	
}
