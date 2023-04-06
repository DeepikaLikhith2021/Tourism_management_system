package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromProperty {
	public static void main(String[] args) throws Throwable {
		 FileInputStream fis = new FileInputStream(".//src/test/resources/commomdata.properties.");
		 Properties property=new Properties();
		 property.load(fis);
		
		 
		 String BROWSER=property.getProperty("browser");
		 String URL=property.getProperty("url");
		 String USERNAME=property.getProperty("userid");
		 String PASSWORD=property.getProperty("password");
		 System.out.println(property.getProperty(PASSWORD));
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get(URL);
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.linkText("/ Sign In")).click();
		 driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys(USERNAME);
		driver.findElement(By.xpath("(//input[@name=\"password\"])[2]")).sendKeys(PASSWORD);
		 driver.findElement(By.name("signin")).click();
		 driver.quit();
	}

}
