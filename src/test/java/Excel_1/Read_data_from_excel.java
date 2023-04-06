package Excel_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_data_from_excel {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String actual="https://skillrary.com/";
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("//a[.=' SkillRary Whiteboard']")).click();
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b).getTitle();
			Thread.sleep(2000);
			if(child.contains(actual)) {
				driver.switchTo().defaultContent();
			}
			
		}
		driver.quit();
		

	}

}
