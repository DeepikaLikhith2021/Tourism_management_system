package Mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olympic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@data-cy='table-content']/descendant::span[text()='Japan']")).click();
		String count=driver.findElement(By.xpath("//div[@data-cy='table-content']/descendant::span[text()='Japan']/../../following-sibling::div/div/../following-sibling::div/div/span[@class='Medalstyles__Medal-sc-1tu6huk-1 gHnuPI']")).getText();
		System.out.println(count);
		//h3[@data-cy='athlete-name']
		driver.quit();
		//div[@data-cy='table-content']/descendant::span[text()='']/../../following-sibling::div/div/../following-sibling::div/div/span[@class='Medalstyles__Medal-sc-1tu6huk-1 gHnuPI']"))
	}

}
