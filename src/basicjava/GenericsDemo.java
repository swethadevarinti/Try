package basicjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GenericsDemo {

	public List hello() {
	List list =new ArrayList();	
		list.add(456);
		list.add("java");
		
		return list;
		
	}
	public Map<String,String>hello1(){
		Map<String,String>map=new HashMap<String,String>();
		
		map.put("hello", "do practice");
		map.put("java", "hardwork");
		
		return map;
		
	}	
public static void main(String[] args) {
		
		GenericsDemo demo=new GenericsDemo() ;
		List list=demo.hello();
		System.out.println(list);
		
		Map<String,String> map =demo.hello1();
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//List list=new ArrayList();
		//
	//list.add(456);
		//list.add("java");
		
		//List<String>list1=new ArrayList<String>();
		
		//list1.add("java");
		//list1.add("practice");
		
		//Iterator<String>itr=list1.iterator();
		//while(itr.hasNext());
		{
	         //  String str=itr.next();
	           
	           //System.out.println(str);
		}
		

	}

}
