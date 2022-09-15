
public class ApplicationStatic 
{
 static int hitCounter=0, count=0;
 int lid;
 String passward;
 ApplicationStatic(int id,String p)
 {
	 lid=id;
	 passward=p;
	 hitCounter++; 
 }
 public String toString()
 {
	return " "+ lid +" "+ passward +" "; 
 }
 
	public static void main(String[] args) 
	{
		ApplicationStatic a1,a2,a3;
		a1=new ApplicationStatic(1,"sonal@100");
		System.out.println(a1);
		a2=new ApplicationStatic(2,"sonalPawar");
		System.out.println(a2);
		a3=new ApplicationStatic(3,"sonbhi");
		System.out.println(a3);
		System.out.println(ApplicationStatic.hitCounter);
	}

}
