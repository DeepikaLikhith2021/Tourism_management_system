package String_Programs;

import java.util.LinkedHashSet;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		int a[]= {4,5,4,1,5,3,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for (Integer integer : set) {
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(integer.equals(a[i]))
				{
					count++;
				}
			}
					System.out.println(integer);
					
		
	
			
		}
	}
}