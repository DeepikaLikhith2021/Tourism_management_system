package AA_Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Giobibo {

	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 dRQhOp']")).click();
		Thread.sleep(2000);
		
			WebElement from=driver.findElement(By.xpath("(//p[@class='sc-eLwHnm hHxEGr fswWidgetPlaceholder'])[1]"));
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(from));
		from.sendKeys("Bangaluru");
			driver.findElement(By.xpath("(//p[@class='sc-eLwHnm hHxEGr fswWidgetPlaceholder'])[2]")).sendKeys("Mysore");
			driver.findElement(By.xpath("//span[@class='sc-dvQaRk fchrvX fswDownArrow']")).click();
			List<WebElement> ele = driver.findElements(By.xpath("//div[@class='DayPicker-Month']"));
			for (WebElement webElement : ele) {
				String ad=webElement.getText();
				System.out.println(ad);
		
		driver.quit();
			
		}
		
	}
}


