package Test_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceldata {
	public static void main(String[] args) throws Throwable {
		
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("multipleData");
		int count=sh.getLastRowNum();
		HashMap<String, String> map=new HashMap();
		for(int i=0;i<count;i++) {
			String key=sh.getRow(i).getCell(0).getStringCellValue();
			String value=sh.getRow(i).getCell(1).getStringCellValue();
			String count2=map.put(key, value);
			System.out.println(key+"     "+value);
			
			
		}
		
		
		
		
		
	}

}
