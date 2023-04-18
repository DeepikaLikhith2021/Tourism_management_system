package Pattern_Programs;

public class LeftDownRightAngle {

	public static void main(String[] args) {
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//i=1 1<=5t
			for(int j=i;j<=n;j++)
			{
				//j=1 1<=5t
				//j=2 2<=5t ****
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
