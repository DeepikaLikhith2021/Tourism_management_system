package Collection_Programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedHashSet<Object> set =new LinkedHashSet<Object>();
			set.add(12);
			set.add("java");
			set.add(null);
			set.add(12);
			set.add("calss");
			System.out.println(set);
			
			
			
			ArrayList<Object> a1=new ArrayList<Object>(set);
			a1.add("java");
			a1.add(20);
			
			System.out.println(a1);
			System.out.println(set.size());
			System.out.println(a1.size());
	}

}
