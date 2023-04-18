package number_array;

public class FIrstmin_num_inArray {

	public static void main(String[] args) {
		int a[]= {456,321,96,25,68,79964,2};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
						
						
				}
			}
		} 

		System.out.println("\n1st min num in array: "+a[0]);
	}

}
