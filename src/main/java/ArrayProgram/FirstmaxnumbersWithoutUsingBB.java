package ArrayProgram;

public class FirstmaxnumbersWithoutUsingBB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,0,1,4};
		int fmax=a[3];
		for(int i=0;i<a.length;i++) {
			if(fmax<a[i]) {
				fmax=a[i];
				
			}
			//System.out.println(fmax);
		}
		System.out.println("First maximumnum    "+(fmax));
		System.out.println("second maximumnum   "+(fmax-a[0]));
		System.out.println("Third maximumnum    "+(fmax-2));
//		int sum=0;
//		for(int i=0;i<3;i++) {
//			sum=sum+fmax;
//		}
//		System.out.println("sum of last three num  "+sum);

	}

	}


