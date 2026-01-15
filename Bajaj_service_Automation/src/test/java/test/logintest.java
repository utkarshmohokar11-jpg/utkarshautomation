package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;


public class logintest extends BaseTest {
	
	@Test
    public void verifyLoginWithNumber() {
 
		LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.enterMobileNumber();
    }
}
