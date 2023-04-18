package ArrayProgram;

public class Descending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,8,9,2,7};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			//System.out.println(a[i]+"+++++++++++");
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		

	
	}

}
