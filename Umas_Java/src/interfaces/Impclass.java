package interfaces;

public class Impclass implements Int1
{
	public static void main(String[] args)
	{
		System.out.println("Final value of a="+a);
		Impclass I1=new Impclass();
		I1.test();
		I1.test1();
	}
	@Override
	public void test()
	{
		System.out.println("test completed");
	}
	@Override
	public void test1() 
	{
		System.out.println("test1 completed");
	}

}
