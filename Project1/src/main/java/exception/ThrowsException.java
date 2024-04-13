package exception;

import java.io.IOException;

public class ThrowsException {
	public void display() throws IOException {
throw new IOException("This is IO Exception");
	}

	public static void main(String[] args) throws IOException
	{
		
		ThrowsException obj = new ThrowsException();
		obj.display();
		System.out.println("helooo");
	}

}
