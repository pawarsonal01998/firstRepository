
public class Containment 
{

	public static void main(String[] args) 
	{
		Doctor d=new Doctor(1,"Sonal","helth");
		Hospital h=new Hospital(1000,"A","Pune",d);
		System.out.println(d);
		System.out.println(h);
		d.setRegno(2);
		d.setDname("X");
		d.setSpeciality("Nuro Sergen");
		System.out.println(d);
		h.setNoOfBeds(2000);
		h.setHname("A");
		h.setLocation("Nagpur");
		h.setDoc(d);
		System.out.println(h);
	}

}
