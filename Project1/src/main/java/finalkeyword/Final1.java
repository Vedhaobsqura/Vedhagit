package finalkeyword;

//public class Final1 extends Final3
public class Final1
{
	final int a=20;
	public void display()
	{
	System.out.println(a);
	
	}
	
	/*public Final1()
	{
		a=20;
	}*/
	
	
	public final void print()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) 
	{
		Final1 obj=new Final1();
		obj.display();
		obj.print();

	}

}
