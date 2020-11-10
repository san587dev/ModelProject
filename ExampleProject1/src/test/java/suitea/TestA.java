package suitea;

import org.testng.annotations.Test;

import testBase.TestBase;

public class TestA extends TestBase{
	
	@Test
	public void testA() throws InterruptedException
	{
		log("Starting A");
		Thread.sleep(3000);
		log("Ending A");
		
	}

}
