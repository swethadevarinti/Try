package basicjava;


class OverloadDemo
{
	int num1=65,num2=225;
	

public int addition(int num1 ,int num2)
{
	int  result=num1+num2;
	System.out.println("int int Result is :result");
	return result;
}
	
	
		public double addition(double num1 ,double num2)
		{
			double  result=num1+num2;
			System.out.println("double double is :double");
			return result;
		}
			
	
	
	
	
	
}
public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverloadDemo demo = new OverloadDemo();
demo.addition(65,225);
demo.addition(250.50,250.50);
demo.addition('a', 'b');
	}

}
