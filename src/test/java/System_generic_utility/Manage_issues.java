package System_generic_utility;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

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

import com.Travel.TMS_generic_utility.DatabaseUtility;
import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.FileUtility;
import com.Travel.TMS_generic_utility.JavaUtility;
import com.Travel.TMS_generic_utility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
//error while taking
public class Manage_issues {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileUtility fLib = new FileUtility();
		DatabaseUtility dLib = new DatabaseUtility();

		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebdriverUtility wLib = new WebdriverUtility();

		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		String ADMINUSERNAME = fLib.readDataFromPropertyFile("adminusername");
		String ADMINPASSWORD = fLib.readDataFromPropertyFile("adminpassword");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// maximize
		wLib.maximizeWindow(driver);
		// go to browser enter the url
		Thread.sleep(2000);
		driver.get(URL);
		// implicit wait
		wLib.wait_For_PageLoad(driver);

		// login

		driver.findElement(By.xpath("//a[@data-target='#myModal4']")).click();

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//input[@placeholder ='Enter your Email']"));
		wLib.elementtobevisible(element, driver);
		element.sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@name='signin']")).click();

		// create an issue
		driver.findElement(By.xpath("//a[text()=' / Write Us ']")).click();
		WebElement element2 = driver.findElement(By.xpath("//select[@id='country']"));
		wLib.select("Booking Issues", element2);

		// Manage_issues
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Manage_issues");
		HashMap<String, String> map = new HashMap<String, String>();

		int row = sh.getFirstRowNum();
		for (int i = 1; i <= row; i++) {
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);

		}
		WebElement element3=driver.findElement(By.name("description"));
		wLib.elementtobevisible(element3, driver);
		System.out.println("issues");
		for (Entry<String, String> set : map.entrySet()) {

			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());

		}
		System.out.println("manage");

		driver.findElement(By.name("submit")).click();
		// submit issue
		driver.findElement(By.xpath("//a[.='/ Logout']")).click();
		// logout from user

		// login as admin
		driver.findElement(By.linkText("Admin Login")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ADMINUSERNAME);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ADMINPASSWORD);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.xpath("//span[text()='Manage Issues']")).click();

		// scrool till element found
		WebElement element1 = driver.findElement(By.xpath("//span[text()='#00181']/../following-sibling::td[7]/span/a[text()='View ']"));
		wLib.scrollAction(element1, driver);
		element1.click();

		Thread.sleep(2000);
		// remark issue
		driver.findElement(By.xpath("//textarea[@name='remark']")).sendKeys("dfghj");
		// Date date=new Date();
		driver.quit();

	}

}
