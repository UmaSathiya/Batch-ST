package array;

public class Arrayforloop 
{
	public static void main(String[] args) 
	{
		String name[]=new String[5];
		
		name[0]="Advik";
		name[1]="Sathiya";
		name[2]="Uma";
		name[3]="Bharathi";
		name[4]="Mahesh";
		
		System.out.println("Array traversing using static forloop");
		System.out.println("======================================");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("======================================");
		System.out.println("Array traversing using Dynamic forloop");
		System.out.println("======================================");
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("======================================");
		System.out.println("Array traversing in reverse order using Dynamic forloop");
		System.out.println("======================================");
		
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
	}
}
