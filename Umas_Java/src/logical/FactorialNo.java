package logical;

import java.util.Scanner;

public class FactorialNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		int a=sc.nextInt();
		int mul=1;
		for(int i=a;i>=1;i--)
		{
			mul=mul*i;
		}
		System.out.println("Factorial of "+a+" is : "+mul);
	}
}
