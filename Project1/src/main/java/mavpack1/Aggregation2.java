package mavpack1;

public class Aggregation2 
{
String place;
Aggregation1 ag;

public Aggregation2(String place,Aggregation1 ag)
{
	this.place=place;
	this.ag=ag;
	
}

public void display()
{
	System.out.println(place);
	System.out.println(ag.age);
	System.out.println(ag.name);
}
	public static void main(String[] args)
	{
		Aggregation1 obj = new Aggregation1("Vedha",25);
		
		Aggregation2 obj1 = new Aggregation2("Chennai",obj);
		obj1.display();
		
		

	}

}
