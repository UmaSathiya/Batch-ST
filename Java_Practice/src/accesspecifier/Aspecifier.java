package accesspecifier;

public class Aspecifier 
{
	private int a=20;
	char b='X';
	protected String name="Access";
	public float x=5.5f;
	
	public static void main(String[] args)
	{
		Aspecifier as=new Aspecifier();
		as.exam();
		as.exam1();
		as.exam2();
		as.exam3();
		
		System.out.println("Private variable:"+as.a);
		System.out.println("Default variable:"+as.b);
		System.out.println("Protected variable:"+as.name);
		System.out.println("Public variable:"+as.x);
	}
	private void exam()
	{
		System.out.println("Private method");
	}
	void exam1()
	{
		System.out.println("Default method");
	}
	protected void exam2()
	{
		System.out.println("Protected method");
	}
	public void exam3()
	{
		System.out.println("Public method");
	}
}
