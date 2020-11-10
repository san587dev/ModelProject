package suitec;

import org.testng.annotations.Test;

import testBase.TestBase;

public class TestC extends TestBase{

	@Test
	public void testC() throws InterruptedException
	{
		log("Starting C");
		Thread.sleep(3000);
		log("Ending C");
	}

	
}
