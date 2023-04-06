package System_test_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
import org.testng.annotations.Test;

import com.Object_repository.Admin_dashboardPage;
import com.Object_repository.Admin_login_page;
import com.Object_repository.Book_Tour_packagesPage;
import com.Object_repository.HomePage;
import com.Object_repository.HomePageAfterLogin;
import com.Object_repository.LoginPage;
import com.Object_repository.Manage_enquiry;
import com.Travel.TMS_generic_utility.BaseClass;
import com.Travel.TMS_generic_utility.DatabaseUtility;
import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.FileUtility;
import com.Travel.TMS_generic_utility.JavaUtility;
import com.Travel.TMS_generic_utility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class t001 extends BaseClass {
@Test
	public void Manage_enquiries() throws Throwable {
		
		// TODO Auto-generated method stub
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
		WebDriver driver = new ChromeDriver();
		HomePage hg = new HomePage(driver);
		Book_Tour_packagesPage btp = new Book_Tour_packagesPage(driver);
		HomePageAfterLogin hpal = new HomePageAfterLogin(driver);
		Admin_login_page alp = new Admin_login_page(driver);
		Admin_dashboardPage ad = new Admin_dashboardPage(driver);
		
		
	
		Manage_enquiry me=new Manage_enquiry(driver);
		me.enquiry();
		Thread.sleep(2000);
		ArrayList<String> data = eLib.readMultipleData("Enquiry", 1);
		Thread.sleep(2000);
		me.submit();
		hg.AdminLogin();

		alp.adminusername(ADMINUSERNAME, ADMINPASSWORD);
		alp.click_submit();
		ad.manageenquiries();
		ad.clicksidebar();
		me.read(wLib, driver);
}
}
		