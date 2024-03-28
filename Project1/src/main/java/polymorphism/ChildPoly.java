package polymorphism;

public class ChildPoly extends ParentPoly
{
	public void add()
	{
		super.add();
		int f=d+e;
		System.out.println(f);
	}

	public static void main(String[] args) 
	{
		ChildPoly obj = new ChildPoly();
		obj.add();
		

	}

}
