package String_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		
		String s="aabbcdc";
		char[] a=s.toCharArray();
		LinkedHashSet<Character>  set=new LinkedHashSet<Character>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			
		}
		for (Character ch : set) {
			
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a'&& a[i]<='z' )
			{
				if(ch==a[i])
				{
					count++;
				}
			}
			
			}
		if(count<=1) {
			
			System.out.println(ch+"    "+count);
			}
	
		
	}

	}
}


		
	

	


