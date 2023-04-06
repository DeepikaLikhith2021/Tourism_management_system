package com.Travel.TMS_generic_utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This method is used to maximize the window
 * @author likhith
 *
 */
public class WebdriverUtility {
	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	/**
	 * This method is used for wait until the page loads
	 * @param driver
	 */
	public void wait_For_PageLoad(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	/**
	 * 
	 * @param driver
	 * @param element 
	 */
	public void elementtobevisible( WebElement element,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	/**
	 * 
	 * @param element
	 * @param index
	 */
	public void select(WebElement element, int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
		
	}
	public void select(String value,WebElement element) {
		Select sel=new Select(element);
		sel.selectByValue(value);
		
	}
	public void select(WebElement element, String visibletext) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visibletext);
	}
	public void mousehover(WebDriver driver, WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void dragAndDrop( WebElement element,WebDriver driver, WebElement src, WebElement dest) {
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dest).perform();
	
	}
	public void doubleClick(WebDriver driver) {
		Actions action=new Actions(driver);
		action.doubleClick().perform();
	}
	public void rightClick(WebDriver driver) {
		Actions action=new Actions(driver);
		action.contextClick().perform();
	}
	public void enterKeyPress(WebDriver driver) {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER);
	}
	public void enterKey(WebDriver driver) throws Throwable {
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	public void enterRelease(WebDriver driver) throws Throwable{
		Robot rb=new Robot();
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String nameorID, WebDriver driver ) {
		driver.switchTo().frame(nameorID);
	}
	
	public void switchToFrame(WebElement address,WebDriver driver ) {
		driver.switchTo().frame(address);
	}
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void switchToWindow(WebDriver driver, String partialTitle) {
		//step1: use getwindowHandles to capture all window id's
		Set<String> windows = driver.getWindowHandles();
		//step2: iterate through the window
		Iterator<String> it = windows.iterator();
		//step3: check whether there is next window
		while(it.hasNext()) {
			//step4: capture current window id
			String winID=it.next();
			//step5: switch to current window and capture title
			String currentWinTitle=driver.switchTo().window(winID).getTitle();
			//step6: check whether current window expected
			if(currentWinTitle.contains(partialTitle))
			{
				break;
			}
		}
	}
//	public static String getScreenShot(WebDriver driver, String screenShotName) throws Throwable {
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		String path=".\\screenshot\\"+screenShotName+".png";
//		File dst=new File(path);
//		FileUtils.copyFile(src, dst);
//		return path;
//	}
	public static String takesscreenshot(WebDriver driver, String screenshotname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path=".///s"+screenshotname+".png";
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
		return path;
		
		
		
		
		
		
		
		
	}
	public void scrollBarAction(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)","");
	}
	/**
	 * This method is used to perform scroll action by using coordinates
	 * @param driver
	 * @param element
	 */
	public void scrollAction(WebDriver driver,WebElement element ) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		int y=element.getLocation().getY();
		jse.executeScript("window.scrollTo(0, "+y+")");
		
		//jse.executeScript("window.scrollBy()","");
		
	}
	
	/**
	 * This method is used to scroll untill the element find by using location
	 * @param element
	 * @param driver
	 */
	public void scrollAction(WebElement element,WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		int y=element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")",element);
	}
	
	

}
