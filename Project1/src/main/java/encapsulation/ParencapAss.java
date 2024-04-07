package encapsulation;

public class ParencapAss 
{
	private int userpin;
 private int newpin;
 private int accno;
 
 public void setter(int newpin)
 {
	 this.newpin=newpin;
	// System.out.println(newpin);
 }
 
	
	public boolean setter1(int userpin,int newpin)
	{
		if(userpin==newpin)
		{
			return true;
			//System.out.println("Valid User Pin");
		}
		else 
		{
			return false;
			//System.out.println("Error");
		}
		
	}
	
	public void getter()
	{
		System.out.println(newpin);
		System.out.println("Valid User Pin");
		System.out.println("Error");
	}
}
