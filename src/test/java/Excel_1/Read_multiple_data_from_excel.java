package Excel_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_multiple_data_from_excel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Organization and location.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("sheet1");
		int count=sheet.getLastRowNum();
		
		for(int i=1;i<=count;i++) {
			String organization=sheet.getRow(i).getCell(0).getStringCellValue();
			String location=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(organization+" "+location );
		}
	}

}
