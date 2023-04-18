package string_array;


import java.util.LinkedHashSet;

public class PositionOfaEachCharacterinaStiringONLYDUplicate {

	public static void main(String[] args) {
		String s="Kannada";
		String st=s.toLowerCase();
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			set.add(st.charAt(i));

		}
		for (Character c : set) {
			for (int i = 0; i < s.length(); i++) {
				if(c==s.charAt(i))
				{
					System.out.println("this "+c+" Position is "+(i+1)+" in the string" );
					break;
				}

			}
		}
	}

}
