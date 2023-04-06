package Integration_test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/");
		driver.findElement(By.linkText("/ Sign In")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id=\"email\"])[2]")).sendKeys("anuj@gmail.com");
		driver.findElement(By.xpath("(//input[@id=\"password\"])")).sendKeys("Test@123");
		driver.findElement(By.name("signin")).click();

	}

}
