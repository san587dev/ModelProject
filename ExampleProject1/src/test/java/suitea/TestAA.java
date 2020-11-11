package suitea;

import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testBase.TestBase;

public class TestAA extends TestBase {
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataSuiteA")
	public void testAA(String username, String password) throws InterruptedException
	{
		log("Starting AA");
		log(username+"   "+password);
		Thread.sleep(3000);
		log("Ending AA");
	}

}
