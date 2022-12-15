package accesspecifiers;

public class Demo1 {

	public static void main(String[] args)
	{
		Demo d1=new Demo();
		//d.test1();
		d1.test2();
		d1.test3();
		d1.test4();
		
		//System.out.println("Private variable "+d.a);
		System.out.println("Default variable "+d1.b);
		System.out.println("Protected variable "+d1.c);
		System.out.println("Public variable "+d1.d);

	}

}
