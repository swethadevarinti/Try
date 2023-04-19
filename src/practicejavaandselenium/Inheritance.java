package practicejavaandselenium;


class Redmi{
	
	public void redcolour()
	{
		System.out.println("redcolour");
	}
	public void storage()
	{
		System.out.println("storage");
	}
	
}
class Oppo extends Redmi
   {
	@Override
	public void redcolour() {
		System.out.println("oppo red colour");
	}
	
	public void gallery() {
		System.out.println("gallery");
	}
   }
	
public class Inheritance {
	

	public static void main(String[] args) {
	
		//1.creating object parent class
		
		Redmi redmi=new Redmi();
		redmi.redcolour();
		redmi.storage();
		
		//2.creating object of child class
		
		Oppo oppo=new Oppo();
		oppo.gallery();
		oppo.redcolour();
		oppo.storage();
		
		//3.creating object child class with reference of parent class
		
		Redmi redm=new Oppo();
		
		redm.redcolour();
		redm.storage();
		
		
		}

}
