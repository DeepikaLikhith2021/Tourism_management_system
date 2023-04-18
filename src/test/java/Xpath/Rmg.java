package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rmg {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Zoo_Management_System/animals.php");
		driver.findElement(By.xpath("//a[text()='Animals']")).click();
		List<WebElement> Animals = driver.findElements(By.xpath("//div[@class='gallery-section']//div[@class='col-md-3 welcome-grid']"));
		
		int count=0;
		for (WebElement webElement : Animals) {
			
			String e=webElement.getText();
			
			System.out.println(e);
			
			
			
		}
		System.out.println(Animals.size());

		
		
		driver.findElement(By.xpath("//strong[text()='Next>']")).click();
		List<WebElement> Animals1=driver.findElements(By.xpath("//div[@class='container']/div"));
		for (WebElement webElement : Animals1) {
			String e1=webElement.getText();
			System.out.println(e1);
		}
		System.out.println(Animals1.size());
		
		
		
		
	}
	

}
