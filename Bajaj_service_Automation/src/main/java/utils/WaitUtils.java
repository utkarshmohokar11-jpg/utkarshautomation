package utils;
  
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public WaitUtils(WebDriver driver) {
		this.driver = driver;
		wait =  new WebDriverWait(driver,Duration.ofSeconds(1000));		
	}
	
	
	
	public WebElement waitForVisibility(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}





/*
//2️⃣ Wait until element is clickable
public WebElement waitForClickable(By locator) {
    return wait.until(ExpectedConditions.elementToBeClickable(locator));
}

// 3️⃣ Wait until element is present in DOM
public WebElement waitForPresence(By locator) {
    return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}

// 4️⃣ Wait until element disappears
public boolean waitForInvisibility(By locator) {
    return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
}

// 5️⃣ Wait until text is present
public boolean waitForText(By locator, String text) {
    return wait.until(
        ExpectedConditions.textToBePresentInElementLocated(locator, text));
}

// 6️⃣ Wait until title contains value
public boolean waitForTitle(String title) {
    return wait.until(ExpectedConditions.titleContains(title));
}

// 7️⃣ Static hard wait (Use ONLY when needed)
public static void hardWait(int seconds) {
    try {
        Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}*/
