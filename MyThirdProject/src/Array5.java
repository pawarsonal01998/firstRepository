
public class Array5
{

	public static void main(String[] args) 
	{
		int a[]={2,9,7,8,11,12,17,22,29};
		int n=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println(a[i]);
				n=a[i]+5;
			}
		}
	}

}
