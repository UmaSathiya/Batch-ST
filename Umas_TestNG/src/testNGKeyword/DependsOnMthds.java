package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMthds {
	@Test
	public void E() {
		Reporter.log("E is running", true);
	}

	@Test(timeOut = 200)
	public void B() throws InterruptedException {
		Thread.sleep(100);
		Reporter.log("B is running", true);
	}

	@Test(dependsOnMethods = { "D", "B" }, invocationCount = 4)
	public void C() {
		Reporter.log("C is running", true);
	}

	@Test
	public void A() {
		Reporter.log("A is Running", true);
	}

	@Test
	public void D() {
		Reporter.log("D is running", true);
	}
}
