package testNGgrouping;

import org.testng.annotations.Test;

public class School 
{
  @Test(groups = "grp")
  public void class11() 
  {
	  System.out.println("class 11");
  }
  @Test
  public void class12()
  {
	  System.out.println("class 12");
  }
  @Test
  public void class9()
  {
	  System.out.println("class 9");
  }
  @Test(groups = "grp1")
  public void class10()
  {
	  System.out.println("class 10");
  }
}
