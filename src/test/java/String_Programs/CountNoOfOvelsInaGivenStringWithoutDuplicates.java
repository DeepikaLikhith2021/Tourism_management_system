package String_Programs;

import java.util.LinkedHashSet;

public class CountNoOfOvelsInaGivenStringWithoutDuplicates {

	public static void main(String[] args) {
		String str = "Engineer";

		String st = str.toLowerCase();
		char[] s = st.toCharArray();
		LinkedHashSet<Character>  set=new LinkedHashSet<Character>();
	
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		int count=0;
		for (Character ch : set) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'  ||ch=='u')
			{
				count++;
				System.out.println(count);
			}
			
			
		}
		System.out.println("  ==" +count);
		
}
}
