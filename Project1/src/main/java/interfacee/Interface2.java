package interfacee;

//public class Interface2 implements Interface1
public class Interface2 implements Interface1,MultipleInterface1
{

	public static void main(String[] args) 
	{
		Interface2 obj = new Interface2();
		obj.display();
		obj.print();
		obj.show();
	
	//Interfacename obj= new ClassName();//if i wanted to call the interface 
	Interface1 obj1 = new Interface2();
	obj1.display();
	obj1.print();
	
	
	
	}

	@Override
	public void display() {
		//System.out.println("hello");
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void print() {
		//System.out.println("hii");
		int d=a*b;
		System.out.println(d);
		
		
	}

	@Override
	public void show() {

int e=a-b;
System.out.println(e);
		
	}

}
