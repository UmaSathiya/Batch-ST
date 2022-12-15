package abstractclass;

public class Concrete extends Absclass
{
	public static void main(String[] args)
	{
		Concrete c=new Concrete();
		c.demo1();
		c.demo3();
		c.demo4();
		
		demo5();
		Absclass.demo();
	}

	@Override
	public void demo3() 
	{
		System.out.println("Nonstatic abstract method");
	}
	public void demo4()
	{
		System.out.println("NS Method in concrete class");
	}
	public static void demo5()
	{
		System.out.println("Static method in concrete class");
	}
//	public Concrete()
//	{
//		super();
//		System.out.println("Concrete class constructor");
//	}
}
