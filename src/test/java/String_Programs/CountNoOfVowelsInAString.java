package String_Programs;

public class CountNoOfVowelsInAString {

	public static void main(String[] args) {
		String str = "engineer";
		String st = str.toLowerCase();
		char[] s = st.toCharArray();

		int count = 0;

		for (int i = 0; i < s.length; i++) {

			if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
			{
				count++;
				System.out.println(s[i]);

			}

		}
		System.out.println("=" + count);

	}

}
