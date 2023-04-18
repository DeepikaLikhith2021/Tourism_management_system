package number_array;

public class FindFirstMaxAndSecMaxwithoutUsingBoubleSort {
	public static void main(String[] args) {
		int a[]= {5,6,3,1,0,4};
		int fmax=a[0],smax=a[1];
		for (int i = 0; i < a.length; i++) {

			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];

			}
			else if (a[i]>smax)
			{
				smax=a[i];

			}
		}

		System.out.println("1st max number in array: "+fmax);
		System.out.println("2nd max number in array: "+smax);	
	}
}
