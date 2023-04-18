package ArrayProgram;

public class Find1standMaxnoWithoutUsingBBSort {

	public static void main(String[] args) {
		int [] a= {0,5,3,0,1,4};
		int fmin=a[2];
		int smin=a[5];
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin) {
				if(a[i]!=fmin) {
					smin=fmin;
					
				}
				fmin=a[i];
				
			}
			else if(fmin==smin || smin>a[i]) {
				smin=a[i];
				
			}
		}
		System.out.println("The 1st min no is:   "+fmin);
		System.out.println("The 2nd min no is:   "+smin);

	}

}
