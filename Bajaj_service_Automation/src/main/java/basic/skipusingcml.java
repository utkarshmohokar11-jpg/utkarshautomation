package basic;

import org.testng.annotations.Test;

public class skipusingcml {
	
	  @Test
	    public void validLogin() {
	        System.out.println("Valid Login");
	    }

	    @Test
	    public void invalidLogin() {
	        System.out.println("Invalid Login");
	    }
}
