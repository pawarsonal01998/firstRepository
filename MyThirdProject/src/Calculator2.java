import java.util.Scanner;
public class Calculator2 
{

	public static void main(String[] args) 
	{
		double a,b;
		 int e;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number first:");
		a=sc.nextDouble();
		System.out.print("Enter number secand:");
		b=sc.nextDouble();
		System.out.print("Enter 1 for Add\nEnter 2 for Subtraction\nEnter 3 for Multiply\nEnter 4 for Divide:");
		e=sc.nextInt();
		switch(e)
		{
		case 1:System.out.print("Addition:"+(a+b));
		      break;
		case 2:System.out.print("Subtraction:"+(a-b));
		      break;
		case 3:System.out.print("Multiplication:"+(a*b));
		      break;
		case 4:System.out.print("Division:"+(a/b));
		      break;
		default:System.out.print("Invalid case no");
		}
    sc.close();
	}

}
