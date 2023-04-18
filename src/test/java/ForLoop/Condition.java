package ForLoop;

public class Condition {

	public static void main(String[] args) {
//		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//		Ask user for quantity
//		Suppose, one unit will cost 100.
//		Judge and print total cost for user.
		int discount=100/10;
		int cost=4000;
		if(cost>1000)
		{
			
			int new1=cost*discount;
			System.out.println(new1);
		}
		else {
			System.out.println("no discount");
		}
		
		

		}
	}
