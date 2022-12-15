package methods;

public class Staticmthd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("I am Main method");		//Main method
		smthd();									//Static method from same class
		S_diffclass.diffclass();					//Static method from different class
	}
	
	public static void smthd()
	{
		System.out.println("I am static method from same class");
	}
}
