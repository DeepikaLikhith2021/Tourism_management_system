package AA_Practice1;

import java.util.LinkedHashSet;

public class String1 {

	public static void main(java.lang.String[] args) {
		String st="abcabcdfsr";
		char[] ch=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				count++;
				System.out.println(ch[i]);
			}
			if(count>1)
			{
				
			}
		}
		
		
		
	}
}

		