package constructor;

public class Construct 
{
	//variable declaration before method
	int a;
	int b;

	public static void main(String[] args)		//Main method
	{
		Construct obj=new Construct();			//Create object
		obj.addition();							//calling Nonstatic Method
	}
	//constructor is a special method that is used to initialize variables/objects
	
	public Construct()							//User defined Constructor with no parameters
	{
		System.out.println("I am a constructor");
		a=20;									//Variable initialization
		b=25;
	}
	
	public void addition()						//Non static Method
	{
		int sum=a+b;
		System.out.println("a+b="+sum);
	}

}
