package encapsulation;

public class ParentEncap 

{
	
	private int a;
	private int b;
	int c;
	
	
	public void setter(int a,int b)
	{
		this.a=a;
		this.b=b;
		 c=a+b;
		
	}
public void getter()
{
	
	System.out.println(c);
}

}
