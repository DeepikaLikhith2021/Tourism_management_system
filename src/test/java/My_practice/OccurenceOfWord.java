package My_practice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class OccurenceOfWord {

	public static void main(String[] args) {
		String s="My name is rishav";
		String st[]=s.split("");
		LinkedHashSet<String>  set= new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++) {
			set.add(st[i]);
		}
		for (String str : set) {
			
		int count=0;
		for(int i=0;i<st.length;i++) {
			if(str.equals(st[i])) {
				count++;
				System.out.print(st[i]+"  "+count);
			}
			
		}
		
		}
	}
}

		
		

	


