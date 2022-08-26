import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of Array:");
		int len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("Enter Elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int m=(a.length-1)/2;
		System.out.println("mid:"+m);
		int w=1;
		for(int i=0;i<=m;i++)
		{
			int q=a[i];
			a[i]=a[m+w];
			a[m+w]=q;
			w++;
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
