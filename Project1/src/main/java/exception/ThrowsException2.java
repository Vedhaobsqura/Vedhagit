package exception;

import java.io.IOException;

public class ThrowsException2 {
	
		public void display() throws IOException {
	throw new IOException("This is IO Exception");
		}
		
		public void show()throws IOException
		{
			display();
		}
		
		public void dsisplay1()
		{
			try
			{
				show();
			}
			catch(Exception e)
			{
				System.out.println("This belongs to show method");
			}
		}

		public static void main(String[] args) 
		{
			
			ThrowsException2 obj = new ThrowsException2();
			//obj.display();
			obj.dsisplay1();
			System.out.println("helooo");
		}

	

	
		

	}


