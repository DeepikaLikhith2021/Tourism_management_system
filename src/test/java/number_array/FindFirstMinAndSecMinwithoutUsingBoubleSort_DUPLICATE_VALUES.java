package number_array;

public class FindFirstMinAndSecMinwithoutUsingBoubleSort_DUPLICATE_VALUES {
	public static void main(String[] args) {
 		int a[]= {5,6,3,1,1,4,1};
		int fmin=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {

			if(a[i]<fmin)
			{
				smin=fmin;
				fmin=a[i];
				
			}
			else if(a[i]<smin && a[i]!=fmin)
			{
				smin=a[i];
			}
		}

		System.out.println("1st min number in array: "+fmin);
		System.out.println("2nd min number in array: "+smin);	
		
}
}
