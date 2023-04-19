package selenium;

public class LargeNumbers1 {

	public static void main(String[] args) {
		int a=60,b=40,c=30;
		if(a>b)
		{
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else
		{
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
	}

}
