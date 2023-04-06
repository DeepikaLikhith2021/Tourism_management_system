package Integration_test_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class My_Profile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String confirm=":Profile Updated Successfully";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//login
		driver.findElement(By.linkText("/ Sign In")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys("anuj@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		//
		driver.findElement(By.linkText("My Profile")).click();
		WebElement element=driver.findElement(By.xpath("//input[@name='mobileno']"));
		element.clear();
		element.sendKeys("4563212687");
		driver.findElement(By.xpath("//button[text()='Updtae']")).click();
		Thread.sleep(2000);
		String actual=driver.findElement(By.xpath("//div[text()=':Profile Updated Successfully '] ")).getText();
		if(confirm.contains(actual)) {
			System.out.println("updated");
		}
		else {
			System.out.println("not updated");
			
		}

		driver.quit();

	}

}
