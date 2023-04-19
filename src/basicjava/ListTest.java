package basicjava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] argus) {
		
		//List list=new ArrayList();
		
		Vector vector=new Vector();
		vector.add("java");
		vector.add("selenium");
		vector.add("job");
		vector.add("hardwork");
		vector.add("job");
		vector.add("java");
		
		System.out.println(vector);
		
		Enumeration enumeration =vector.elements();
		 
		while(enumeration.hasMoreElements()) {
			Object obj=enumeration.nextElement();
			String str1=(String)obj;
			if(str1.equalsIgnoreCase("job"));
			System.out.println("do hardwork guys");
			
			System.out.println(str1);
		}
	

	}

}