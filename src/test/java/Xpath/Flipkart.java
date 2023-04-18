package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.flipkart.com/");
				
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				List<WebElement> iphone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
				Thread.sleep(2000);
				for (WebElement webElement : iphone) {
					String phone=webElement.getText();
					System.out.println(phone);
			
	}
				int count=iphone.size();
				
				
				System.out.println("=========================================================================");
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(2000);
				List<WebElement> iphone1 = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
				Thread.sleep(2000);
				for (WebElement webElement1 : iphone1) {
					String phone1=webElement1.getText();
					System.out.println(phone1);
				
				//https://ultimateqa.com/dummy-automation-websites/

}
				int count1=iphone1.size();
						int total=count+count1;
				System.out.println("total number of iphone is" +total);
}
}
