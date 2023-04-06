package Excel_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_data_excel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Specific data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet1");
		Row row=sh.getRow(1);
		Cell cell=row.getCell(1);
		cell.setCellValue("hi");
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\Specific data.xlsx");
		wb.write(fos);
		wb.close();
	

	}

	

}
