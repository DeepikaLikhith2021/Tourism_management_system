package NumberPattern;

public class Num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1
		 * 2 2 
		 * 1 1 1
		 * 2 2 2 2
		 * 1 1 1 1 1  
		 */
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==1)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("2 ");
				}
				
			}
			
			System.out.println();
		}

	}

}
