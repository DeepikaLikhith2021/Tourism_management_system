package Manage_issues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(  0,500 )");
		driver.quit();

	}

}
