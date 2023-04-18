package String_Programs;

public class MyPractice {

	public static void main(String[] args) {
		String s="mohana is very talented girl";
		String[] st=s.split(" ");
		String reverserword="";
		for (String e : st) {
			String rev="";
			for(int i=e.length()-1;i>=0;i--)
			{
				rev=rev+e.charAt(i);
			}
			 reverserword= reverserword+rev+" ";
			
		}
		System.out.println(reverserword);
		

	}

}
