
public class CleaningService
{

	public static void main(String[] args) 
	{
		Resistration r=new Resistration();
		r.discontinueService();
		r.doCleaning();
		r.doPolishing();
		r.doWashing(3);
		Clean.provideOnlineService("Sonal","Sonal@100");
		
		/*Jwellery j=new Jwellery();
		j.doCleaning();
		j.doPolishing();*/
		
		/*Clean c=new Kitchan();
		c.doCleaning();
		c.doWashing(100);
		c.doPolishing();
		Food f=new Kitchan();//we can create object by 2 types 1)referance of parent class
		f.recipy();
		Kitchan k=new Kitchan();//2)object
		k.recipy();*/
		
		/*c=new CarService();
		c.doCleaning();
		c.doWashing(40);
		c.doPolishing();
		Wash w=new CarService();
		w.doWashing("KIA");*/
	}

}
