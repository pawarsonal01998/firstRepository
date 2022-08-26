import java.util.Scanner;
public class Char 
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter any charector:");
	 char ch=sc.next().charAt(0);
	 System.out.println("Dsplay Charector:"+ch);
	 System.out.println("Dsplay Charector in Byte:"+(byte)ch);
	 System.out.println("Dsplay Charector in Short:"+(short)ch);
	 System.out.println("Dsplay Charector in Int:"+(int)ch);
	 System.out.println("Dsplay Charector in Long:"+(long)ch);
	 System.out.println("Dsplay Charector in Float:"+(float)ch);
	 System.out.println("Dsplay Charector in Double:"+(double)ch);
	 System.out.println("Dsplay Charector :"+(char)(ch+32));
	 System.out.println("Dsplay Charector :"+(char)(ch+2));
	 sc.close();
	}

}
