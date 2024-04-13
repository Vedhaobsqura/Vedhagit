package exception;

public class ThrowException1
{
	static int a=10;
	static int b=20;
	//int a=10;create instance method
   //int b=20;
	public static void add()
	{
		int sum= a+b;
		if(sum<50)
		{
			throw new ArithmeticException("Sum is lesser than 50");
		}
		else
		{
			System.out.println("Sum is not lesser than 50");
		}
		
	}

	public static void main(String[] args) 
	{
		try 
		{
			
add();
		}
	catch(Exception e)	
		{
		System.out.println(e);
		}
System.out.println("hello");


	}

}
