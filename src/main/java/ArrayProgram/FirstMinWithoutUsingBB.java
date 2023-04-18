package ArrayProgram;

public class FirstMinWithoutUsingBB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,0,1,4};
		int fmin=a[1];
		for(int i=0;i<a.length;i++) {
			if(fmin>a[i]) {
				fmin=a[i];
				
			}
		}
		System.out.println(fmin);
		System.out.println("First manimum    "+(fmin));
		System.out.println("second manimum    "+(fmin+1));
		System.out.println("Third minimum    "+(fmin+2));
	}

}
