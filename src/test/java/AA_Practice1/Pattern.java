package AA_Practice1;

import java.util.LinkedHashSet;

public class Pattern {

	public static void main(String[] args) {
		
		String a = "hihihello";
		String[] b=a.split("");
		
		LinkedHashSet<String> set =new LinkedHashSet<String>();
		
		for(int i=0;i<b.length;i++) {
			set.add(b[i]);
		
		}
		for (String st: set) {
			int count=0;
			for(int i=0;i<b.length;i++)
			{
			if(st.equals(b[i]))
			{
				count++;
			}
			
			
			
		}
			System.out.println(st+ "    " +count);
			
			
		}
		
		
	}
}