package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("This is Listener TC Failed",true);
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("This is Listener TC passed",true);
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("This is Listener TC Skipped",true);
	}

}
