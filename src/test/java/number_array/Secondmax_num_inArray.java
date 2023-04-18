package number_array;

public class Secondmax_num_inArray {

	public static void main(String[] args) {
		
			int a[]= {234,456,89,8,123,6};
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
						
					}
				}
			}
			
			System.out.println(a[1]);

	}

}
