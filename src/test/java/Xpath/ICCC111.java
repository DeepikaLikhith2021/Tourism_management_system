package Xpath;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCC111 {
	@Test
	public void test001() {
		String actual="https://www.icc-cricket.com/rankings/mens/overview";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[contains(.,'Rankings')])[1]")).click();
		Actions action = new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("(//a[contains(text(),'Overview')])[1]"));
	    action.click(ele);
	    driver.navigate().to("https://www.icc-cricket.com/rankings/mens/overview");
	    String url=driver.getTitle();
	    System.out.println(url);
	    
	   // Assert.assertEquals(url,actual);
	    String abc=driver.findElement(By.xpath("(//div[@class='rankings-block__top-team'])[1]")).getText();
	    System.out.println(abc);
	    driver.quit();
	    
	  
	
	   
		
		
		
	}

}
