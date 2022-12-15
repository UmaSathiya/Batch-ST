package singlelevel;

public class SBI extends RBI 
{
	public static void main(String[] args) 
	{	//Single level Inheritance
		
		ATM();
		FD();
		SBI.FD();
		
		RBI rbi=new RBI();
		rbi.loan();
		
		SBI sbi=new SBI();
		sbi.YONOsbi();
		sbi.loan();
	}
	public void YONOsbi()
	{
		System.out.println("YONO mobile application");
	}
	public static void ATM()
	{
		System.out.println("SBI ATM");
	}
}
