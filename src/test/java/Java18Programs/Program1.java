package Java18Programs;

import java.util.LinkedHashSet;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a3b2cd3f
   String s="aaabbcdddf";
   LinkedHashSet set=new LinkedHashSet();
   for(int i=0;i<s.length();i++)
   {
	   set.add(s.charAt(i));
   }
   for (Character st : set) {
	   for(int i=0;i<s.length();i++)
	   {
		 if(s.charAt(i)>='a' && s.charAt(i)<='z')  
		 {
			 
		 }
	
	   }
   }
	}
}
   

  