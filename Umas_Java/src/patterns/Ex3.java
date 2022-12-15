package patterns;

public class Ex3 
{
	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
				int star1=5;
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=star1;j++)
					{
						System.out.print("*");
					}
					System.out.println();
					star1--;
				}
				System.out.println("============");
//------------------------------------------------------------------
				//*****
				// **** 
				//  ***
				//   **
				//    *
				int space=0;
				int star2=5;
				for(int i=1;i<=5;i++)
				{
					for(int k=1;k<=space;k++)
					{
						System.out.print(" ");
					}
					for(int j=1;j<=star2;j++)
					{
						System.out.print("*");
					}
					System.out.println();
					star2--;
					space++;
				}
				System.out.println("============");
		//---------------------------------------------------------------
				//    *
				//   **
				//  ***
				// ****
				//*****
				int space1=4;
				int star3=1;
				for(int i=1;i<=5;i++)
				{
					for(int j=1;j<=space1;j++)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=star3;k++)
					{
						System.out.print("*");
					}
					System.out.println();
					space1--;
					star3++;
				}
				System.out.println("============");
		//---------------------------------------------------------------
				//*******
				// *****
				//  ***
				//   *
				int sp=0;
				int st=7;
				for(int i=1;i<=4;i++)
				{
					for(int j=1;j<=sp;j++)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=st;k++)
					{
						System.out.print("*");
					}
					System.out.println();
					st=st-2;
					sp++;
				}
			}


	}


