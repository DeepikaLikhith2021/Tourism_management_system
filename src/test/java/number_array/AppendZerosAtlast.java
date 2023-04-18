package number_array;

public class AppendZerosAtlast {

	public static void main(String[] args) {
	
		
		int a[]= {5,0,2,0,3,0};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==0)//in the place of condition
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}
		
		
		
		
	}

}
