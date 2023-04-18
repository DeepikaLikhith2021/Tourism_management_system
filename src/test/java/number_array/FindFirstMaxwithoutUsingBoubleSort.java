package number_array;

public class FindFirstMaxwithoutUsingBoubleSort {

	public static void main(String[] args) {
	int a[]= {5,6,3,1,0};
	int fmax=a[0];
	for (int i = 0; i < a.length; i++) {
		if(fmax<a[i])
		{
			fmax=a[i];
		}
	}

	System.out.println(fmax);
	}

}
