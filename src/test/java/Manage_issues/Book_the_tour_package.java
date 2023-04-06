package Manage_issues;

import java.util.concurrent.TimeUnit;

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

public class Book_the_tour_package {
	public static void main(String[] args) throws Throwable {
		DatabaseUtility dLib=new DatabaseUtility();
		FileUtility fLib=new FileUtility();
		ExcelUtility eLib=new ExcelUtility();
		JavaUtility jLib=new JavaUtility();
		WebdriverUtility wLib=new WebdriverUtility();
		
		
		
		String URL=fLib.readDataFromPropertyFile("url");
		String USERNAME=fLib.readDataFromPropertyFile("username");
		String PASSWORD=fLib.readDataFromPropertyFile("password");
//		String ADMINUSERNAME=fLib.readDataFromPropertyFile("adminusername");
//		String ADMINPASSWORD=fLib.readDataFromPropertyFile("adminpassword");

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		wLib.maximizeWindow(driver);
		driver.get(URL);
		wLib.wait_For_PageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		driver.findElement(By.xpath("//input[@name='description']")).sendKeys("dfg");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//submit issue
		driver.findElement(By.xpath("//a[.='/ Logout']")).click();
		//logout from user
		
		//login as admin
//		driver.findElement(By.linkText("Admin Login")).click();
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ADMINUSERNAME);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
//		driver.findElement(By.xpath("//input[@name='login']")).click();
//		driver.findElement(By.xpath("//span[text()='Manage Issues']")).click();
//		
//		//scrool till element found
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,6645)");
//		driver.findElement(By.xpath("//span[text()='#00181']"));
//		driver.findElement(By.xpath("//span[text()='#00181']/../following-sibling::td[7]/span/a[text()='View ']")).click();
//		Thread.sleep(2000);
//		//remark issue
//		driver.findElement(By.xpath("//textarea[@name='remark']")).sendKeys("dfghj");
//        //Date date=new Date();
//		driver.quit();
	}

}
