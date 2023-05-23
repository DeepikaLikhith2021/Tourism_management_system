package System_using_POM_pages;

import java.util.ArrayList;
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
import com.Object_repository.Create_packagePage;
import com.Object_repository.HomePage;
import com.Object_repository.HomePageAfterLogin;
import com.Object_repository.Insidecreatepackage;
import com.Object_repository.LoginPage;
import com.Object_repository.PackageListPage;
import com.Travel.TMS_generic_utility.DatabaseUtility;
import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.FileUtility;
import com.Travel.TMS_generic_utility.JavaUtility;
import com.Travel.TMS_generic_utility.WebdriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_tour  {
@Test
	public static void main(String[] args) throws Throwable {
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

		wLib.maximizeWindow(driver);
		Thread.sleep(2000);
		driver.get(URL);
		wLib.wait_For_PageLoad(driver);

		Thread.sleep(2000);

		hg.AdminLogin();

		alp.adminusername(ADMINUSERNAME, ADMINPASSWORD);
		alp.click_submit();
		Create_packagePage cp = new Create_packagePage(driver);
		cp.createpackage(wLib, driver);
		cp.create(wLib, driver);

		ArrayList<String> map = eLib.readMultipleData("CreatePackage", 1);
		Thread.sleep(2000);
		Insidecreatepackage icp = new Insidecreatepackage(driver);
		icp.createPackage(map);
		icp.tillscroll(wLib, driver);
		Thread.sleep(2000);
		icp.createbutton();
//		
		String actual="SUCCESS:Package Created Successfully";
		String expc=driver.findElement(By.xpath("//div[@class='succWrap']")).getText();
		if(actual.contains(expc)) {
			System.out.println("create package");
		}
		else {
			System.out.println("not created");
		}
		ad.logoutadmin();
		ad.clicklogout();
		ad.backtohome();
		Thread.sleep(2000);
		hg.SignIn();
		WebElement element = driver.findElement(By.xpath("//input[@placeholder ='Enter your Email']"));
		wLib.elementtobevisible(element, driver);
		Thread.sleep(2000);
		driver.findElement(By.linkText("/ Sign In")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
//		LoginPage lp = new LoginPage(driver);
//		lp.login(USERNAME, PASSWORD);
		hg.TourPackages();

		wLib.scrollBarAction(driver);
		PackageListPage plp = new PackageListPage(driver);
		plp.searchPackageAndClick(wLib, driver, "bangalore palace", "3500");
		String exp="bangalore palac";
		String actual1=driver.findElement(By.xpath("//h2[text()='bangalore palace']")).getText();
		if(actual1.contains(exp)) {
			System.out.println("tour validated");
		}
		else {
			System.out.println("tour not validated");
		}
		driver.quit();
		
		 
	}

}
