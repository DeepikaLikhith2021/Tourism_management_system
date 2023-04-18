package Array_programs;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,2,4,5};
		int b[]= {3,5,2,1,3,2};
		int length=a.length+1;
		if(a.length>b.length)
		{
			length=b.length;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+b[i]+"    ");
		}
	}

}
