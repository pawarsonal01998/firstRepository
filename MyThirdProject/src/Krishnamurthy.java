import java.util.Scanner;
public class Krishnamurthy
{
	public int factorial(int no)
	{
		int i,sum=0;
		while(no>0)
		{
			int fact=1;
			int rem=no%10;
			for(i=1;i<=rem;i++)
			{
			 fact=fact*i;	
			}
			sum=sum+fact;
			no=no/10;
		}
		return sum;
	}
	public void fact(int count,int rem )
	{
		int fact=1;
		while(count>0)
		{
			fact=fact*rem;
		}
	}

	public static void main(String[] args)
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.:");
		no=sc.nextInt();
		Krishnamurthy obj=new Krishnamurthy();
		int sum=obj.factorial(no);
		if(sum==no)
			System.out.println(no+" is Krishnamurthy");
		else
			System.out.println(" is not Krishnamurthy");
		sc.close();	
		

	}

}
