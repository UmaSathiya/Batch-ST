package accesspecifiers;

public class Demo {
	
	private int a=10;	//private within class only
	char b='A';			//default within package
	protected int c=20;	//protected within package & from another package using inheritance
	public int d=30;	//public throughout the project
	
	public static void main(String[] ags)
	{
		Demo d=new Demo();
		d.test1();
		d.test2();
		d.test3();
		d.test4();
		
		System.out.println("Private variable "+d.a);
		System.out.println("Default variable "+d.b);
		System.out.println("Protected variable "+d.c);
		System.out.println("Public variable "+d.d);
	
	}

	private void test1()
	{
		System.out.println("Private within class only ");
	}
	void test2()
	{
		System.out.println("Default within package only");
	}
	protected void test3()
	{
		System.out.println("Protected within package and outside package using Inheritance");
	}
	public void test4()
	{
		System.out.println("Public throughout the project");
	}
}
