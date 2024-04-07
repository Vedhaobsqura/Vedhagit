package abstraction;

public class ChiAbstract extends Abstract
{
//we can decclare here means it becomes abstract methodint a=10;int b=20;
	public static void main(String[] args) 
	{
		ChiAbstract obj=new ChiAbstract();
		obj.display();
        obj.Instance();
        obj.print();
	}

	@Override
	public void display()
{
		
		int d=a-b;
		System.out.println(d);
	}
	
	public void print()
	{
		int e=a*b;
		System.out.println(e);
	}

}

