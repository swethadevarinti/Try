package basicjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
	
		HashMap map=new HashMap();
		map.put(123, "hello");
		map.put("name", "vani");
		map.put("target","job");
		map.put('d', 91456);
		map.put(null, null);
		map.put(91456, 91456);
		Object obj1 =map.get(456);
		System.out.println(obj1);
		System.out.println(map);
		
		Set keys =map.keySet();
		System.out.println(keys);
	
		
	
	}

}
