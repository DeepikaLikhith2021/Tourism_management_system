package number_array;

public class ArrayBoubleSortAscending {

	public static void main(String[] args) {
		int a[]= {5,1,0,4,2,3};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
				}
			}
			System.out.println(a[i]);
		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println(a);
	}

}
