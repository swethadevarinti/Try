package basicjava;

import java.util.Comparator;
import java.util.TreeSet;

class 	Customsorting implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String str1=(string);
		System.out.println(456);
		return str1.compareTo(str1);
	}
	
}








public class ComparatorDemo {

	public static void main(String[] args) {
		
    Customsorting customsorting=new Customsorting();
    TreeSet ts=new TreeSet();
    ts.add("hello");
    ts.add("vani");
    ts.add("practice");
    ts.add("job");
    ts.add("hardwork");
    //ts.add(null);
    System.out.println(ts);
    
    
    
	}

}
