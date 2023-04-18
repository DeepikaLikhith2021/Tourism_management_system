package String_Programs;

public class ReverrseTheWord {

	public static void main(String[] args) {
		String s = "I am a software engineer";
		String[] st = s.split(" ");
		String reverseWord = "";
		for (String e : st) {
			String rev = "";
			for (int i = e.length() - 1; i >= 0; i--) {
				rev = rev + e.charAt(i);
			}
			reverseWord = reverseWord + rev + " ";
			}
		System.out.println(reverseWord);
	}

}
