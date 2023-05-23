package Xpath;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nyka {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/brands/lakme/c/604?ptype=brand&id=604&root=brand_menu,top_brands,Lakme");
//		WebElement element = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
//		Actions action=new Actions(driver);
//		action.moveToElement(element).perform();
//		WebElement element1=driver.findElement(By.xpath("//a[text()='Kajal']"));
//		Thread.sleep(2000);
//		action.moveToElement(element1).click();
//		 driver.findElement(By.xpath("//a[.='brands']")).click();
//		 driver.findElement(By.xpath("//input[@placeholder='search brands']")).sendKeys("Lakme");
//		 driver.findElement(By.xpath("(//a[text()='Lakme'])[1]")).click();
		List<WebElement> powder = driver.findElements(By.xpath("//div[@class='css-1rd7vky']/div[@class='css-xrzmfa']"));
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<powder.size();i++)
		{
			list.add(powder.get(i).getText());
			
		}
		for (String name : list) {
			String x="//div[.='"+name+"']/following-sibling::div/span[2][@class='css-111z9ua']";
			String price=driver.findElement(By.xpath(x)).getText();
			System.out.println("powder====>"+name  + "price=====>"+price);
		}
		
		
		
		
		
	}

}
