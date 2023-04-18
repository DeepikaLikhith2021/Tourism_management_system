package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	static String tele=null;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon']")).sendKeys("tv");
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		List<WebElement> tv = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement webElement : tv) {
			
			 tele=webElement.getText();
			
			
		    }
		for(int i=1;i<23;i++) {
			System.out.println("   "+i+ ""     +tele);
		}
		System.out.println(tv.size());
		
		

	}

}
