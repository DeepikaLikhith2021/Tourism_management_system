package Broken_links;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrokenLink {
	
	@Test
	public void broken() 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://phptravels.com/");
		ArrayList<String> listOfUrls = new ArrayList<String>();
		ArrayList<String> listOfBrokenLink = new ArrayList<String>();
		 List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		 for (WebElement link : listOfLinks) {
			 String li = link.getAttribute("href");
			 if(li==null) 
			 {
				listOfBrokenLink.add(li+" ==> NULL");
			 }
			else if(li.contains("http"))
			 {
			listOfUrls.add(li);
			 }
			else
				listOfBrokenLink.add(li+" ==> No http protocal");
		}
		 		 
		 for ( String link : listOfUrls) {
			 try {
				 URL url = new URL(link);
				 URLConnection urlcon = url.openConnection();
				 HttpURLConnection httpUrl = (HttpURLConnection) urlcon;
				 int statusCode = httpUrl.getResponseCode();
				 String resMsg = httpUrl.getResponseMessage();
				 if(statusCode>=400)
				 {
					 listOfBrokenLink.add(link+" ===> Status code : "+statusCode+" ==> Response msg : "+resMsg);
				 }
			 }
			 catch (Exception e)
			 {
				 listOfBrokenLink.add(link+" ==> Not connected");
			 }
		 }
		 
		 System.out.println(listOfBrokenLink);
		 System.out.println(listOfBrokenLink.size());
	}

}
