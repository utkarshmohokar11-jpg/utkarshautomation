package basic;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class jkj {
	@Test()
	public void login() {
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "login")
	public void loasginsd() {
		System.out.println("sdc ");
	}
	
	
	/*
	@Test(enabled = false)
	public void run() {
		System.out.println("DONE");
	}

	@Test
	public void runsf() {
		System.out.println("wsdcsd");
	}

	@Test()
	 public void loginTest() {
	     boolean serverDown = true;
	  
	     if (serverDown) {
	         throw new SkipException("Skipping because server is down");
	     }
	     */
	
	     
	     
	 }
