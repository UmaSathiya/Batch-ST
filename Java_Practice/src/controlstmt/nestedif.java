package controlstmt;

public class nestedif 
{
	public static void main(String[] args)
	{
		String username="usece10";
		String password="uma";
		String captacha="4eG7s";
		
		if(username=="usece10")
		{
			System.out.println("Enter password");
			if(password=="uma")
			{
				System.out.println("Enter captcha");
				if(captacha=="4eG7s")
				{
					System.out.println("Click Submit Button");
				}
				else
				{
					System.out.println("Invalid captcha");
				}
			}
			else
			{
				System.out.println("Invalid Password");	
			}
		}
		else
		{
			System.out.println("Invalid Username");
		}
	}
}

