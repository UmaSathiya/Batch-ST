package methods;

public class Staticmthd_diffclass {

	public static void main(String[] args) 
	{
		System.out.println("Main method Started");
		//calling static method from different class
		/*Syntax:
		 * classname.methodname(); */
		
		S_diffclass.diffclass();	
		System.out.println("Main method ended");
	}
}
