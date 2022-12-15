package interfacestudy;

public interface Int1 
{
	void car();
	default void cycle()
	{
		System.out.println("Int1 default method");
	}
	static void truck()
	{
		System.out.println("Int1 static method");
	}
}
