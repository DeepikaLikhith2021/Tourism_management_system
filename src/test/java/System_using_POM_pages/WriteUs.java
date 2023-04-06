package System_using_POM_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Object_repository.Admin_dashboardPage;
import com.Object_repository.Admin_login_page;

import com.Object_repository.Book_Tour_packagesPage;


import com.Object_repository.HomePage;
import com.Object_repository.HomePageAfterLogin;
import com.Object_repository.LoginPage;
import com.Object_repository.Manage_bookingPage;
import com.Object_repository.Manage_issuesPage;
import com.Object_repository.UpdateRemarkPage;
import com.Object_repository.Write_uspage;
import com.Travel.TMS_generic_utility.DatabaseUtility;
import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.FileUtility;
import com.Travel.TMS_generic_utility.JavaUtility;
import com.Travel.TMS_generic_utility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteUs {
	public static void main(String[] args) throws Throwable {

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
		HomePage hg = new HomePage(driver);
		Book_Tour_packagesPage btp = new Book_Tour_packagesPage(driver);
		HomePageAfterLogin hpal = new HomePageAfterLogin(driver);
		Admin_login_page alp = new Admin_login_page(driver);
		Admin_dashboardPage ad = new Admin_dashboardPage(driver);
		Manage_bookingPage mb = new Manage_bookingPage(driver);
		Manage_issuesPage mi = new Manage_issuesPage(driver);

		wLib.maximizeWindow(driver);
		driver.get(URL);
		wLib.wait_For_PageLoad(driver);
	//	Thread.sleep(2000);
		hg.SignIn();
//		WebElement element = driver.findElement(By.xpath("//input[@placeholder ='Enter your Email']"));
//		wLib.elementtobevisible(element, driver);
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
	lp.login(USERNAME, PASSWORD);
//		driver.findElement(By.linkText("/ Sign In")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys(USERNAME);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PASSWORD);
//		driver.findElement(By.xpath("//input[@name='signin']")).click();
		Thread.sleep(2000);
		hpal.writeisuue();
		
		Write_uspage wu = new Write_uspage(driver);
		wu.writeissue(wLib);
		wu.description(eLib);
		Thread.sleep(2000);
		
		hpal.logout();

		hg.AdminLogin();

		alp.adminusername(ADMINUSERNAME, ADMINPASSWORD);
		alp.click_submit();
		ad.manageissues();
		//
		mi.Manageissue(wLib, driver);
		String title="http://rmgtestingserver/domain/Online_Tourism_Management_System/admin/updateissue.php?iid=10";
		wLib.switchToWindow(driver, title);
		UpdateRemarkPage ur=new UpdateRemarkPage(driver);
		ur.remarktheissue(eLib, title);
		String title1="manageissues.php";
		wLib.switchToWindow(driver, title1);
		ad.logoutadmin();
		ad.clicklogout();
		ad.backtohome();
		Thread.sleep(2000);
		hg.SignIn();

		

	}
}
