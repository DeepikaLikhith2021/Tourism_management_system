package string_array;

public class String_Palindrome {

	public static void main(String[] args) {
		String s="nitin";
		String srev="";
		
		//METHOD-1	--uisng empth Stirng
		for (int i = s.length()-1; i >=0; i--) {
			srev=srev+s.charAt(i);
		}
		if(s.equals(srev))
		{
			System.out.println("palidrome");
		}
		else
		{
			System.out.println("not palindrome");
		}	
		
		
	/*	//METHOD-2	using string builder
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sr = sb.reverse();
		System.out.println(sr);
		if(sr.equals(s))
		{
			System.out.println("palidrome");
		}
		else
		{
			System.out.println("not palindrome");
		}	*/
	}

}
