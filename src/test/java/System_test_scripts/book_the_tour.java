package System_test_scripts;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class book_the_tour {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Commonfor_TMS.properties");
		Properties property=new Properties();
		property.load(fi);
		String URL=property.getProperty("url");
		String USERNAME=property.getProperty("username");
		String PASSWORD=property.getProperty("password");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//login
		driver.findElement(By.linkText("/ Sign In")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		driver.findElement(By.linkText("Tour Packages")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='package-details.php?pkgid=2']")).click();
		
		
		//excel
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData (2).xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("book_the_tour");
		HashMap<String, String> map = new HashMap<String, String>();
	
		int count=sh.getLastRowNum();
		for(int i=1;i<=count;i++) {
			String key=sh.getRow(i).getCell(0).getStringCellValue();
			String value=sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
			
		}
		for(Entry<String, String> set:map.entrySet()) {
			
			driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
			

			
		}
	

//		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1005)");
		
		
		//data from excel
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("dfghjkghj");
		driver.findElement(By.xpath("//button[.='Book']")).click();
		//logout as user
		driver.findElement(By.xpath("//a[.='/ Logout']")).click();
		
		
		
		
//		HashMap<String, String> map = new HashMap<String, String>();
//		for(int i=0;i<=sh.getLastRowNum();i++) {
//			String key=sh.getRow(i).getCell(0).getStringCellValue();
//			String value=sh.getRow(i).getCell(1).getStringCellValue();
//			map.put(key, value);
//		}
//		for(Entry<String, String> set:map.entrySet()) {
//			driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
//		}
		driver.quit();
//		
	}
}
		