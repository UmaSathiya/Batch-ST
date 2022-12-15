package controlstmt;

public class Nestedif {

	public static void main(String[] args)
	{
		String Username="umasathiya";
		String Password="usathiya";
		
		if(Username=="umasathiya")
		{
			System.out.println("username correct");
			if(Password=="usathiya")
			{
				System.out.println("Password correct");
			}
			else 
			{
				System.out.println("Password Incorrect");
			}
		}
		else
		{
			System.out.println("Username Incorrect");
		}

	}

}
