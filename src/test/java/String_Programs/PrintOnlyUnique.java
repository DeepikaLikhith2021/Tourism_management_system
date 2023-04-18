package String_Programs;

import java.util.LinkedHashSet;

public class PrintOnlyUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,4,1,5,3,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{

			
				set.add(a[i]);
			}
			
	for (Integer st : set) { 
		int count=0;
			
				for(int i=0;i<a.length;i++)
				{
					if(st.equals(a[i]))
					{
						count++;
					}
				}
						System.out.println(st+ " is repeating in===> "+count);
						
					}
			}
}