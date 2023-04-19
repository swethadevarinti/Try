package practicejavaandselenium;

abstract  class AbstractDemo
{
	public void hardwork()
	{
		System.out.println("hardwork");
	}
	
	public void success()
	{
		System.out.println("success");
	}                                                                                                                                                                                                 
	
	abstract public void pass();
	
	
}

class Abstractone extends AbstractDemo
{
	public void pass()
	{
		System.out.println("pass");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		Abstractone a1 =new Abstractone();
		a1.hardwork();
		a1.success();
		a1.pass();

	}

}
