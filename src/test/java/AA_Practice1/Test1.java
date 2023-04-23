package AA_Practice1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test1 {

	
	@Test(enabled=false)
	public void t001() {
		System.out.println("1");
	}
		@Test(priority=-1)
		public void t002() {
			System.out.println("2");
		}
			
			@Ignore
			public void t003() {
				System.out.println("3");
			}
				
				@Test(invocationCount=0)
				public void t004() {
					System.out.println("4");
				}
					

	}


