package Array_programs;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		int[] a = { 4, 3, 4, 5 };
		int[] b = { 3, 1, 5, 6, 7 };// output 7 4 9 11 7
		int length = a.length;// 5
		if (a.length < b.length) {
			length = b.length;

		}

		for (int i = 0; i < length; i++) {
			try {
				System.out.println(a[i] + b[i] + " ");
			} catch (Exception e) {
				if (a.length < b.length) {
					System.out.println(b[i]);
				} else {
					System.out.println(a[i]);
				}
			}

		}
	}

}
