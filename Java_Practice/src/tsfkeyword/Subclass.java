package tsfkeyword;

public class Subclass extends Super
{
	int x=20;
	public static void main(String[] args)
	{
		Subclass sub=new Subclass();
		sub.test1();
	}
	public Subclass()
	{
		super();		//Calling Superclass Constructor
		System.out.println("Subclass Constructor");
	}
	public void test1()
	{
		int x=15;
		super.test1();	//calling superclass method
		System.out.println("Subclass method");
		System.out.println("Local variable:"+x);
		System.out.println("Globalvar from sameclass:"+this.x);
		System.out.println("Globalvar from superclass:"+super.x);
	}

}
