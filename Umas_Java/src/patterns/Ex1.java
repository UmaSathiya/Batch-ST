package patterns;

public class Ex1 
{
	public static void main(String[] args) 
	{
		//*****
		for(int i=1;i<=5;i++)
		{
		System.out.print("*");
		}
		System.out.println();
		System.out.println("============");
//--------------------------------------------------------------------		
		//*****
		//*****
		//*****
		//*****
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");
//------------------------------------------------------------------		
		//*
		//**
		//***
		//****
		//*****
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		System.out.println("============");
//------------------------------------------------------------------
	}	
}
