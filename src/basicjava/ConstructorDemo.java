package basicjava;


class ConstructorsDemo
{
	int practhrs;
	String result;
	public ConstructorsDemo (int practhrs,String result) {
		this.practhrs=practhrs;
		this.result=result;
	}
	public void hello()
	{
		System.out.println(practhrs+""+result);
	}
}
public class ConstructorDemo {
public static void main(String[] args) {
	
	ConstructorsDemo demo=new ConstructorsDemo(9,"JOB");
	demo.hello();
	
}
}
