
public class Continue
{
	public void skip()
	{
		int cnt=0;
		while(cnt<20)
		{
		 cnt+=2;
			if(cnt==10)
				continue;
		 System.out.println(cnt);
	    }
	}

	public static void main(String[] args)
	{
		Continue obj=new Continue();
		obj.skip();
	}

}
