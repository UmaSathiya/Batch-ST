package testNGXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 
{
  @Test
  public void B() 
  {
	Reporter.log("B is running", true);
  }
  @Test
  public void C() 
  {
	Reporter.log("C is running", true);
  }
  @Test
  public void A() 
  {
	Reporter.log("A is Running",true);
  }
  @Test
  public void D() 
  {
	Reporter.log("D is running",true);
  }
}
