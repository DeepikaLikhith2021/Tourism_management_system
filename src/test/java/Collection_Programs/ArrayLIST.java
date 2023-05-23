package Collection_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLIST {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		list.add("java");
		list.add(1.22);
		list.add('r');
		System.out.println(list);
		
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(23);
		list1.add(5);
	
		Collections.sort(list1);
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
		if(list.contains("java")) {
			System.out.println("is present");
		}
		else {
			System.out.println("not present");
		}
		
		
		System.out.println(list.get(2));//fetch the element present in index 2
		System.out.println("size of the array"+list.size());//
		System.out.println("remove 3rd index"+list.remove(3));//remove the elements present in index 3
		System.out.println(list.indexOf("java"));//[rint the index of java
		System.out.println("getClass=====>");
		for(Object value :list) //fetch element one by one
		{
			System.out.println("value======>"+value);
		}
			Iterator<Object> it = list.iterator();//fetch elements using iterator method
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			
		

	}

}
