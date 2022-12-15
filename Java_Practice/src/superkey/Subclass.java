package superkey;

public class Subclass extends Superclass
{
	public static void main(String[] args) 
	{
		Subclass sub=new Subclass();
		sub.test();
	}
	public Subclass()
	{
		super();	//calling superclass constructor
		System.out.println("Subclass Constructor");
	}
	public void test()
	{
		int x=15;		//local variable
		super.test();	//calling superclass method
		System.out.println("Subclass method");
		System.out.println("local variable "+x);
		System.out.println("Superclass global variable "+super.x);
	}
}
