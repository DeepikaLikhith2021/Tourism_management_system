package Pattern_Programs;

public class NumSquarePattern {
	/*
	 * 0 1 2 3 4 5 
		0 1 2 3 4 5 
		0 1 2 3 4 5 
		0 1 2 3 4 5 
		0 1 2 3 4 5 
	 */

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
