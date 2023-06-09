package Xpath;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Icc {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");

		List<WebElement> teams= driver.findElements(By.xpath("//tbody/tr/td[2]"));
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<teams.size();i++) {
			list.add(teams.get(i).getText());
			
		}
		for(String myteams:list) {
			//String x="//span[.='"+myteams+"']/../following-sibling::td[2]";
			String x="//span[.='"+myteams+"']/../preceding-sibling::td";
			String Rating=driver.findElement(By.xpath(x)).getText();
			System.out.println("team-->"+myteams+"--->(rating is)--->"+Rating);
		}
		driver.close();
		
	}
	//(//div[@class='wrapper']/div[@class='col-12'])[2]/section/div/div/div[3]/descendant::div//descendant::div/descendant::div/descendant::div/div

}
