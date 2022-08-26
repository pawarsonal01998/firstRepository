import java.io.*;
public class AddUseBuffered
{
 public static void main(String aggs[])throws IOException
 {
	 int a,b,c;
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter First no.:");
	 a=Integer.parseInt(br.readLine());
	 System.out.println("Enter Second no.:");
	 b=Integer.parseInt(br.readLine());
	 c=a+b;
	 System.out.println("Addition:"+c);
 }
}
