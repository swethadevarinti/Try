package basicjava;

class parent
{
	public void study()
	{
		System.out.println("pc : study()");
	}
	public void job()
	{
		System.out.println("pc : job()");
	}
	public void play()
	{
		System.out.println("pc : play()");
	}
	public void money()
	{
		System.out.println("pc: money()");
	}
}


class child extends parent
{    @Override 
	public void study()
	{
		System.out.println("cc :i dont study()");
	}

     @Override
	public void job()
	{
		System.out.println("cc : i dont want job()");
	}
	public void frds()
	{
		System.out.println("cc : frds()");
	}
}

public class OverridingTest {

	public static void main(String[] args) {
	parent parent = new parent();
	parent.study();
	parent.job();
	parent.money();
	parent.play();

child parent1=new child();
	parent1.job();
	parent1.money();
	parent1.play();
	parent1.study();
			
	}

}
