package exception;

public class Exception2 {

	public static void main(String[] args) {
		try {
			//Arithmetic Exception
			//int div = 100 / 0;
			//System.out.println(div);
			
			//NullPointer
			//String s=null;
			//System.out.println(s.length());
			
			//ArrayIndex
			int a[]= new int[4];
			a[10]=50;
			

		}

		/*catch (NullPointerException np) 
		{
			System.out.println(np);
		} 
		catch (ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai);
		} */
		catch (Exception e) 
		{
			System.out.println(e);
		}
		System.out.println("hello");
	}

}
