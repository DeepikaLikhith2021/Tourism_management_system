package System_test_scripts;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

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
//error while taking
public class Manage_issues {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Commonfor_TMS.properties");
		Properties property=new Properties();
		property.load(fi);
		String URL=property.getProperty("url");
		String USERNAME=property.getProperty("username");
		String PASSWORD=property.getProperty("password");
		String ADMINUSERNAME=property.getProperty("adminusername");
		String ADMINPASSWORD=property.getProperty("password");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		//login
		driver.findElement(By.linkText("/ Sign In")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		
		//create an issue
		driver.findElement(By.xpath("//a[text()=' / Write Us ']")).click();
		WebElement element=driver.findElement(By.xpath("//select[@id='country']"));
		Select select=new Select(element);
		select.selectByValue("Booking Issues");
		
		//EXCEL
		//Manage_issues
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Manage_issues");
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
driver.findElement(By.xpath("//input[@name='description']")).sendKeys("dfg");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//submit issue
		driver.findElement(By.xpath("//a[.='/ Logout']")).click();
		//logout from user
		
		//login as admin
		driver.findElement(By.linkText("Admin Login")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ADMINUSERNAME);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ADMINPASSWORD);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.xpath("//span[text()='Manage Issues']")).click();
		
		//scrool till element found
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6645)");
		driver.findElement(By.xpath("//span[text()='#00181']"));
		driver.findElement(By.xpath("//span[text()='#00181']/../following-sibling::td[7]/span/a[text()='View ']")).click();
		Thread.sleep(2000);
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		while(it.hasNext()) {
			String wind=it.next();
			String currentTitle=driver.switchTo().window(wind).getTitle();
			System.out.println(currentTitle);
			if(currentTitle.contains("updateissue")) {
				break;
				
			}
		}
		System.out.println("window is visible");
		//remark issue
		driver.findElement(By.xpath("//textarea[@name='remark']")).sendKeys("dfghj");
        //Date date=new Date();
		driver.quit();

	}

}
