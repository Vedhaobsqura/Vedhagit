package exception;

public class FinallyException 
{

	public static void main(String[] args)
	{
		try
		{
		int div=100/0;
		System.out.println(div);

	}
		catch(Exception e)
		{
			System.out.println(e);
			/*int a=20;
			int b=10;
			int c=a+b;
			System.out.println(c);*/
		}
finally
{
	System.out.println("hii");
	
}
		System.out.println("helllo");
}
}
