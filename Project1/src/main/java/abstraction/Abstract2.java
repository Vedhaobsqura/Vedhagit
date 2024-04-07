package abstraction;

public class Abstract2 extends Abstract1 
{
	
	

	public static void main(String[] args) 
	{
		Abstract2 obj=new Abstract2();
		obj.display();
		
		//Abstract1 obj1= new Abstract1(); we will not be creating parent 
		
		//parent obj=new child();
		Abstract1 obj1= new Abstract2(); 
		

	}

	@Override
	public void display() {
		int d=a*b;
		System.out.println(d);
	}

}
