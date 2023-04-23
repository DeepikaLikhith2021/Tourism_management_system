package string_array;



public class ReverseOnlyWordsinSentence {

	public static void main(String[] args) {
		String s="i m from the town";
		String []sp=s.split(" ");
		String sr="";
		for (int i = 0; i < sp.length; i++) {
			sr=sr+" "+revw(sp[i]);
		}
		System.out.println(sr);
	}

	
	public static String revw(String s)
	{
		String rev="";
		for (int i = s.length()-1; i >=0 ; i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	
	
	
}
