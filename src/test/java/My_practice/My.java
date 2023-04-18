package My_practice;

import java.util.LinkedHashSet;

public class My {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="aaabbcccc";
		
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i=0;i<st.length();i++) {
			
			set.add(st.charAt(i));
			
		}
		for (Character ch : set) {
			int count=0;
			for(int i=0;i<st.length();i++)
			{
				if(ch.equals(st.charAt(i))) {
					count++;
				}
				
			
		}
			System.out.println(ch+" "+count);
		
		
			 
		}
	
	}




}
