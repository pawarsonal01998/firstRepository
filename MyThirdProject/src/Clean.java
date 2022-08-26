
public interface Clean 
{
	int cleaningCharges=50;
	void doCleaning();
	void doWashing(int wc);
	void doPolishing();
	static void provideOnlineService(String u, String p)
	{
		System.out.println("You can got online Service");
	}
	default void discontinueService()
	{
		System.out.println("Your Service is Stopped");
	}
}
class Resistration implements Clean
{
	public void doCleaning()
	{
		/*super.discontinueService(); we cant use*/
		System.out.println("Clean Car");
	}
	public void doWashing(int wc)
	{
		System.out.println("Wash Car");
	}
	public void doPolishing()
	{
		System.out.println("Polish Car");
	}
	public void discontinueService()
	{
		System.out.println("Your Service is Stopped in 24 hours...");
	}
}