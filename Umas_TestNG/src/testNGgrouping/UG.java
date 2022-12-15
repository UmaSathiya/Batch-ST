package testNGgrouping;

import org.testng.annotations.Test;

public class UG 
{
  @Test(groups = "grp")
  public void Ug1styear() 
  {
	  System.out.println("UG 1st year");
  }
  @Test
  public void Ug2ndyear()
  {
	  System.out.println("UG 2nd year");
  }
  @Test(groups = "grp1")
  public void Ug3rdyear()
  {
	  System.out.println("UG 3rd year");
  }
  @Test
  public void Ug4thyear()
  {
	  System.out.println("UG 4th year");
  }
}
