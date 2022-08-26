import java.util.Scanner;
public class Calculator 
{

	public static void main(String[] args)
	{
	 double a,b;
	 int e;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 2 numbers:");
	a=sc.nextDouble();
	b=sc.nextDouble();
	System.out.print("Enter 1 for Add, Enter 2 for Subtraction, Enter 3 for Multiply, Enter 4 for Divide");
	e=sc.nextInt();
	if(e==1)
	 System.out.print("Add:"+(a+b));
	else if(e==2)
		System.out.print("Subtraction:"+(a-b));
	else if(e==3)
		System.out.print("Mulriply:"+(a*b));
	else if(e==4)
	    System.out.print("Divide:"+(a/b));
	else
		System.out.print("Invalid no");
	sc.close();
	}

}
