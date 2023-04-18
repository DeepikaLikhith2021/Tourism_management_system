package string_array;

import java.util.LinkedHashSet;
public class RemoveDuplicateWordInaSentense {

	public static void main(String[] args) {
		String st="I am I am a Software Engineer";
		String[] s=st.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for (int i = 0; i < s.length; i++){
			set.add(s[i]);
		}
		for (String str : set) {
			System.out.print(str+" ");
		}
	}
}
