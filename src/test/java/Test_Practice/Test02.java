package Test_Practice;

import org.testng.annotations.Test;

import com.Travel.TMS_generic_utility.BaseClass;

public class Test02 extends BaseClass {
	@Test(groups = {"smoke","regression"})
	public void test03() {
		System.out.println("------test03------");
	}
	@Test
	public void test04() {
		System.out.println("------test04------");
	}

}
