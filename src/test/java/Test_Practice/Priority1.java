package Test_Practice;

import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority=-1)
	public void create() {
		System.out.println("test-1");
		
	}
	@Test(priority=0)
	public void enter() {
		System.out.println("test-2");
	}
	

}
