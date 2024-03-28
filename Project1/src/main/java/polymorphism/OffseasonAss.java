package polymorphism;

public class OffseasonAss extends OnseasonAss
{

	
	public void discount()
	{
		super.discount();
	float dis1= price*0.15f;
		System.out.println(dis1);
		
	}

	public static void main(String[] args) 
	{
		OffseasonAss obj = new OffseasonAss();
		obj.discount();

	}

}
