package RMG_TEST;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rmg_test {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("rmgtestingserver/domain/Online_Tourism_Management_System/");
		//driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.xpath("//label[@for=\"usernmae\"]")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//label[@for=\"inputPassword\"]")).sendKeys("rmgy@9999");
		driver.findElement(By.linkText("Sign in")).click();
		driver.quit();
		
	}

}