package System_generic_utility;


import java.util.HashMap;
import java.util.Properties;
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

import com.Object_repository.HomePage;
import com.Object_repository.LoginPage;

import com.Travel.TMS_generic_utility.DatabaseUtility;
import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.FileUtility;
import com.Travel.TMS_generic_utility.IPathConstant;
import com.Travel.TMS_generic_utility.JavaUtility;
import com.Travel.TMS_generic_utility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Book_the_tour_using_generic {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileUtility fLib = new FileUtility();
		DatabaseUtility dLib=new DatabaseUtility();
		
		ExcelUtility eLib=new ExcelUtility();
		JavaUtility jLib=new JavaUtility();
		WebdriverUtility wLib=new WebdriverUtility();
		
				
				String URL=fLib.readDataFromPropertyFile("url");
				String USERNAME=fLib.readDataFromPropertyFile("username");
				String PASSWORD=fLib.readDataFromPropertyFile("password");
				String ADMINUSERNAME=fLib.readDataFromPropertyFile("adminpassword");
				String ADMINPASSWORD=fLib.readDataFromPropertyFile("adminpassword");
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				//maximize
				wLib.maximizeWindow(driver);
				//go to browser enter the url
				Thread.sleep(2000);
				driver.get(URL);
				//implicit wait
				wLib.wait_For_PageLoad(driver);
				//login
				HomePage hp=new HomePage(driver);
				hp.getSignInLink();
				//driver.findElement(By.xpath("//a[@data-target='#myModal4']")).click();
				//WebElement element=driver.findElement(By.xpath("//input[@placeholder ='Enter your Email']"));
				//wLib.elementtobevisible(element, driver);
				LoginPage lp=new LoginPage(driver);
				Thread.sleep(2000);
				wLib.wait_For_PageLoad(driver);
				WebElement element=driver.findElement(By.xpath("//input[@placeholder ='Enter your Email']"));
				wLib.elementtobevisible(element, driver);
				lp.login(USERNAME, PASSWORD);
				Thread.sleep(2000);
				
				
//				WebElement element=driver.findElement(By.xpath("//input[@placeholder ='Enter your Email']"));
//				wLib.elementtobevisible(element,driver);
//				element.sendKeys(USERNAME);
//				driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PASSWORD);
//				driver.findElement(By.xpath("//input[@name='signin']")).click();
//				driver.findElement(By.linkText("Tour Packages")).click();
				//Tour_packages tp=new Tour_packages(driver);
				//tp.Tour_package();
				
				
				wLib.scrollBarAction(driver);
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href='package-details.php?pkgid=2']")).click();
				
				
				//excel
			HashMap<String, String> map = eLib.readMultipleData("book_the_tour");
				Thread.sleep(2000);
//				FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData (2).xlsx");
//				Workbook wb=WorkbookFactory.create(fis);
//				Sheet sh=wb.getSheet("book_the_tour");
//				HashMap<String, String> map = new HashMap<String, String>();
//			
//				int count=sh.getLastRowNum();
//				for(int i=1;i<=count;i++) {
//					String key=sh.getRow(i).getCell(0).getStringCellValue();
//					String value=sh.getRow(i).getCell(1).getStringCellValue();
//					map.put(key, value);
//					
				
				for(Entry<String, String> set: map.entrySet()) {
					
					driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
					

					
				}
			

//				
				Thread.sleep(2000);
				wLib.scrollBarAction(driver);
				//js.executeScript("window.scrollBy(0,1005)");
				
				
				//data from excel
				driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("dfghjkghj");
				driver.findElement(By.xpath("//button[.='Book']")).click();
				//logout as user
				driver.findElement(By.xpath("//a[.='/ Logout']")).click();
				
				
				
				
//				
				
				driver.findElement(By.xpath("/ Logout")).click();
				Thread.sleep(2000);
				WebElement element2=driver.findElement(By.xpath("//a[@href='admin/index.php']"));
				wLib.elementtobevisible(element2, driver);
				element2.click();
				
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ADMINUSERNAME);
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ADMINPASSWORD);
				driver.findElement(By.xpath("//span[text()='Manage Booking']")).click();
				WebElement element1=driver.findElement(By.xpath("//table/tbody/tr[last()]/td/button"));
				wLib.scrollAction(element1, driver);
				driver.quit();
				
				
//				
			}
		
				
	}

