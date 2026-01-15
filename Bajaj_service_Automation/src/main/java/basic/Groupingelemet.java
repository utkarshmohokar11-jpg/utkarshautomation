package basic;

import org.testng.annotations.Test;

public class Groupingelemet {
	
	@Test(groups = {"smoke"})
	public void t1() {
		System.out.println("hello");
	}
	
	@Test(groups = {"sanity"})
	public void t2() {
		System.out.println("hello testNG");
	}
	
	
	@Test(groups = {"sanity"})
	public void t3() {
		System.out.println("hello testNG");
	}
	
	@Test(groups = {"smoke"})
	public void t4() {
		System.out.println("hello");
	}
}
