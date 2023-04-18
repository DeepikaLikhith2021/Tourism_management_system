package number_array;

public class Secondmin_num_inArray {

	public static void main(String[] args) {
		int a[]= {123,54,3234,789,12,9,6};
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

		System.out.println("2nd min num in array is: "+a[1]);
	}

}
