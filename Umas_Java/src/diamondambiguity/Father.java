package diamondambiguity;

public interface Father 
{
	void money();
	void property();
	default void faith()
	{
		System.out.println("Fathers faith");
	}
	static void care()
	{
		System.out.println("Fathers Care");
	}
}
