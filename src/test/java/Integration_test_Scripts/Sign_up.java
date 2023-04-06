package Integration_test_Scripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign_up {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/");
		String name="anuj@gmail.com";
//		driver.findElement(By.xpath("//a[text()=\"Sign Up\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("fname")).sendKeys("yanvi");
//		driver.findElement(By.name("mobilenumber")).sendKeys("9980662593");
//		driver.findElement(By.id("email")).sendKeys("yanvi@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("yanvi2016");
//		driver.findElement(By.id("submit"));
		driver.findElement(By.linkText("/ Sign In")).click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("(//input[@id=\"email\"])[2]"));
		element.sendKeys("anuj@gmail.com");
	WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id=\"password\"])")));
//		driver.findElement(By.name("username")).sendKeys("gfdffg");
		driver.findElement(By.xpath("(//input[@id=\"password\"])")).sendKeys("Test@123");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@href=\"#\"]")).click();
		Thread.sleep(2000);
		//(//input[@id=\"password\"])
		
		String actual=driver.findElement(By.xpath("//li[text()='anuj@gmail.com']")).getText();
		if(actual.contains(name)) {
			System.out.println("updated");
		}
		else {
			System.out.println("not updated");
		}
		driver.quit();
		
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
//		driver.quit();
		//.sendKeys("anuj@gmail.com")
	}

}
