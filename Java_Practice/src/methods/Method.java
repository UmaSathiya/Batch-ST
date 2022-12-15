package methods;

public class Method 
{
	public static void main(String[] args) 
	{
	
		Method m=new Method();	//calling nonstatic method from same class
		m.name("UMA");
		m.gender('F');
		
		age(32);				//calling static method from same class
		accountno(987654);
				
		diffclass.weight(55.3f);	//calling static method from diff class
		
		diffclass d=new diffclass();	//calling nonstatic method from diff class
		d.ctc(875408.7d);
	}
	public void name(String name)
	{
		System.out.println("Employee Name:"+name);
	}
	public void gender(char gender)
	{
		System.out.println("Employee Gender:"+gender);
	}
	public static void age(int age)
	{
		System.out.println("Employee Age:"+age);
	}
	public static void accountno(long accno)
	{
		System.out.println("Employee Accountno:"+accno);
	}
	
}
