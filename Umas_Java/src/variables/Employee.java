package variables;

public class Employee {
	String Emp_Name;
	float Emp_Age;
	char Emp_Gender;
	int Emp_Salary;
	static String Team;
	
	public void Emp_info()
	{
		System.out.println("Emp_Name is "+Emp_Name);
		System.out.println("Emp_Age is "+Emp_Age);
		System.out.println("Emp_Gender is "+Emp_Gender);
		System.out.println("Emp_Salary is "+Emp_Salary);
		System.out.println("Emp_Team is "+Team);
		System.out.println("===================================");
	}

}
