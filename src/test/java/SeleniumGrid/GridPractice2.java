package SeleniumGrid;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class GridPractice2 {
	public void browser() throws Throwable {
	URL url=new URL("http://192.168.86.208:4444/wd/hub");
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	WebDriver driver=new RemoteWebDriver(url,cap);
	WebDriverManager.chromedriver().setup();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.quit();

}
}
