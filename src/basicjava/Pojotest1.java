package basicjava;

class pojoDemo1
{
	private int PractHrs=9;
	private String hardwork="result";
	private static String name ="ramesh soft";
	private double salary = 125000;
	

	
	
	public void setPractHrs(int practHrs) 
	{
	 this.PractHrs=practHrs;
	}
	
	public void sethardwork(String hardwork)
	{
		this.hardwork=hardwork;
	}
	
	public  void setname(String name)
	{
		this.name=name;
	}
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	
		
	public int getPractHrs()
	{
		return PractHrs;
	}
	
	
    public static String getname()
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

public class Pojotest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   pojoDemo1 demo=new pojoDemo1();
   demo.setPractHrs(9);
   demo.sethardwork("job");
   demo.setname("rameshsoft");
   demo.setsalary(125000.5);

	}

}
