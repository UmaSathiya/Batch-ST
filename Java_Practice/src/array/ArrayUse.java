package array;

import java.util.Arrays;

public class ArrayUse 
{
	public static void main(String[] args) 
	{
		String Name[]= {"Uma","Mahesh","Sathiya","Bharathi","Advik"};
		
		Arrays.sort(Name);
		System.out.println("Array sorting in Alphabet Order");
		System.out.println("===================================");
		
		for(int i=0;i<=Name.length-1;i++)
		{
			System.out.println(Name[i]);
		}
		System.out.println("===================================");
		System.out.println("Array Sorting reverse alphabet order");
		System.out.println("===================================");
		
		for(int j=Name.length-1;j>=0;j--)
		{
			System.out.println(Name[j]);
		}	
		
		int num[]= {22,23,27,28,21};
		Arrays.sort(num);
		System.out.println("===================================");
		System.out.println("Array sorting in Ascending Order");
		System.out.println("===================================");
		
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("===================================");
		System.out.println("Array sorting in Descending Order");
		System.out.println("===================================");
		
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
		

	}

}
