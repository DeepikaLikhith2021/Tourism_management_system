package string_array;

public class CountUPPERandLOWERletter {

	public static void main(String[] args) {
		String s="NitEEsh";
		int ucount=0,lcount=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lcount++;
			}
			else 
			{
				ucount++;
			}
		}
System.out.println("lower letters: "+lcount);
System.out.println("upper letters: "+ucount);
	}

}
