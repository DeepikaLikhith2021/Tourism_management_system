package Test_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotationtest {
	@BeforeSuite
	public void connection() {
		System.out.println("connect to database");
	}
	@BeforeClass
	public void launch() {
		System.out.println("launching the browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login to application");
	}
	@Test
	public void testing() {
		System.out.println("execute the scripts");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout from application");
	}
	@AfterClass
	public void comeoutbrowser() {
		System.out.println("browserout");
	}
	@AfterSuite
	public void closeconnection() {
		System.out.println("close connection");
	}
	@Test
	public void testing1() {
		System.out.println("execute the scripts-01");
	}
		
	}	


