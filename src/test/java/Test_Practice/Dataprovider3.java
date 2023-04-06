package Test_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import com.Travel.TMS_generic_utility.IPathConstant;

public class Dataprovider3 {
	

	@DataProvider
	public Object[][] data() throws Throwable {
		FileInputStream fis=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("-");
		int lastRow=sh.getLastRowNum()+1;

		int lastCell=sh.getRow(0).getLastCellNum();
		Object[][] obj=new Object[lastRow][lastCell];//create array
		for(int i=0;i<lastRow;i++) //rows
		{
			for(int j=0;j<lastCell;j++)//columns
			{
				obj[i][j]=sh.getRow(i).getCell(i).getStringCellValue();
			}
		}
		return obj;
	}
}
		
		
		
		
				
		
	


