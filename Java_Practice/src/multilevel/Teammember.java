package multilevel;

public class Teammember extends Teamsupervisor
{
	public static void main(String[] args)
	{
		Teammember mem=new Teammember();
		mem.work();
		mem.meeting();
		
		Teamsupervisor ts=new Teamsupervisor();
		ts.meeting();
		ts.newproject();
		
		Projectmanager pm=new Projectmanager();
		pm.newproject();
		
		report();
		allocation();
		schedule();
	}
	public void work()
	{
		System.out.println("Team member work completed");
	}
	public static void report()
	{
		System.out.println("Completed work report");
	}
}
