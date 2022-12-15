package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 1)
	public void A() {
		Reporter.log("A is Running", true);
	}

	@Test(priority = 2)
	public void B() {
		Reporter.log("B is running", true);
	}

	@Test
	public void C() {
		Reporter.log("C is running", true);
	}

	@Test(priority = -1)
	public void D() {
		Reporter.log("D is running", true);
	}

	@Test(priority = -2)
	public void E() {
		Reporter.log("E is running", true);
	}
}
