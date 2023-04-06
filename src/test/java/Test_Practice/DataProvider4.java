package Test_Practice;

import org.testng.annotations.DataProvider;

public class DataProvider4 {
@DataProvider
	public Object[][] data()  {
		Object[][] obj=new Object[2][2];
	obj[0][0]="bangalore";
	obj[0][1]="mysore";
		
		obj[1][0]="hyderabad";
		obj[1][1]="mumbai";
		
		return obj;
	}
}
