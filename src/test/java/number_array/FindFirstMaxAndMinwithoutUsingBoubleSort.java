package number_array;

public class FindFirstMaxAndMinwithoutUsingBoubleSort {
	public static void main(String[] args) {
		int a[]= {5,6,3,1,0};
		FindFirstMaxAndMinwithoutUsingBoubleSort b=new FindFirstMaxAndMinwithoutUsingBoubleSort();
		b.p1(a);
		b.p2(a);
}

public  void p1(int a[])
{
	int fmax=a[0];
	for (int i = 0; i < a.length; i++) {
		if(fmax<a[i])
		{
			fmax=a[i];
		}
	}

	System.out.println("First max number: "+fmax);
	}


public  void p2(int a[])
{
	int fmin=a[0];
	for (int i = 0; i < a.length; i++) {
		if(fmin>a[i])	//5>5f //5>6f //5>3t //3>1t	//1>0	
		{
			fmin=a[i];	//3	//1 //0
		}
	}

	System.out.println("First min number: "+fmin);
	}

}