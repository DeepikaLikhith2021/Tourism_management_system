package com.Travel.TMS_generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String readdatafromexcel(String SheetName, int RowNo, int ColumnNo) throws Throwable, IOException{
		FileInputStream fi= new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(SheetName);
		String value = sh.getRow(RowNo).getCell(ColumnNo).getStringCellValue();
		return value;
		
	}
	public int getLastRowNo(String SheetName) throws Throwable {
		FileInputStream fi= new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(SheetName);
		int count=sh.getLastRowNum();
		return count;
		
	}
	public void writedataintoExecl(String SheetName, int RowNo, int ColumnNo, Date data) throws Throwable {
		FileInputStream fi= new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(SheetName);
		sh.getRow(RowNo).createCell(ColumnNo).setCellValue(data);
		FileOutputStream fis= new FileOutputStream(IPathConstant.EXCELPATH);
		wb.write(fis);
		
	}
	public HashMap<String, String> readMultipleData(String SheetName) throws Throwable {
		FileInputStream fi= new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(SheetName);
		int count=sh.getLastRowNum();
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=0;i<=count;i++) {
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value=sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		return map;
	}

	public ArrayList<String> readMultipleData(String SheetName, int column) throws Throwable {
		FileInputStream fi= new FileInputStream(IPathConstant.EXCELPATH);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(SheetName);
		int count=sh.getLastRowNum();
		 ArrayList<String> map = new ArrayList<String>();
		for(int i=0;i<=count;i++) {
			String key = sh.getRow(i).getCell(column).getStringCellValue();
			//String value=sh.getRow(i).getCell(0).getStringCellValue();
			map.add(key);
		}
		return map;
	}
	public Object[][] readMultiplesetofdata(String SheetName) throws Throwable {
		 FileInputStream fis =new  FileInputStream(IPathConstant.EXCELPATH);
		 Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet(SheetName);
		 int lastRow = sh.getLastRowNum()+1;
		 int lastCell=sh.getRow(0).getLastCellNum();

		 
		Object[][] obj = new Object[lastRow][lastCell];
		for(int i=0;i<lastRow;i++) {
			for(int j=0;j<lastCell;j++) {
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		 
		 
	}
	
	
	}


