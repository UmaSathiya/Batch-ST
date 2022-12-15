package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class report {
  @Test
  public void Display() 
  {
	  Reporter.log("Gud AfterNoon",true);
  }
}
