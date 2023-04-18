package Java18Programs;

public class Program2 {

	public static void main(String[] args) {
		int a[]= {7,-3,0,2,1,-9};
		int fmin=Integer.MAX_VALUE; int smin=Integer.MAX_VALUE,tmin=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(fmin>a[i])
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(smin>a[i]&&a[i]!=fmin)
			{
				smin=a[i];
			}
			else if(tmin>a[i]&&a[i]!=smin)
			{
				tmin=a[i];
			}
		}

		
		System.out.println(fmin+" "+smin+" "+tmin);
		System.out.println(fmin*smin*tmin);
	}
}


