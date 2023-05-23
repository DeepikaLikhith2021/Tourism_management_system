package Xpath;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TvFlipkart {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("tv");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(2000);
		String actual="https://www.flipkart.com/motorola-envision-80-cm-32-inch-hd-ready-led-smart-android-tv-11-bezel-less-design";
		Set<String>   tit=driver.getWindowHandles();
		for (String string : tit) {
			driver.switchTo().window(string).getTitle();
			if(tit.contains(actual))
			{
				driver.switchTo().defaultContent();
			}
			
		}
		
		
		String name=driver.findElement(By.xpath("//div[@class='dyC4hf']/descendant::div/div/div[@class='_30jeq3 _16Jk6d']")).getText();
		System.out.println(name);
		Thread.sleep(2000);
		driver.quit();

	}

}
