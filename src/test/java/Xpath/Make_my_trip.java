package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make_my_trip {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']"));
		Actions action = new Actions(driver);
		action.click(from).perform();
		action.sendKeys("Bangaluru").perform();
		driver.findElement(By.xpath("//p[.='Bengaluru, India']")).click();
		Thread.sleep(2000);
		WebElement to = driver.findElement(By.xpath("//label[@for='toCity']"));
		action.click(to).perform();
		action.sendKeys("Mumbai").perform();
		driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		//driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Tue May 02 2023']")).click();
		driver.findElement(By.xpath("//span[@class='lbl_input appendBottom5']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-3']")).click();
	}

}
