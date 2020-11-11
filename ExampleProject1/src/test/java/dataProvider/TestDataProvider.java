package dataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	
	@DataProvider
	public static Object[][] dataSuiteA(Method m)
	{
		System.out.println(m.getName());
		Object data[][] = null;
		if(m.getName().toUpperCase().equals("TESTA"))
		{
			data = new Object[2][2];
			data[0][0]="U1";
			data[0][1]="P1";
			
			data[1][0]="U2";
			data[1][1]="P2";
		}
		else if (m.getName().toUpperCase().equals("TESTAA"))
		{
			data = new Object[2][2];
			data[0][0]="U1";
			data[0][1]="P1";
			
			data[1][0]="U2";
			data[1][1]="P2";
			
		}
		return data; 
	}

	@DataProvider
	public static Object[][] dataSuiteB(Method m)
	{
		System.out.println(m.getName());
		Object data[][] = new Object[2][2];
		data[0][0]="U1";
		data[0][1]="P1";
		
		data[1][0]="U2";
		data[1][1]="P2";
		return data;
	}
}
