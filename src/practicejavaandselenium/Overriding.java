package practicejavaandselenium;

abstract class overridingDemo
{
	public void Bag()
	{
	System.out.println("bag");
	}
	abstract public void Brush();
	}
class mobile extends overridingDemo
{   @Override
	public void Brush()
	{
		System.out.println("redbrush");
	}
	public void shoes()
	{
		System.out.println("shoes");
	}
	public void Bag()
	{
	System.out.println("bag child");
	super.Bag();
	}
	 
	
}

public class Overriding {

	public static void main(String[] args) {
		
		mobile m1=new mobile();
		m1.Brush();
		m1.shoes();
		m1.Bag();

	}

}
