package basicjava;

public abstract class AbstractDemo {

	public abstract void m1() ;
	public void m2() {
		int c = 1+2;
		System.out.println(":::::m2::::::::::::"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

class child1 extends AbstractDemo{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	public void m2() {
		int c = 10*20;
		System.out.println(":::::m2:::11111111111111:::::::::"+c);
	}
	
	


}


