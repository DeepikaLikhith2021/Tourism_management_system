package String_Programs;

public class SegregateAlphanumAndSpecialCharacters {

	public static void main(String[] args) {
		String str = "a2B*c5?d";//o/p=aBcd 25 *?
		String alpha="";
		String num=" ";
		String spc=" ";
		char[] s=str.toCharArray();
		

		for (int i = 0; i < s.length; i++) {

			if (s[i] >='a' && s[i]<='z' || s[i]>='A' &&s[i]<='Z')
			{
				
				alpha=alpha+s[i];

			}
			else if(s[i]>='0' && s[i]<='9')
			{
				num=num+s[i];
			}
			else
			{
				spc=spc+s[i];
				
			}
			
		}
		System.out.println(alpha+""+num+""+spc);
			
			

		}
		
		

	}
	


