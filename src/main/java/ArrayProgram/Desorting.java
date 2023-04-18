package ArrayProgram;

public class Desorting {

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
			System.out.println(a[i]);
			
		}
		System.out.println("first maximum num    "+a[0]);
		System.out.println("first maximum num    "+a[1]);
		System.out.println(a[a.length-1]);
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		
		

	}




	}


