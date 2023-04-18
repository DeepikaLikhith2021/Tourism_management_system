package Xpath;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		driver.findElement(By.xpath("//a[text()='Athletes']")).click();
		ArrayList<Integer> list=new ArrayList<Integer>();
		List<WebElement> gold = driver.findElements(By.xpath("//div[@title='Gold']"));
		for (WebElement webElement : gold) {
			String count=webElement.getText();
			for(int i=0;i<list.size();i++) {
				Object obj=list.get(i);
				obj=0;
				if(obj instanceof Integer) {
					System.out.println(list);
					System.out.println(count);
				}
			}
			
		}
	}

}
