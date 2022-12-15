package abstractclass;

public abstract class Absclass 
{
	public Absclass()
	{
		System.out.println("Abstract class constructor");
	}
	public static void demo()
	{
		System.out.println("Static method in Abstract class");
	}
	public void demo1()
	{
		System.out.println("Nonstatic complete method");
	}
	public abstract void demo3();
}
