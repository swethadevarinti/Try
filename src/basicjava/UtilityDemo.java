package basicjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilityDemo {

	public static void main(String[] args) {

		List list=new ArrayList();
		list.add(456);
		list.add(651);
		list.add(45623);
		list.add(89524);
		list.add(16987);
		list.add(912);
		list.add(765);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.binarySearch(list, 651);
		
		
		
		String [] str= {"java","selenium","job","hardwork"};
		for (int i=0;i<str.length;i++)	{
			System.out.println(str[i]);
		}
		//List list1 =Arrays.asList(str);
		Arrays.sort(str);
	
		for (int i=0;i<str.length;i++)	{
			System.out.println(str[i]);
		}
int status =Arrays.binarySearch(str, "java");
System.out.println(status);
	}
	
}




	




