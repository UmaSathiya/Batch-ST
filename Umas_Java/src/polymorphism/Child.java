package polymorphism;

public class Child extends Parent
{	// Method Overriding is the Example of Runtime polymorphism
	/* Method overriding is to declare superclass and subclass methods with same name &
	 * parameters and different method definition  by using inheritance concept*/
	public static void main(String[] args)
	{
		Child C1=new Child();
		Parent p1=new Parent();
		C1.P1(10, 20);
		p1.P1(15, 30);
	}
	public void P1(int a,int b)
	{
	int sum=a+b;
	System.out.println("sum "+sum);
	System.out.println("Child class method");
	}
}
