package suitea;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testBase.TestBase;

public class TestA extends TestBase{
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "dataSuiteA")
	public void testA(String username, String Password) throws InterruptedException
	{
		log("Starting A");
		log(username+"   "+Password);
		Thread.sleep(3000);
		log("Ending A");
		Assert.fail("xyz error");
	}

}
