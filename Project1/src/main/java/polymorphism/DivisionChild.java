package polymorphism;

public class DivisionChild extends AdditionParent


{
	
	public void add()
	{
		super.add();
	  
	
	int d=sum/10;
	System.out.println(d);
	}
	
	

	public static void main(String[] args) 
	
	{
		
		DivisionChild obj = new DivisionChild();
		obj.add();
		
		
	}

}
