package Test_Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider2 {
	@Test(dataProvider="data")
	public void getData(int a,int b,int c,int d) {
		System.out.println(a+" "+b+" "+c+""+d);
	}
	
	
	@DataProvider
	public Object[][][][] data() {
		Object[][][][] obj= new Object[1][1][1][1];
		obj[0][0][0][1]=1;
		return obj;
		
	}

}
