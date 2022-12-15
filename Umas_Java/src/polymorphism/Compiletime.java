package polymorphism;

public class Compiletime 
{
	/* Method Overloading is the Example of Compile-time polymorphism
	 * Method overloading is declaring multiple methods 
	   with same name and diff parameters in a same class*/
	public static void main(String[] args) 
	{
		Compiletime Ct=new Compiletime();
		Ct.luck(10, 20);
		Ct.luck(10.5f, 20, 301);
	}
	public void luck(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum "+sum);
	}
	public void luck(float a,int b,long c)
	{
		float sum=a+b+c;
		System.out.println("sum "+sum);
	}
}
