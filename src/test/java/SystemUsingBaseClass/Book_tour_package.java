package SystemUsingBaseClass;

import org.openqa.selenium.By;
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
import com.Object_repository.Manage_bookingPage;
import com.Object_repository.PackageDetailsPage;
import com.Object_repository.PackageListPage;
import com.Travel.TMS_generic_utility.BaseClass;
import com.Travel.TMS_generic_utility.DatabaseUtility;
import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.FileUtility;
import com.Travel.TMS_generic_utility.JavaUtility;
import com.Travel.TMS_generic_utility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Book_tour_package extends BaseClass{
	@Test
	public class Tour_packages_book {
		

//			FileUtility fLib = new FileUtility();
//			DatabaseUtility dLib = new DatabaseUtility();
//			ExcelUtility eLib = new ExcelUtility();
//			JavaUtility jLib = new JavaUtility();
//			WebdriverUtility wLib = new WebdriverUtility();
//			
//
//			String URL = fLib.readDataFromPropertyFile("url");
//			String USERNAME = fLib.readDataFromPropertyFile("username");
//			String PASSWORD = fLib.readDataFromPropertyFile("password");
//			String ADMINUSERNAME = fLib.readDataFromPropertyFile("adminusername");
//			String ADMINPASSWORD = fLib.readDataFromPropertyFile("adminpassword");
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//
//			HomePage hg = new HomePage(driver);
//			Book_Tour_packagesPage btp = new Book_Tour_packagesPage(driver);
//			HomePageAfterLogin hpal = new HomePageAfterLogin(driver);
//			Admin_login_page alp = new Admin_login_page(driver);
//			Admin_dashboardPage ad = new Admin_dashboardPage(driver);
//
//			wLib.maximizeWindow(driver);
//			Thread.sleep(2000);
//			driver.get(URL);
//			wLib.wait_For_PageLoad(driver);
//
//			Thread.sleep(2000);
//			hg.SignIn();
//			WebElement element = driver.findElement(By.xpath("//input[@placeholder ='Enter your Email']"));
//			wLib.elementtobevisible(element, driver);
//			Thread.sleep(2000);
//			LoginPage lp = new LoginPage(driver);
//			lp.login(USERNAME, PASSWORD);
//			hg.TourPackages();
//
//			wLib.scrollBarAction(driver);
//			PackageListPage plp = new PackageListPage(driver);
//			plp.searchPackageAndClick(wLib, driver, "etrtrr", "0");
//			PackageDetailsPage pdp = new PackageDetailsPage(driver);
//			pdp.booktour(eLib, wLib, driver);
//			hpal.logout();
//			hg.AdminLogin();
//
//			alp.adminusername(ADMINUSERNAME, ADMINPASSWORD);
//			alp.click_submit();
//			ad.managebooking();
//
//			Manage_bookingPage mb1 = new Manage_bookingPage(driver);
//			mb1.Cancelthebooking(wLib, driver);
//
//			driver.quit();
//
//		}
//
//	}
//
//
}
}
