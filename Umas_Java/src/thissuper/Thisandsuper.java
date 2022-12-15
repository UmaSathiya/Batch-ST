package thissuper;

public class Thisandsuper extends Super
{	
	//if the local and global variable name of same class is same then use "This" keyword to call
	//If the local and global variable name of diff class is same then use "Super" keyword to call
	int x=15;
	
	public static void main(String[] args)
	{
		Thisandsuper ts=new Thisandsuper();
		ts.test();
	}
	public void test()
	{
		int x=10;
		System.out.println("local variable "+x);
		System.out.println("Global variable from same class "+this.x);
		System.out.println("Global variable from super class "+super.x);
	}
}
