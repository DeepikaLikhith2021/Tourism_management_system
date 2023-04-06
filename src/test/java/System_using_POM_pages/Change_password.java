package System_using_POM_pages;

import java.util.HashMap;

import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Object_repository.Change_password1page;
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
@Listeners(com.Travel.TMS_generic_utility.ListnerImplementationClass.class)

public class Change_password  extends BaseClass{
	@Test
	public void t001() throws Throwable {
		
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
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		wLib.maximizeWindow(driver);
		Thread.sleep(2000);
		driver.get(URL);
		wLib.wait_For_PageLoad(driver);

		 HomePage hg=new  HomePage(driver);
		 hg.SignIn();
		 WebElement element=driver.findElement(By.xpath("//input[@placeholder ='Enter your Email']"));
		 wLib.elementtobevisible(element, driver);
		 LoginPage lp=new LoginPage(driver);
		 lp.login(USERNAME, PASSWORD);
		 HomePageAfterLogin hpal=new HomePageAfterLogin(driver);
		 hpal.changepassword();
		
		 HashMap<String, String> map =	eLib.readMultipleData("change_password");
		 for(Entry<String, String> set: map.entrySet()) {
				
				driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
				

				
			}
		Thread.sleep(2000);
		 Change_password1page cp=new Change_password1page(driver);
		 cp.changepasswordbutton();
		 driver.quit();
		 
		
	}

}
