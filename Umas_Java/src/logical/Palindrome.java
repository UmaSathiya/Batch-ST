package logical;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String org = sc.next();
		String rev = "";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			char t = org.charAt(i);
			rev=rev+t;
		}
		System.out.println("Original String:"+org);
		System.out.println("Reverse String:"+rev);
		
		if(org.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
