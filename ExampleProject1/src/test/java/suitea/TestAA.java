package suitea;

import org.testng.annotations.Test;

import testBase.TestBase;

public class TestAA extends TestBase {
	
	@Test
	public void testAA() throws InterruptedException
	{
		log("Starting AA");
		Thread.sleep(3000);
		log("Ending AA");
	}

}
