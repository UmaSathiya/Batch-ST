package assignments;

public class superkey extends supkey
{

	public static void main(String[] args)
	{
		superkey s=new superkey();
		s.test();

	}
	public void test()
	{
		int x=20;
		System.out.println("local variable "+x);
		System.out.println("global variable from another class "+super.x);
	}

}
