package number_array;

import java.util.Iterator;

public class First3min_MultiplicaionWithoutBBsprt {

	public static void main(String[] args) {
		int a[]= {5,1,10,4,2,3};
		int fmin=Integer.MAX_VALUE; int smin=Integer.MAX_VALUE,tmin=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(fmin>a[i])
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(smin>a[i]&&a[i]!=fmin)
			{
				smin=a[i];
			}
			else if(tmin>a[i]&&a[i]!=smin)
			{
				tmin=a[i];
			}
		}

		
		System.out.println(fmin+" "+smin+" "+tmin);
		System.out.println(fmin*smin*tmin);
	}
}