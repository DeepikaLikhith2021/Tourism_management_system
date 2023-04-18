package string_array;

public class FindtheMaxStringLengthInaStringArray {

	public static void main(String[] args) {
		String []s={"123","1234","12345","12","56"};
		String max_length=s[0];
		for (int i = 0; i < s.length; i++) {
			if(max_length.length()<s[i].length())
			{
				max_length=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(max_length.length()==s[i].length())
			{
				System.out.print(s[i]+" ");
			}
		}
	}
}
