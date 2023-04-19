package basicjava;


class Encapuslation
{
	int practHrs=9;
	String hardwork ="result";
	
	public void hello() {
		System.out.println(practHrs+"  "+hardwork);
	}

	public int getPractHrs() {
		return practHrs;
	}


	public String getHardwork() {
		return hardwork;
	}


	}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapuslation demo = new Encapuslation();
demo.hello();
demo.practHrs=5;
demo.hardwork="JOB";
demo.hello();
	
}

}
