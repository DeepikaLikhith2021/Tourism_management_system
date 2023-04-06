package Manage_issues;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_tour_packages {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Commonfor_TMS.properties");
		Properties property=new Properties();
		property.load(fi);
		String URL=property.getProperty("url");
		String USERNAME=property.getProperty("username");
		String PASSWORD=property.getProperty("password");
		String ADMINUSERNAME=property.getProperty("adminusername");
		String ADMINPASSWORD=property.getProperty("password");
		String book="Bankok";
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Admin Login")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(ADMINUSERNAME);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ADMINPASSWORD);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		WebElement element=driver.findElement(By.xpath("//span[text()=' Tour Packages']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(element).click().perform();
		WebElement element1=driver.findElement(By.linkText("Create"));
		action.moveToElement(element1).click().perform();
		driver.findElement(By.xpath("//input[@id='packagename']")).sendKeys("Travel the world");
		driver.findElement(By.xpath("//input[@id='packagetype']")).sendKeys("freinds package");
		driver.findElement(By.xpath("//input[@id='packagelocation']")).sendKeys("sdfg");
		driver.findElement(By.xpath("//input[@id='packageprice']")).sendKeys("7415623$");
		driver.findElement(By.xpath("//textarea[@name='packagedetails']")).sendKeys("round_trip");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText(" Logout")).click();
		
		driver.findElement(By.linkText("/ Sign In")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		
		
		
		driver.findElement(By.linkText("Tour Packages")).click();
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
		driver.quit();
	}

}
