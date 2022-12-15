package logical;

import java.util.Scanner;

public class RevtheNoUsingStrg
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		int orgNo=sc.nextInt();
		String orgStr = Integer.toString(orgNo);
		String rev="";
		for(int i=orgStr.length()-1;i>=0;i--)
		{
			char t = orgStr.charAt(i);
			rev=rev+t;
		}
		int revNo = Integer.parseInt(rev);
		System.out.println("original string:"+orgNo);
		System.out.println("Reverse string:"+revNo);
	}

}
