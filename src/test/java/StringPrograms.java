
public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String s="malayalam";//gadag
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			System.out.println(rev);
			
		}
		if(rev.equals(s))
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}

	}

}
