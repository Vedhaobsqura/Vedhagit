package exception;

public class ThrowException 
{
	
	public static void vote(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible");
		}
		else
		{
			System.out.println("Elgible to vote");
		}
	}

	public static void main(String[] args) {

		ThrowException.vote(20);
		//vote(20);

	}

}
