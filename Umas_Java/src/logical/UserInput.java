package logical;

import java.util.Scanner;

public class UserInput 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("sum value="+c);
		System.out.println("===================");
		
		System.out.println("Enter your name");
		String name=sc.next();
	}
}
