package string_array;

import java.util.LinkedHashSet;

public class COuntOnlyUniqueWordsInaSentence {

	public static void main(String[] args) {
		String st="I am I am software engineer";

		String s[]=st.split(" ");
		LinkedHashSet<String> set =new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}


		for (String str : set) {
			int count=0;
			for (int i = 0; i < s.length; i++) {
				if(str.equals(s[i]))
				{
					count++;

				}
			}
			if(count==1)
			{
				System.out.println(str+" occured "+count+" times");
			}
		}


	}

}
