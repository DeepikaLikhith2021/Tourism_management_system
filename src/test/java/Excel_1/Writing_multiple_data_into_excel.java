package Excel_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writing_multiple_data_into_excel {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Organization and location.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("sheet1");
		
		
		for(int i=1;i<=4;i++) {
			sheet.createRow(i).createCell(0).setCellValue("sdfg");
			for(int j=1;j<=4;j++) {
			sheet.createRow(j).createCell(1).setCellValue("sdfghjj");
		
			
			
FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Organization and location.xlsx");
wb.write(fos);
			}
		wb.close();
	}
		
}
}

