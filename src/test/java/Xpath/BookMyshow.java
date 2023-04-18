package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyshow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
		driver.findElement(By.xpath("//a[text()='Movies']")).click();
		driver.findElement(By.xpath("//div[@class='sc-133848s-2 sc-ije77g-1 jslLoG']/div/div/div/div[.='Kannada']")).click();
		WebElement element=driver.findElement(By.xpath("//div[text()='Veeram']"));
		System.out.println(element.getText());
		driver.findElement(By.xpath("//img[@alt='Veeram']"));
		

	}

}
