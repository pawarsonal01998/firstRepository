import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferedReader2 
{

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter input_from_question:");
		String input_from_question = br.readLine();
		int no=Integer.parseInt(input_from_question);
		System.out.println("Entered no is:"+no);
	}

}
