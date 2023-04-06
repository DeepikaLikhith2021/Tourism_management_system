package System_using_POM_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Object_repository.Book_Tour_packagesPage;
import com.Object_repository.HomePage;
import com.Object_repository.HomePageAfterLogin;
import com.Object_repository.LoginPage;
import com.Travel.TMS_generic_utility.BaseClass;
import com.Travel.TMS_generic_utility.DatabaseUtility;
import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.FileUtility;
import com.Travel.TMS_generic_utility.JavaUtility;
import com.Travel.TMS_generic_utility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInUsingPOM  extends BaseClass{
	@Test
	public void t002() throws Throwable {
		FileUtility fLib = new FileUtility();
		DatabaseUtility dLib = new DatabaseUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebdriverUtility wLib = new WebdriverUtility();
		jLib.random();

		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		String ADMINUSERNAME = fLib.readDataFromPropertyFile("adminusername");
		String ADMINPASSWORD = fLib.readDataFromPropertyFile("adminpassword");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		wLib.maximizeWindow(driver);
//		Thread.sleep(2000);
		driver.get(URL);
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
	
	
	
	String actual="anuj@gmail.com";
	WebElement expt=driver.findElement(By.xpath("//li[text()='anuj@gmail.com']"));
	if(actual.equals(expt)) {
		System.out.println("sign in successful");
		
	}
	else {
		System.out.println("sign in not happened");
	}
	driver.quit();
	
	
	
	}

}
