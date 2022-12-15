package testNGHardAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFail 
{
  @Test
  public void f1() 
  {
	  Assert.fail("TC Fail");
  }
}
