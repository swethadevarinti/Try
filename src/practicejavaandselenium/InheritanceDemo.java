package practicejavaandselenium;

class Inheritanceone
{
	public void Hardwork()
	{
		System.out.println("hardwork parent");
		
	}
	public void Success()
	{
		System.out.println("success parent");
	}
}

class Inheritance1 extends Inheritanceone
{
	public void strength()
	{
		System.out.println("strength child");
	}
	public void success()
	{
		System.out.println("success child");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		//Inheritanceone inheritance=new Inheritanceone();
		//inheritance.Hardwork();
		//inheritance.Success();
		
		Inheritance1 a=new Inheritance1();
		a.Hardwork();
		a.Success();
		a.strength();

	}

}
