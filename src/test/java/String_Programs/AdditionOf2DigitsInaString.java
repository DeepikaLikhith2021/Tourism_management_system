package String_Programs;

public class AdditionOf2DigitsInaString {

	public static void main(String[] args) {
		String s = "b222c1d5";
		int tsum = 0;
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int n = s.charAt(i) - 48; // 48 seems to be ascii of zero
				tsum = tsum * 10 + n;
			} 
			else 
			{
				sum = sum + tsum;
				tsum = 0;
			}
		}
		sum = sum + tsum;
		System.out.println(sum);
	}

}
