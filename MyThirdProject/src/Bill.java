
public class Bill 
{

	public static void main(String[] args) 
	{
		BillGenaration b=(q)->{
								System.out.println("Shopping bill");
								return q*500;
							  };
		System.out.println(b.showBill(5));
		
		b=(a)->{
			System.out.println("Electricity bill");
			return a*100;
		  };
		  System.out.println(b.showBill(500));

	}

}
