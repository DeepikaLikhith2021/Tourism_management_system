package String_Programs;

import java.util.LinkedHashSet;

public class asd { //get the position of the number from the last
	public static void main(String[] args) {
		String st="kannada";//a=3 n=2
		String s=st.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {//ch=k ch=a ch=n ch=n 
			
			for(int i=s.length()-1;i>=0;i--) {
				if(ch==s.charAt(i))
				{
					System.out.println(ch+ " is present in  "+(i+1));
					break;
				}
			}
		}
	
	}
	
}