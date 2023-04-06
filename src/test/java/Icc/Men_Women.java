package Icc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Men_Women {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[@href='https://www.icc-cricket.com/awards/player-of-the-tournament/']"));
		action.moveToElement(element).click().perform();
		Thread.sleep(2000);
		driver.close();

	}

}
