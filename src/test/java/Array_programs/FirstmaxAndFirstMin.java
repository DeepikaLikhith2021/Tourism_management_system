package Array_programs;

public class FirstmaxAndFirstMin {

	public static void main(String[] args) {
		int a[]= {3,1,2,9,0};
		
		int fmin=a[1];
		int smin=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=fmin)
			{
				if(a[i]!=fmin)
				{
					smin=fmin;
				}
				fmin=a[i];
				
				}
			else if(fmin==smin || smin>a[i])
			{
				smin=a[i];
			}
		}
		System.out.println("first minimum no "+fmin);
		System.out.println("first minimum no "+fmin);
		
	}
}
		