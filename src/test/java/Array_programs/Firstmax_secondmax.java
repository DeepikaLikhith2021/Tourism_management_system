package Array_programs;

public class Firstmax_secondmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,8,3,0};
		int fmax=a[2];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				a[i]=fmax;
			}
			
		}
		System.out.println(fmax);
		
	}

}
