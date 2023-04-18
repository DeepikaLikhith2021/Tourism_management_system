package string_array;

import java.util.LinkedHashSet;

public class PositionOfWOrdsWithoutDuplicateInSenetence {

	public static void main(String[] args) {
		String st="I am I am software engineer";

		String s[]=st.split(" ");
		LinkedHashSet<String> set =new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}

		//forword Index
		for (String str : set) {
			for (int i = 0; i < s.length; i++) {
				if(str.equals(s[i]))
				{
					System.out.println("this "+str+" Position is "+(i+1)+" in the sentence");
					break;
				}
			}
		}

		//backword index
		System.out.println();
		for (String str : set) {
			for (int i = s.length-1; i >=0; i--) {
				if(str.equals(s[i]))
				{
					System.out.println("this "+str+" Position is "+(i+1)+" in the sentence");
					break;
				}
			}
		}
	}

}
