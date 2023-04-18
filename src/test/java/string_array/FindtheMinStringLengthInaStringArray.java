package string_array;

public class FindtheMinStringLengthInaStringArray {

	public static void main(String[] args) {
		String []s={"abc","abbc","abcde","ab","dc","ec"};

		String min_length=s[0];
		for (int i = 0; i < s.length; i++) {
			if(min_length.length()>s[i].length())
			{
				min_length=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(min_length.length()==s[i].length())
			{
				System.out.print(s[i]+" ");
			}
		}
	}
}
