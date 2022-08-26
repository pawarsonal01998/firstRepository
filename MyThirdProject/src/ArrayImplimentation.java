import java.util.Scanner;
public class ArrayImplimentation 
{
	public void display(byte a11[])
	{
		for(int i=0;i<a11.length;i++)
		{
			System.out.print(a11[i]+" ");//Display.
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayImplimentation arr1=new ArrayImplimentation();
		//byte a[];//Array Deceleration.
		//a=new byte[1];//memory allocation without accept from user.
		//byte a[]=new byte[1];//declaration and memory allocation both on a single line.
		System.out.print("Enter the length of byte array:");//Accept from user.
		int len=sc.nextInt();
		byte a[]=new byte[len];//deceleration and memory allocation both on single line.
		//byte a[]=new byte []{1,2,3,4,5};//Array initialization
		System.out.println("Length of byte a[]: "+a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter a["+i+"]:");
			a[i]=sc.nextByte();//Accept from user.
		}
		//arr1.display(a);
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
		System.out.print("Enter the length of short array:");
		int len2=sc.nextInt();
		short ar[]=new short[len2];
		System.out.println("Length of short ar[]: "+ar.length);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("Enter ar["+i+"]:");
			ar[i]=sc.nextShort();
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		System.out.print("Enter the length of int array:");
		int len3=sc.nextInt();
		int arr[]=new int[len3];
		System.out.println("Length of integer arr[]: "+arr.length);
		System.out.println("Enter the number");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("Enter the length of long array:");
		int len4=sc.nextInt();
		long arra[]=new long[len4];
		System.out.println("Length of long arra[]: "+arra.length);
		for(int i=0;i<arra.length;i++)
		{
			System.out.print("Enter arra["+i+"]:");
			arra[i]=sc.nextLong();
		}
		for(int i=0;i<arra.length;i++)
		{
			System.out.print(arra[i]+" ");
		}
		
		System.out.print("Enter the length of float array:");
		int len5=sc.nextInt();
		float array[]=new float[len5];
		System.out.println("Length of float array[]: "+array.length);
		for(int i=0;i<array.length;i++)
		{
			System.out.print("Enter array["+i+"]:");
			array[i]=sc.nextFloat();
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.print("Enter the length of double1 array:");
		int len6=sc.nextInt();
		double a2[]=new double[len6];
		System.out.println("Length of double a2[]: "+a2.length);
		for(int i=0;i<a2.length;i++)
		{
			System.out.print("Enter a2["+i+"]:");
			a2[i]=sc.nextDouble();
		}
		for(int i=0;i<a2.length;i++)
		{
			System.out.print(a2[i]+" ");
		}
		
		System.out.print("Enter the length of char array:");
		int len7=sc.nextInt();
		char a3[]=new char[len7];
		System.out.println("Length of char a3[]: "+a3.length);
		for(int i=0;i<a3.length;i++)
		{
			System.out.print("Enter a3["+i+"]:");
			a3[i]=sc.next().charAt(0);
		}
		for(int i=0;i<a3.length;i++)
		{
			System.out.print(a3[i]+" ");
		}
		
		System.out.print("Enter the length of String array:");
		int len8=sc.nextInt();
		String a4[]=new String[len8];
		System.out.println("Length of string a4[]: "+a4.length);
		for(int i=0;i<a4.length;i++)
		{
			System.out.print("Enter a4["+i+"]:");
			a4[i]=sc.next();
		}
		/*for(int i=0;i<a4.length;i++)
		{
			System.out.print(a4[i]+" ");
		}*/
		for(String x:a4)
		{
			System.out.println(x);
		}
		sc.close();
	}

}
