package superkey;

public class Suppconst 
{
	String Name;
	int x;
	int y;
	public Suppconst(String name)
	{
		Name=name;
		System.out.println("Name:"+name);
		System.out.println("Superclass constructor with parameter");
	}
	public Suppconst(int a,int b)
	{
		a=x;
		b=y;	
	}
	public void test()
	{
		System.out.println("Superclass Method");
	}

}
