package exception;

public class Exception1 
{
static int a=20;
static int b=0;
static int div;

	public static void main(String[] args) 
	{
		try {
			
		
		div=a/b;
		System.out.println(div);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			//ae.printStackTrace();
		}
		System.out.println("hello");
		

	}

}
