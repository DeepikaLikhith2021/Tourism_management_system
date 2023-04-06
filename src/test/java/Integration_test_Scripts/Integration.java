package Integration_test_Scripts;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Integration {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Random ran=new Random();
		int random=ran.nextInt(500);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String fname="xyz@gmail.com";
		driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/");
		driver.findElement(By.xpath("//a[text()=\"Sign Up\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("fname")).sendKeys("xyz");
		driver.findElement(By.name("mobilenumber")).sendKeys("9980662593");
		driver.findElement(By.id("email")).sendKeys(random+"xyz@gmail.com");
		driver.findElement(By.name("password")).sendKeys("xyz2016");
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
		driver.findElement(By.linkText("/ Sign In")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id=\"email\"])[2]")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("(//input[@id=\"password\"])")).sendKeys("xyz2016");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		if(fname.equals("xyz1@gmail.com")) {
			System.out.println("database present");
			
		}
		else {
			System.out.println("database not present");
			
		}
	}

}
