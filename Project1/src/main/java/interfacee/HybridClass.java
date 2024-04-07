package interfacee;

public class HybridClass implements HybridInterface2

{

	public static void main(String[] args) 
	{
		HybridClass obj =new HybridClass();
		obj.show1();
		obj.show2();
		
		
		
		

	}

	@Override
	public void show2() {
		System.out.println("gm");
		
	}

	@Override
	public void show1() {
		System.out.println("hello");
	}

}
