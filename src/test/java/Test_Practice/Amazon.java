package Test_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	

		driver.get("https://www.amazon.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@aria-label='Search Amazon']"));
		ele.sendKeys("lap");
		List<WebElement> element=driver.findElements(By.xpath("//span[@class='s-heavy']"));
		//System.out.println(element.get(2));
		Thread.sleep(2000);
		System.out.println(element.size());
		for(WebElement opt:element) {
			
			System.out.println(opt.getText());
		}
	}
}
//driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
//WebElement src=driver.findElement(By.xpath("//div[@id='block-1']"));
//WebElement dest=driver.findElement(By.xpath("//div[@id='block-3']"));
//Actions action=new Actions(driver);
//Thread.sleep(2000);
//action.dragAndDrop(src, dest).perform();
//driver.close();
//
//
//
//}}
//			
		
