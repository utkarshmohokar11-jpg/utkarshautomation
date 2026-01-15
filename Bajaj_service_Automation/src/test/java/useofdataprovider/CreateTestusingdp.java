package useofdataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testngtest.DataProviders;

public class CreateTestusingdp {
	@Test
	(dataProvider ="strData",dataProviderClass=DataProviders.class,groups = {"regression"})
	public void createSTRTest(String source,String destination, String productType,int qty){
    	 System.out.println(source + " -> " + destination);
}
}