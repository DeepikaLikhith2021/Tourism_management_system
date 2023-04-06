package Test_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.IPathConstant;

public class DataAcessbyGU {
	@Test(dataProvider = "data")
	public void getdata(String src, String dest) {
		System.out.println("source----->" + src + "-----dest---->" + dest);
	}

	@DataProvider
	public Object[][] data() throws Throwable {

		ExcelUtility elib = new ExcelUtility();
		Object[][] value = elib.readMultiplesetofdata("dataProvider");
		return value;

	}

}
