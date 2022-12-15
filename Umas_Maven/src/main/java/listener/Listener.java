package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("This is Listener TC Failed",true);
	}
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("This is Listener TC passed",true);
	}
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("This is Listener TC Skipped",true);
	}

}
