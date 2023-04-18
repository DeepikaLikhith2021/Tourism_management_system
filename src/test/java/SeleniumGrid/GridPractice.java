package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridPractice {
	@Test
	public void HubAndNode() throws Throwable {
		String executeMode="local";
		WebDriver driver=null;
		if(executeMode.equals("remote")) {
			URL url=new URL("http://169.254.50.181:4444/wd/hub");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			WebDriverManager.chromedriver().setup();
			
			 driver=new RemoteWebDriver(url,cap);
			
		}
		else if(executeMode.equals("local")) {
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			driver.quit();
		}
		
		
		
		
		
	}

}
