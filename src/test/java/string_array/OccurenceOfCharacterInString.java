package string_array;



public class OccurenceOfCharacterInString {

	public static void main(String[] args) {
		//METHOD-1
		String s="niteesh";
		char c='e';
		int count=0;
		for (int i = 0; i < s.length(); i++) {

			if(c==s.charAt(i))
			{
				count++;
			}

		}
		System.out.println("this "+c+" is occured "+count+" in the string\n" );

		//METHOD-2 without using Collection
		String s1="niteesh";
		char c1,c2;
		int count1=0;
		for (int i = 0; i < s1.length(); i++) {
			c1=s1.charAt(i);
			count1=0;
			for (int j = 0; j < s1.length(); j++) {
				c2=s1.charAt(j);
			
			if(c1==c2)
			{
				count1++;
			}
			}
			System.out.println("this "+c1+" is occured "+count1+" in the string" );
			
			
			
			
		
		
		
		
		
		
		
		}

	}

}
