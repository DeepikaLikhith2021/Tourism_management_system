package System_test_TestNG;

import java.util.HashMap;
import java.util.Map.Entry;

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

public class Tour_packages_book extends BaseClass {
	@Test
	public void T003() throws Throwable {

		FileUtility fLib = new FileUtility();

		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		String ADMINUSERNAME = fLib.readDataFromPropertyFile("adminusername");
		String ADMINPASSWORD = fLib.readDataFromPropertyFile("adminpassword");

		HomePage hg = new HomePage(driver);
		Book_Tour_packagesPage btp = new Book_Tour_packagesPage(driver);
		HomePageAfterLogin hpal = new HomePageAfterLogin(driver);
		Admin_login_page alp = new Admin_login_page(driver);
		Admin_dashboardPage ad = new Admin_dashboardPage(driver);

		Thread.sleep(2000);
		hg.SignIn();
		WebElement element = driver.findElement(By.xpath("//input[@placeholder ='Enter your Email']"));
		wLib.elementtobevisible(element, driver);
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
		
		hg.TourPackages();

		wLib.scrollBarAction(driver);
		PackageListPage plp = new PackageListPage(driver);
		plp.searchPackageAndClick(wLib, driver, "ISLAND", "8500");
		PackageDetailsPage pdp = new PackageDetailsPage(driver);
		pdp.booktour(eLib, wLib, driver);
		hpal.logout();
		hg.AdminLogin();

		alp.adminusername(ADMINUSERNAME, ADMINPASSWORD);
		alp.click_submit();
		ad.managebooking();
		ad.clicksidebar();

		Manage_bookingPage mb1 = new Manage_bookingPage(driver);
		mb1.confirmbooking("anuj@gmail.com", "ISLAND", "good tour", wLib, driver);

		ad.logoutadmin();
		ad.clicklogout();
		ad.backtohome();
		HomePage hp = new HomePage(driver);
		hp.SignIn();
		Thread.sleep(2000);
		lp.login(USERNAME, PASSWORD);
		

	}

}
