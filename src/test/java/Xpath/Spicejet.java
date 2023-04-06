package Xpath;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		
		driver.quit();

	}

}
