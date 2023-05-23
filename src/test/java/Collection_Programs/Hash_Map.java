package Collection_Programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Object> map=new HashMap<Integer, Object>();
		map.put(20, "hi");
		map.put(40, "hello");
		map.put(null, "hi");
		map.put(null, null);
		map.put(60, null);
		map.put(80, null);
		map.put(70, "bye");
		map.put(70, "hihello");
		map.put(50, "hi");
		map.put(50, "hello");
		map.put(50, "hi");
		map.replace(50, "hello");
		System.out.println(map);
		
		
		for ( Entry<Integer, Object> m:map.entrySet()) {
			System.out.println(m.getKey()+"   "+m.getValue());
			
			
		}
		System.out.println(map.containsKey(50));
		map.remove(70);
		map.remove(70,"hihello");
		System.out.println(map.get(50));
		System.out.println("get the map"+map);
	}
	

}
