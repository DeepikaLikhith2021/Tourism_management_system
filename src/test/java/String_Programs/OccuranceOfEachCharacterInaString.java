package String_Programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class OccuranceOfEachCharacterInaString {

	public static void main(String[] args) {
		String st="Kannada";
		String s=st.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {//ch=k ch=a ch=n ch=n 
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println("occurance of character    " +ch+"  "+count);
			
		}
			
		
		
	}

}
