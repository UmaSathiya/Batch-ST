package interface1;

public class Implement implements Demo1
{
	public static void main(String[] args) 
	{
		Implement i=new Implement();
		i.test1();
		i.test2();
		i.test3();
		i.test4();
		
		System.out.println("Interface variable a:"+i.a);
	}
	@Override
	public void test1() 
	{
		System.out.println("Interface method test1");
	}

	@Override
	public void test2()
	{
		System.out.println("Interface method test2");
	}
	
	public void test3()
	{
		System.out.println("Implement class method test3");
	}
	public void test4()
	{
		System.out.println("Implement class method test4");
	}

}
