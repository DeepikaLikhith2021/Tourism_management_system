import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Whatsup {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon']")).sendKeys("laptop");
		
		List<WebElement> autosuggestion = (List<WebElement>) driver.findElement(By.xpath("//div[contains(@aria-label,'laptops')]"));
		Thread.sleep(2000);
		for(WebElement element:autosuggestion) {
			System.out.println(element.getText());
		}
		
		
		

	}

}
