package number_array;

public class FindFirstMinAndSecMinwithoutUsingBoubleSort {

	public static void main(String[] args) {
		int a[]= {5,6,3,1,0,4};
		int fmin=a[0],smin=a[1];
		for (int i = 0; i < a.length; i++) {

			if(fmin>a[i])
			{
				smin=fmin;
				fmin=a[i];

			}
			else if (smin>a[i])
			{
				smin=a[i];

			}
		}

		System.out.println("1st min number in array: "+fmin);
		System.out.println("2nd min number in array: "+smin);	
	}

}
