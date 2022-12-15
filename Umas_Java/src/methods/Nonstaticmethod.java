package methods;

public class Nonstaticmethod {

	public static void main(String[] args) {
		
		//same class definition
		
		Nonstaticmethod obj1=new Nonstaticmethod();		//create object
		obj1.m1();										//calling same class
		
		//another class definition
		
		NSdiff obj2=new NSdiff();						//create object
		obj2.nsd();										//calling another class
	}
	
	//same class declaration
	
	public void m1()
		{
			System.out.println("I am Nonstatic method from same class");
		}

	}


