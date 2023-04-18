package ArrayProgram;

public class FirstWithoutUsingBB {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a[]= {5,3,0,1,4};
//		int fmin=a[0];
//		int smin=a[0];
//		for(int i=0;i<a.length;i++) {
//			if(a[i]<fmin) {
//				smin=fmin;
//				fmin=a[i];
//				
//			}
//			else if(a[i]<smin)
//			{
//				smin=a[i];
//			}
//		}
//		System.out.println("the first min no is  "+fmin);
//		System.out.println("the second min no is  "+smin);
//
//	}
//
//}

/////////////////////
int a[]= {5,3,0,1,4};
int fmin=a[0];
int smin=a[0];
for(int i=0;i<a.length;i++) {
	if(a[i]<fmin) {
		smin=fmin;
		fmin=a[i];
		
	}
	else if(a[i]<smin)
	{
		smin=a[i];
	}
}
System.out.println("the first min no is  "+fmin);
System.out.println("the second min no is  "+smin);

}

}

