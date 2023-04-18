package ArrayProgram;

public class FirstMaxWithoutUsingBB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,0,1,4};
		int fmax=a[0];
		for(int i=0;i<a.length;i++) {
			if(fmax<a[i]) {
				fmax=a[i];
				
			}
		}
		System.out.println(fmax);

	}

}
