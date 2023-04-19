package practicejavaandselenium;

class Demo
{
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);		
	}
	public void add (float a,float b)
	{
		float c = a+b;
	System.out.println(c);
	}
	public void add (double a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}

}

public class Overloading {

	public static void main(String[] args) {
		
   Demo demo=new Demo();
   
   demo.add(20,30);
   demo.add(50, 90);
   demo.add(1000, 20300);
	}

}
