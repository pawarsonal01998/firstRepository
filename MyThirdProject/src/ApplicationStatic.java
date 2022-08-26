
public class ApplicationStatic 
{
 static int hitCounter=0, count=0;
 int lid;
 String passward;
 ApplicationStatic(int id,String p)
 {
	 lid=id;
	 String passward=p;
	 hitCounter++; 
 }
 
	public static void main(String[] args) 
	{
		ApplicationStatic a1,a2,a3;
		a1=new ApplicationStatic(1,"sonal@100");
		a2=new ApplicationStatic(2,"sonalPawar");
		a3=new ApplicationStatic(3,"sonbhi");
		System.out.println(ApplicationStatic.hitCounter);
	}

}
