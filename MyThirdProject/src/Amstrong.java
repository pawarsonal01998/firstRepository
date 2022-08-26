import java.util.Scanner;
public class Amstrong 
{
	public int amstrong(int n)
	{
	 	int count=0,n1=n,ans,sum=0,rem=0;
	 	while(n>0)
	 	{
	 		n=n/10;
	 		count++;
	 	}
	 	System.out.println("Count:"+count);
	 	int count1=count;
	 	while(n1>0)
	 	{
	 	 rem=n1%10;
	 	 n1=n1/10;
	 	 ans=1;
	 	 while(count>0)
	 	     {
	 		  ans=ans*rem;
	 		  count--;
	 	     }
	 	 sum=sum+ans;
	 	count=count1;
	 	 }
	 	System.out.println("sum:"+sum);
	 	return sum;
	 	
	}

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter no.:");
     int no=sc.nextInt();
     Amstrong obj=new Amstrong();
     int s=obj.amstrong(no);
     if(s==no)
    	 System.out.println(no+" is Amstrong ");
     else
    	 System.out.println(no+" is not Amstrong ");
     sc.close();
	}

}
