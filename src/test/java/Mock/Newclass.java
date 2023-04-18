package Mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		 driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone");
		 driver.findElement(By.xpath("\"//input[@title='Search for products, brands and more']\"")).click();
		 driver.quit();
		
//	driver.findElement(By.xpath("https://www.flipkart.com/search?q=iphone&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphone%7CMobiles&requestId=2d1e9da8-9135-4f3c-9e44-8dd8334cba56"));
//	driver.findElement(By.xpath("div[text()='APPLE iPhone 14 (Midnight, 128 GB)']/../following-sibling::div/div/div/div[@class='_30jeq3 _1_WHN1']"));
//	driver.quit();
//	
//	
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		
		
//		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
//		String xpath1="//div[text()='Silver']/../../following-sibling::div/div/span[text()='United States of America']/../following-sibling::div[@title='Silver']/span[@class='Medalstyles__Medal-sc-1tu6huk-1 lzFVJ']";
//		String xpath="//div[text()='Gold']/../../following-sibling::div/div/span[text()='United States of America']/../following-sibling::div[@title='Gold']/span[@class='Medalstyles__Medal-sc-1tu6huk-1 gHnuPI']";
//	String count=driver.findElement(By.xpath(xpath)).getText();
//	String count1=driver.findElement(By.xpath(xpath)).getText();
//	System.out.println(count+count1);
	
	//div[text()='Bronze']/../../following-sibling::div/div/span[text()='United States of America']/../following-sibling::div[@title='Bronze']/span[@class='Medalstyles__Medal-sc-1tu6huk-1 brSNnJ']
				//div[text()='APPLE iPhone 14 (Midnight, 128 GB)']/../following-sibling::div/div/div/div[@class='_30jeq3 _1_WHN1']
	}
}
