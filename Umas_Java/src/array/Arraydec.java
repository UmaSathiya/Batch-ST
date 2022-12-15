package array;

public class Arraydec
{
	public static void main(String[] args) 
	{
		String Studentname[]=new String[4];
		
		 Studentname[0]="Uma";
		 Studentname[1]="Mahesh";
		 Studentname[2]="Sathiya";
		 Studentname[3]="Advik";
		
		 int rollno[]=new int[4];
		 rollno[0]=12;
		 rollno[1]=13;
		 rollno[2]=14;
		 rollno[3]=15;
		
		System.out.println("Rollno-"+rollno[0]+" "+"Studentname:"+Studentname[3]);
		System.out.println("Rollno-"+rollno[1]+" "+"Studentname:"+Studentname[1]);
		System.out.println("Rollno-"+rollno[2]+" "+"Studentname:"+Studentname[2]);
		System.out.println("Rollno-"+rollno[3]+" "+"Studentname:"+Studentname[0]);
	}

}
