package Test_Practice;

import org.testng.annotations.Test;


	public class DtTest1 {
		@Test(dataProviderClass = Dataprovider3.class, dataProvider ="data" )
		public void getdata(String src,String dst) {
			System.out.println("from  "+src+"  to   "+dst);
		}

	}



