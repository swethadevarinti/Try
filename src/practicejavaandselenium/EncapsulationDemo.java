package practicejavaandselenium;

class EncapuslationTest


{
	private int a;
	private int b;
	private static String name;
	
	public void hello()
	{
		System.out.println("hello");
	}
	
	public int getA() {
		System.out.println(a);
		return a;
	}

public void setA(int a) {
		this.a = a;
		System.out.println(a);
	}

public int getB() {
	System.out.println(b);
		return b;
	}

public void setB(int b) {
		this.b = b;
		System.out.println(b);
	}


public static String getName() {
	System.out.println(name);
		return name;
	}

public static void setName(String name) {
		name = name;
		System.out.println(name);
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
	
		EncapuslationTest t1=new EncapuslationTest();
		t1.setA(10);
		t1.getA();
		t1.setB(30);
		t1.getB();
		t1.setName("hema");
		t1.getName();
		
		
		

	}

}
	






		
	







