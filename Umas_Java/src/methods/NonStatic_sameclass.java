package methods;

public class NonStatic_sameclass {

	public static void main(String[] args) //main mthd declaration
	{
		//method definition
		//to call nonstatic from same class create object 1st 
		//how to create object
		//Syntax: classname objectname=new classname();
		
		NonStatic_sameclass object=new NonStatic_sameclass();
		
		//calling nonstatic from same class
		//Syntax: objectname.methodname();
		
		object.nonstat();
		object.nonstat();
		object.nonstat();
	}
		public void nonstat()//nonstatic method declaration
		{
			System.out.println("Nonstatic from same class");//method definition
		}
}
