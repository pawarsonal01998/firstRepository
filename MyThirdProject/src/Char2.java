import java.util.Scanner;
public class Char2 
{

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter Character:");
	 char ch=sc.next().charAt(0);
	 if(ch>='a' && ch<='z')
	 {
		 System.out.println("Character is Small");
		 System.out.println("Capital:"+(char)(ch-32));
		 
	 }
	 else if(ch>='A' && ch<='Z')
	 {
		 System.out.println("Charector is Capital");
		 System.out.println("Small:"+(char)(ch+32));
	 }
	 else
		 System.out.print("It is not Alphabet");
	 
	 System.out.println("*using Ternary Oprator*");
	 
	 String a=(ch>='a' && ch<='z') ? "Charector is Small\nCapital:"+(char)(ch-32) 
			 : (ch>='A' && ch<='Z') ? "Charector is Capital\nSmall:"+(char)(ch+32) 
			 : "It is not Alphabet";
	System.out.println(a);
    sc.close();
	}

}
