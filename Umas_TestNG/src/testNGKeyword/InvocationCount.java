package testNGKeyword;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class InvocationCount {
	@Test(invocationCount = 3)
	public void myTest() {
		Reporter.log("MyTest is Running", true);
	}
}
