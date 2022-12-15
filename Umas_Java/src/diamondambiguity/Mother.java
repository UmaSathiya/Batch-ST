package diamondambiguity;

public interface Mother 
{
	void love();
	void food();
	static void care()
	{
		System.out.println("Mothers care");
	}
	default void faith()
	{
		System.out.println("Mothers Faith");
	}
}
