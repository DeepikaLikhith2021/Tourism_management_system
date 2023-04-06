package Excel_1;

import org.testng.annotations.Test;

public class ex {
	@Test(dataProvider="data")
	public void getdata(String src)  {
		System.out.println("source"+src);
		
		
		
	}
	public Object[][] data() {
		Object[][] Obj = new Object[2][3];
		Obj[0][0]=2;
		return Obj;
		
	}
	
	}
		
//		FileInputStream fis = new FileInputStream ("");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sh=wb.getSheet("sheet1");
//		Row rw=sh.getRow(0);
//		Cell cell=rw.getCell(0);
//		cell.getStringCellValue();
//		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		String path="vhjnkm";
//		File dest=new File(path);
//		FileUtils.copyFile(src, dest);
//		
		
		
		
		

