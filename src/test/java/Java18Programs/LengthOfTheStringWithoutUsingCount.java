package Java18Programs;

public class LengthOfTheStringWithoutUsingCount {

	public static void main(String[] args) {
		String a = "amazon";
		for (int i = 0; i <= 5; i++) {
			int count = 0;
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				count++;
			}
			if(count>1)
			{
				System.out.println(count);
			}
		}
		

	}

}
