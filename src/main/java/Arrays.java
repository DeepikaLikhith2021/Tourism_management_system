
public class Arrays {

	public static void main(String[] args) {
		
		int a[]= {1,8,9,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;j++)
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
		

	}

}
