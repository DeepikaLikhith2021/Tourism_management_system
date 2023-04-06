package System_test_scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

import com.Object_repository.Book_Tour_packagesPage;
import com.Object_repository.HomePage;
import com.Object_repository.HomePageAfterLogin;
import com.Object_repository.LoginPage;
import com.Travel.TMS_generic_utility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manage_enquiries {

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
		Thread.sleep(2000);
		driver.get(URL);
		WebdriverUtility wLib=new WebdriverUtility();
		wLib.wait_For_PageLoad(driver);
		HomePage hg=new  HomePage(driver);
		Book_Tour_packagesPage btp=new Book_Tour_packagesPage(driver);
		HomePageAfterLogin hpal=new HomePageAfterLogin(driver);

		 
		 Thread.sleep(2000);
		 hg.SignIn();
		 WebElement element=driver.findElement(By.xpath("//input[@placeholder ='Enter your Email']"));
		 wLib.elementtobevisible(element, driver);
		 Thread.sleep(2000);
		 LoginPage lp=new LoginPage(driver);
		 Thread.sleep(2000);
		 lp.login(USERNAME, PASSWORD);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click on enquiry
		driver.findElement(By.xpath("//a[text()=' Enquiry ']")).click();
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Enquiry");
		HashMap<String, String> map = new HashMap<String, String>();
	
		int count=sh.getLastRowNum();
		for(int i=1;i<=count;i++) {
			String key=sh.getRow(i).getCell(0).getStringCellValue();
			String value=sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
			
		}
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		for(Entry<String, String> set:map.entrySet()) {
			
			driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
			

			
		}
		

		
		driver.findElement(By.xpath("//button[@name='submit1']")).click();
		
		
		//login as admin
		driver.findElement(By.linkText("Admin Login")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ADMINUSERNAME);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ADMINPASSWORD);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		//navigate to enquiries
		driver.findElement(By.xpath("//span[text()='Manage Enquiries']")).click();
		driver.findElement(By.xpath("//span[text()='#TCKT-20']/../following-sibling::td[6]/span/a[text()='Pending']")).click();
		driver.findElement(By.xpath("//span[text()='Administrator']")).click();
		driver.findElement(By.linkText(" Logout")).click();
		//logout admin

	}

}
