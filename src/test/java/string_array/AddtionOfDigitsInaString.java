package string_array;

public class AddtionOfDigitsInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "a34bc@1H8fR*M;";

		int sum = 0;

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum = sum + (ch - 48);
			}
		}
		System.out.println(sum);
	}

}
