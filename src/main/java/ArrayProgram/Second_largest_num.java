package ArrayProgram;

public class Second_largest_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,0,1,3};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=a[i];
					
					}
				
				}
			
			}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println((a.length-1));
		
		
		}
	}


