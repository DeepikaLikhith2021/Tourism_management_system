package Test_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Practi {
	public static void main(String[] args) {
		
	Map<String,String> map=new HashMap<String ,String>();
	System.out.println(map);
	map.put("name", "deepika");
	map.put("graduate", "BE");
//	
//
//	
	
	while(map.containsKey("name"))
	{
		System.out.println("true");
	}
    for (HashMap.Entry<String , String> entry : map.entrySet()) {
    	
		String key = entry.getKey();
		String val = entry.getValue();
		System.out.println(key +"   "+     val);
		System.out.println(key.hashCode());

    }
   
//		ArrayList list=new ArrayList();
//		list.add("hszjk");
//		list.add("gsdvj");
//		list.add(0);
//		System.out.println(list);
//		System.out.println("==================================");
//		
//		
//		List li=new ArrayList();
//		list.add("@$^");
//		list.add("abc");
//		list.add(0);
//		System.out.println(li);
//		System.out.println("====================================");
//		
//		LinkedList li1=new LinkedList();
//		li1.add("hbczkn");
//		
//		
//		HashSet set=new HashSet();
//		
//		set.add("hi");
//		
//		set.add("gszfhj");
//		set.add("vshb");
//		
//		Iterator it =set.iterator();
//		boolean flag=false;
//		while( it.hasNext()) {
//			Object st= it.next();
//			
//			System.out.println(st);
//			}
//		
//		
		
		String a="deepika123";
		String[] ab = a.split("");
		
		for (int i = 0; i <ab.length; i++) {
			
			
		}
		
		
		
		}
		
		
		
		
		
    }

  
  




