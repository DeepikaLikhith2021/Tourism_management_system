package Xpath;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olymphics {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://olympics.com/en/olympic-games/beijing-2022/results");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[text()='Athletes']")).click();
		driver.findElement(By.xpath("//button[.='Yes, I am happy']")).click();
		driver.findElement(By.xpath("//ul[@data-cy='nav-dropdown']/li[4]/a[.='Athletes']")).click();
		WebElement ele=driver.findElement(By.xpath("//h2[.='Featured Athletes']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Point y =ele.getLocation();
		js.executeScript("window.scrollTo(0,"+y+")", ele);
		List<WebElement>  name=driver.findElements(By.xpath("//a[@class='AthleteItemstyles__AthleteNameLink-sc-6dl3cx-4 fBgYNo']"));
//		for (WebElement web : name) {
//			System.out.println(web.getText());
//			
//		}
		List<WebElement> medal = driver.findElements(By.xpath("//div[@class='AthleteListstyles__Card-sc-z9i6y8-2 jNFKzS athlete-card four-items']/descendant::div[4]/span[@data-cy='medal-main']"));
//for (WebElement webElement : medal) {
//	System.out.println(webElement.getText());
//}
for(int i=0;i<name.size();i++) {
	System.out.println(name.get(i).getText()+"     "+medal.get(i).getText());
}


	}
}
		
		//		ArrayList<Integer> list=new ArrayList<Integer>();
//		List<WebElement> gold = driver.findElements(By.xpath("//div[@title='Gold']"));
//		for (WebElement webElement : gold) {
//			String count=webElement.getText();
//			for(int i=0;i<list.size();i++) {
//				Object obj=list.get(i);
//				obj=0;
//				if(obj instanceof Integer) {
//					System.out.println(list);
//					System.out.println(count);
			