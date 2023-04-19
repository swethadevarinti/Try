package basicjava;

class constwo
{
	int id=91456;
	String result="HARDWORK=JOB";
	public void hardwork()
	{
		System.out.println(id+""+result);
	}
}
class consone extends constwo
{
	int id=456;
	String result="JOB";
	public void hello()
	{
		int id=456456;
		String result="JOB JOB";
		System.out.println(id+""+result);
		System.out.println(this.id+""+this.result);
		System.out.println(super.id+""+super.result);
		super.hardwork();
	}
}
public class ConsDemo {
public static void main(String[] args) {
	consone consone=new consone();
	consone.hello();
}
}
