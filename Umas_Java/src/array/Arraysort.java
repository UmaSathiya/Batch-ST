package array;

import java.util.Arrays;

public class Arraysort
{
	public static void main(String[] args) 
	{
		int num[]= {10,30,50,20,40};
		
		Arrays.sort(num);
		System.out.println("Array sorting in ascending order");
		System.out.println("======================================");
				
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.println(num[i]);
		}
		
		System.out.println("======================================");
		System.out.println("Array sorting in descending order");
		System.out.println("======================================");
		
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
		
		String Flowers[]= {"Rose","Jasmine","Sunflower","Hibiscus"};
		
		Arrays.sort(Flowers);
		System.out.println("======================================");
		System.out.println("Array sorting in alphabet order");
		System.out.println("======================================");
				
		for(int i=0;i<=Flowers.length-1;i++)
		{
			System.out.println(Flowers[i]);
		}

	}

}
