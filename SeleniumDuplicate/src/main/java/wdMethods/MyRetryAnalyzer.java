package wdMethods;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer{

	    int counter=0;
	    int retrylimit=3;
	
	@Override
	public  boolean retry(ITestResult result) {
		
		boolean status=false;
		
	 if (counter < retrylimit)
	 {
		 
		 counter++;
		 status=true;
	 }
	    return status; 
	 
	} 
}
