package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccMyPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		String path="//tr[@class='table-body']/td[@class='table-body__cell table-body__cell--position u-text-right']/following-sibling::td[@class='table-body__cell rankings-table__name name']/following-sibling::td[@class='table-body__cell nationality-logo rankings-table__team']/following-sibling::td[@class='table-body__cell rating']";
		List<WebElement> team = driver.findElements(By.xpath(path));
		for (WebElement webElement : team) {
			String allTeam = webElement.getText();
			System.out.println(allTeam);
		}

	}
}
