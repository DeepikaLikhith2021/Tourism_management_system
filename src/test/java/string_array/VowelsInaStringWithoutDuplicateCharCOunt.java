package string_array;

import java.util.LinkedHashSet;

public class VowelsInaStringWithoutDuplicateCharCOunt {

	public static void main(String[] args) {
		String st="Engineer";
		String s=st.toLowerCase();
		char []c= {'a','e','i','o','u'};
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		int Vcount=0;
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for(Character ch:set)
		{
			for (int j = 0; j < c.length; j++) {	
				if(ch==c[j])
				{	
					Vcount++;
					System.out.println(ch);
				}	
			}	
		}	
		System.out.println("vowel in the trings are : "+Vcount);
	
	}

}
