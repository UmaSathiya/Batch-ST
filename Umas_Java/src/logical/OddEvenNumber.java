package logical;

import java.util.Scanner;

public class OddEvenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("It is even Number");
		}
		else
		{
			System.out.println("It is Odd number");
		}

	}

}
