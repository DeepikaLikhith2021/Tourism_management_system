package number_array;

public class MultipleOfFirst3_min_num_inArray {
	public static void main(String[] args) {
		int a[]= {234,456,89,8,123,6,5};
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
		int mul=1;
		for (int i = 0; i < 3; i++) {
			mul=mul*a[i];
		}
		
		System.out.println("mul of 1st 3 min number :"+mul);
}
}
