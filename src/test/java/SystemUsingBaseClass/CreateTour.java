package SystemUsingBaseClass;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Object_repository.Admin_dashboardPage;
import com.Object_repository.Admin_login_page;
import com.Object_repository.Book_Tour_packagesPage;
import com.Object_repository.Create_packagePage;
import com.Object_repository.HomePage;
import com.Object_repository.HomePageAfterLogin;
import com.Object_repository.Insidecreatepackage;
import com.Travel.TMS_generic_utility.BaseClass;
import com.Travel.TMS_generic_utility.DatabaseUtility;
import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.FileUtility;
import com.Travel.TMS_generic_utility.JavaUtility;
import com.Travel.TMS_generic_utility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class CreateTour extends BaseClass {
	
		FileUtility fLib = new FileUtility();
		
		DatabaseUtility dLib = new DatabaseUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebdriverUtility wLib = new WebdriverUtility();
	
		
		
//		String ADMINUSERNAME = fLib.readDataFromPropertyFile("adminusername");
//		String ADMINPASSWORD = fLib.readDataFromPropertyFile("adminpassword");
//		
		HomePage hg = new HomePage(driver);
		Book_Tour_packagesPage btp = new Book_Tour_packagesPage(driver);
		HomePageAfterLogin hpal = new HomePageAfterLogin(driver);
		Admin_login_page alp = new Admin_login_page(driver);
		Admin_dashboardPage ad = new Admin_dashboardPage(driver);

//		wLib.maximizeWindow(driver);
//		Thread.sleep(2000);
//		driver.get(URL);
//		wLib.wait_For_PageLoad(driver);
//
//		Thread.sleep(2000);
//
//		hg.AdminLogin();
//
//		alp.adminusername(ADMINUSERNAME, ADMINPASSWORD);
//		alp.click_submit();
//		Create_packagePage cp = new Create_packagePage(driver);
//		cp.createpackage(wLib, driver);
//		cp.create(wLib, driver);
//
//		ArrayList<String> map = eLib.readMultipleData("CreatePackage", 1);
//		Thread.sleep(2000);
//		Insidecreatepackage icp = new Insidecreatepackage(driver);
//		icp.createPackage(map);
//		icp.tillscroll(wLib, driver);
//		Thread.sleep(2000);
//		icp.createbutton();
////		
//		String actual="SUCCESS:Package Created Successfully";
//		String expc=driver.findElement(By.xpath("//div[@class='succWrap']")).getText();
//		if(actual.contains(expc)) {
//			System.out.println("create package");
//		}
//		else {
//			System.out.println("not created");
//		}
		

}



