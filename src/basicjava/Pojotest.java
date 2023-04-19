package basicjava;

class PojoDemo
{
	private int PractHrs=9;
	private String hardwork="result";
	private static String name ="ramesh soft";
	private double salary = 125000;
	
	
	public int getPractHrs()
	{
		return PractHrs;
	}
	
	
    public String getname()
    {
    	return name;
    }
    
    public String gethardwork()
    {
    	return hardwork ;
    	
    }
    
    public  double getsalary()
    {
    	return salary ;
    	
    }
}


public class Pojotest {

	public static void main(String[] args) {
		 
		PojoDemo demo = new PojoDemo();
		System.out.println(demo.getPractHrs());
		System.out.println(demo.getname());
		System.out.println(demo.gethardwork());		
		System.out.println(demo.getsalary());		 

	}

}
