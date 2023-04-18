package string_array;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterinString {

	public static void main(String[] args) {
		String s="NitEEsh";
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
	 for (Character c : hs) {
		System.out.print(c);
	}
	}

}
