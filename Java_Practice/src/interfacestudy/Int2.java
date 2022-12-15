package interfacestudy;

public interface Int2
{
	void bike();
	default void cycle()
	{
		System.out.println("Int2 default method");
	}
	static void truck()
	{
		System.out.println("Int2 static method");
	}

}
