package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aveda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.aveda.de/");
		driver.findElement(By.xpath("//button[text()='Ablehnen']")).click();
		String path="//li[contains(@class,'menu__item menu__item--lvl-1 menu__item--category js-menu-item-category active')]";
		driver.findElement(By.xpath(path)).click();
		//driver.findElement(By.xpath("(//*[name()='svg'])[@class='icon icon--caret--close']")).click();
		driver.quit();
	}

}
