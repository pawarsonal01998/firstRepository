import java.util.Arrays;


public class Array1 
{
	public void array1(int a[][])
	{
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
		System.out.println("a["+i+"]="+Arrays.toString(a[i])+"with Length "+a[i].length);
		}
	}
	public static void main(String[] args) 
	{
		Array1 a1=new Array1();
		int a[][]={{7,8},{4,5,10},{5,8,9,10}};
		a1.array1(a);
	}

}
