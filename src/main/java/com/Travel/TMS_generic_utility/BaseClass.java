package com.Travel.TMS_generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Object_repository.HomePageAfterLogin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  DatabaseUtility dLib=new DatabaseUtility();
	public FileUtility fLib=new FileUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public WebdriverUtility wLib=new WebdriverUtility();
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite
	public void configBS() throws Throwable {
		
		//dLib.connectionDB();
		System.out.println("----connect to DB----");
		
	}
	
	//@Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	public void configBC() throws Throwable {
		String BROWSER = fLib.readDataFromPropertyFile("browser");
		String URL = fLib.readDataFromPropertyFile("url");
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
		sdriver=driver;
		wLib.maximizeWindow(driver);
		driver.get(URL);
		wLib.wait_For_PageLoad(driver);
		
		
	}
	@BeforeMethod
	public void configBM() throws Throwable{
//		String USERNAME = fLib.readDataFromPropertyFile("username");
//		String PASSWORD=fLib.readDataFromPropertyFile("password");
//		
	}
	@AfterMethod
	public void configAM() {
//		HomePageAfterLogin hpal=new HomePageAfterLogin(driver);
//		hpal.logout();
//		
		
	}
	@AfterClass
	public void configAC() {
		driver.quit();
		
	}
	@AfterSuite
	public void configAS() throws Throwable {
		dLib.closeDB();
		
	}

}
