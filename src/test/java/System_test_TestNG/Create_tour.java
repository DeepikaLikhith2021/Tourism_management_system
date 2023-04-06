package System_test_TestNG;

import java.util.ArrayList;
import org.openqa.selenium.By;
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
import com.Travel.TMS_generic_utility.BaseClass;
import com.Travel.TMS_generic_utility.FileUtility;

public class  Create_tour extends BaseClass {
	@Test(groups = "regression")
	public void t002() throws Throwable {
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

		String actual = "SUCCESS:Package Created Successfully";
		String expc = driver.findElement(By.xpath("//div[@class='succWrap']")).getText();
		if (actual.contains(expc)) {
			System.out.println("create package");
		} else {
			System.out.println("not created");
		}
		ad.logoutadmin();
		ad.clicklogout();
		ad.backtohome();
//		Thread.sleep(2000);
//		hg.SignIn();
//
//		Thread.sleep(2000);
//		LoginPage lp = new LoginPage(driver);
//		lp.login(USERNAME, PASSWORD);
//		hg.TourPackages();
//
//		wLib.scrollBarAction(driver);
//		PackageListPage plp = new PackageListPage(driver);
//		plp.searchPackageAndClick(wLib, driver, "bangalore palace", "3500");
//		String exp = "bangalore palac";
//		String actual1 = driver.findElement(By.xpath("//h2[text()='bangalore palace']")).getText();
//		if (actual1.contains(exp)) {
//			System.out.println("tour validated");
//		} else {
//			System.out.println("tour not validated");
//		}

	}

}
