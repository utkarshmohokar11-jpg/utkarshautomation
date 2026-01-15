package testngtest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(MyListener.class)
public class MyTest {
	
	    
	    @Test
	    public void test1() {
	        System.out.println("Inside Test 1");
	    }
	    
	    @Test
	    public void test2() {
	        System.out.println("Inside Test 2");
	    }

}
