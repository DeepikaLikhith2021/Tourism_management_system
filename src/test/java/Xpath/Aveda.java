package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aveda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.aveda.de/");
		driver.findElement(By.xpath("//button[text()='Ablehnen']")).click();
		//String path="//li[contains(@class,'menu__item menu__item--lvl-1 menu__item--category js-menu-item-category active')]";
		WebElement ele=driver.findElement(By.xpath("(//a[.='MAKEUP'])[2]"));
		Actions action =new Actions(driver);
		action.moveToElement(ele).perform();
		//driver.findElement(By.xpath(path)).click();
		
		driver.findElement(By.xpath("(//a[.='makeup pinsel'])[2]")).click();
		List<WebElement> lipstick = driver.findElements(By.xpath("//a[@class='js-spp-link']"));
		for (WebElement ement : lipstick) {
			String a=ement.getText();
			System.out.println(a);
			
		}
//		for(int i=1;i<=lipstick.size();i++)
//		{
//			String a=lipstick.get(i).getText();
//			System.out.println(a);
//		}
		
		//driver.findElement(By.xpath("(//*[name()='svg'])[@class='icon icon--caret--close']")).click();
		//driver.quit();
	}

}
