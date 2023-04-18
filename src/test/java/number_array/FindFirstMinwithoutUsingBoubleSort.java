package number_array;

public class FindFirstMinwithoutUsingBoubleSort {
	public static void main(String[] args) {
		int a[]= {5,6,3,1,0};
		int fmin=a[0];
		for (int i = 0; i < a.length; i++) {
			if(fmin>a[i])
			{
				fmin=a[i];
			}
		}

		System.out.println(fmin);
		}
}
