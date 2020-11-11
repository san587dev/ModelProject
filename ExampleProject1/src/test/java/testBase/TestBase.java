package testBase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reports.ExtentManager;

public class TestBase {
	
	public ExtentReports rep;
	public ExtentTest test;
	public SoftAssert softAssert;
	
	@BeforeMethod
	public void init(ITestResult result)
	{
		System.out.println(result.getMethod().getMethodName().toUpperCase());
		
		rep = ExtentManager.getReports();//We can give the path reporting folder
		
		test = rep.createTest(result.getMethod().getMethodName().toUpperCase());
		
		result.setAttribute("reporter", test);
		
		softAssert = new SoftAssert();
	}
	
	@AfterMethod
	public void quit() 
	{
		rep.flush();
	}
	
	
	public void log(String msg) 
	{
		System.out.println(msg);
		test.log(Status.INFO, msg);
		test.log(Status.PASS, msg);
	}
	
	public void logFailure(String msg)
	{
		System.out.println(msg);
		test.log(Status.FAIL, msg);
	}

	public void failAndStopTest(String msg)
	{
		
	}
	
}
