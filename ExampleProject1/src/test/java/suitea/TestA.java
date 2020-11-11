package suitea;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataProvider.TestDataProvider;
import testBase.TestBase;

public class TestA extends TestBase{
	
	@Test(groups = {"sanity", "smoke"},dataProviderClass = TestDataProvider.class, dataProvider = "dataSuiteA")
	public void testA(String username, String Password) throws InterruptedException
	{
		log("Starting A");
		softAssert.assertEquals("Title1", "Title");
		softAssert.assertEquals("Text1", "Text");
		log(username+"   "+Password);
		Thread.sleep(3000);
		log("Ending A");
		//Assert.fail("xyz error");
		//softAssert.assertAll();
		
		
		
	}

}
