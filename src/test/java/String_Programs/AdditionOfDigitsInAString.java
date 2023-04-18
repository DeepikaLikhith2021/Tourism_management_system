package String_Programs;

public class AdditionOfDigitsInAString {

	public static void main(String[] args) {
		String s="b2c11d5";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;  //48 seems to be ascii of zero
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}
}
