package Collection_Programs;

import java.util.TreeSet;

public class Tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Object> set=new TreeSet<Object>();
		set.add(100);
		set.add(80);
		set.add(1);
		set.add(2);
		//set.add(null);null pointer exception
		//set.add("java");class cast exception
		System.out.println(set);
		System.out.println(set.descendingSet());
	

	}

}
