package String_Programs;

public class ReverseTheWoedInaSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am a software engineer";// i ma a erawtfos
		String[] st = s.split("");
		for (int i = 0; i < st.length; i++) {
			String str = st[i];
			for (int j = str.length() - 1; j >= 0; j--) {
				System.out.println(str.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
