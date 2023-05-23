package Collection_Programs;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> set=new HashSet<Object>();
		set.add(10);
		set.add("hi");
		set.add(null);
		set.add("hello");
		set.add(null);
		set.add(10);
		
		System.out.println(set);
		ArrayList<Object> list  =new ArrayList<Object>(set);
		System.out.println("first entry of list"+list);
		list.add(20);
		list.add("bye");
		System.out.println(list);
		System.out.println(set.size());
		System.out.println(list.size());
		

	}

}
