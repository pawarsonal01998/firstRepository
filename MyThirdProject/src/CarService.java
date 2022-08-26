
public class CarService implements Clean, Wash
{
	public void doCleaning()
	{
		System.out.println("Clean Car");
		System.out.println("Cleaning Charges "+Clean.cleaningCharges);
	}
	public void doWashing(int wc)
	{
		System.out.println("Wash Car");
		System.out.println("Clean Car");
	}
	public void doPolishing()
	{
		System.out.println("Polish Car");
		System.out.println("Cleaning Charges "+Clean.cleaningCharges);
	}
	public void dospryWash()
	{
		System.out.println("Car Spry Wash");
	}
	public void doWashing(String k)
	{
	System.out.println("do Wash Car"+k);	
	}
	
}
