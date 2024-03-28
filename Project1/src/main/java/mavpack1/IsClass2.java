package mavpack1;

public class IsClass2 
{
String address;
IsClass1 is;

public IsClass2(String address,IsClass1 is)
{
	super();
	this.address=address;
	this.is=is;

	
}


public void studentd()
{
	
	System.out.println(is.sname);
	System.out.println(is.rno);
	System.out.println(address);
}
	public static void main(String[] args) 
	{
		IsClass1 obj = new IsClass1("Vedha",1);
		IsClass2 obj2 = new IsClass2("north chennai",obj);
		obj2.studentd();
		
		

	}

}
