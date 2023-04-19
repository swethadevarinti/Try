package selenium;

class integervariable0{
	static int num1=6;
	int num2=8;
	                    
	public static void variable1() {
		System.out.println("static variables");
	}
	public void hardwork() {
			System.out.println("nonstatic variables");
		}
	
}
public class Integervariable {

	public void main(String[] args) {
		System.out.println("c1");
integervariable0.variable1();  // static method with classname

integervariable0 c4=new integervariable0();
int c6=integervariable0.num1; // static variables with object
System.out.println(c6);
int c2=c4.num2;  //non static variables with object
System.out.println(c2);

	}
}
