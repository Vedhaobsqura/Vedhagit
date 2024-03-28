package mavpack1;

public class MavenClass1 extends MavParent
{
	
	
	public MavenClass1()
	{
		super();
	}
public void sub()

{ 
	
	super.add();
	System.out.println(super.a);
}
	public static void main(String[] args) 
	{
		MavenClass1 obj = new MavenClass1 ();
		obj.sub();

	}

}
