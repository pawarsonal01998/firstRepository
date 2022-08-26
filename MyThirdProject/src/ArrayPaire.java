import java.util.Arrays;
import java.util.Scanner;
public class ArrayPaire 
{

	public void paire(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<5)
			  {
			   for(int j=i+1;j<a.length;j++)
			      {
			       if(a[i]+a[j]==5)
			         {
				      System.out.println(a[i]+"and"+a[j]);
				      a[j]=-999;
			         }
			     }
			 }
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("Enter elements of Array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		ArrayPaire arr=new ArrayPaire();
		arr.paire(a);
		sc.close();
	}

}
