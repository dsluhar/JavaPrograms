package AutomationScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class LearnDataProvider {
	
	@DataProvider
	Object[][] dataProviderMethod() {
	    return new Object[][] { 
	    	{"Test Data 1 ", 10},
	    	{"Test Data 2 ", 20},
	    	{"Test Data 3 ", 30},
	    };
	}
	@Test(dataProvider="dataProviderMethod")
	public void myTestMethod(String testData, int Number)
	{
		System.out.println("Test Data : " +testData );
		System.out.println("Test Number : " +Number );
		
	}
}
