package diamondambiguity;

public class Son implements Father,Mother
{
	public static void main(String[] args)
	{
		Son s=new Son();
		s.food();			//son inheriting Mothers Property
		s.love();			//son inheriting Mothers Property
		s.property();		//son inheriting Fathers Property
		s.money();			//son inheriting Fathers Property
		
		s.faith();			//son inheriting default property of both Mother & Father
		
		Father.care();		//calling Fathers static method property
		Mother.care();		//calling Mothers static method property
	}
	@Override
	public void love()	
	{
		System.out.println("Mothers Love");	//definition for abstract method 
	}
	@Override
	public void food() 
	{
		System.out.println("Mothers Food"); //definition for abstract method 
	}
	@Override
	public void money()
	{
		System.out.println("Fathers money"); //definition for abstract method 
	}
	@Override
	public void property() 
	{
		System.out.println("Fathers Property"); //definition for abstract method 
	}
	public void faith()
	{
		Father.super.faith();	//calling fathers property using super keyword
		Mother.super.faith();	//calling mothers property using super keyword
	}
}
