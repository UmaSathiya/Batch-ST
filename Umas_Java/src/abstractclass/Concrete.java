package abstractclass;

public class Concrete extends Abstractclass
{

	public static void main(String[] args) 
	{
		Concrete cc=new Concrete();
		cc.test();
		cc.test1();
		cc.test2();
	}
	
	public void test()
	{
		System.out.println("test Method definition in concrete class");
	}
	
	public void test2()
	{
		System.out.println("test2 complete method");
	}
}
