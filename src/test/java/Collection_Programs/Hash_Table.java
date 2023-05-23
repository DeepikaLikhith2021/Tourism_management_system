package Collection_Programs;

import java.util.Hashtable;

import org.apache.commons.collections4.MultiSet.Entry;

public class Hash_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
		map.put(20, "hi");
		map.put(40, "hello");
		map.put(70, "bye");
		//map.put(null, "bye");//not allowed
		//map.put(60, null);//not allowed
		map.put(70, "hihello");
		map.put(70, "good");//override
		map.put(50, "hi");
		map.put(50, "hi");
		
		System.out.println(map);
		for(java.util.Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+"   "+m.getValue());
			
		}
		System.out.println(map.contains("hello"));
		System.out.println(map.contains(50));
		map.remove(70);
		map.remove(70, "hihello");
		System.out.println(map.get(50));
		System.out.println(map);
		//div[@class='rom-btm']
	}

}
