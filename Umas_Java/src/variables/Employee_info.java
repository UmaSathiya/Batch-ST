package variables;

public class Employee_info {

	public static void main(String[] args) {
		
		Employee.Team="INDIA";//Static global variable no need to call multiple times if var is same
		
		
		Employee Uma=new Employee();		//create object(Uma)
		Uma.Emp_Name="UMA";					//Nonstatic variable initialization
		Uma.Emp_Age=27.5f;
		Uma.Emp_Gender='F';
		Uma.Emp_Salary=26700;
					
		
		Uma.Emp_info();						//calling Nonstatic method from diff class
		
		Employee Sathiya=new Employee();		//create object(Sathiya)
		Sathiya.Emp_Name="SATHIYA";				//Nonstatic variable initialization
		Sathiya.Emp_Age=29;
		Sathiya.Emp_Gender='M';
		Sathiya.Emp_Salary=49500;
		
		Sathiya.Emp_info();						//calling Nonstatic method from diff class
		
		//calling one object(Sathiya) multiple times
		
		Sathiya.Emp_Name="ADVIK";				//Nonstatic variable initialization
		Sathiya.Emp_Age=25;
		Sathiya.Emp_Gender='M';
		Sathiya.Emp_Salary=55000;
		
		Sathiya.Emp_info();	
	
	}

}
