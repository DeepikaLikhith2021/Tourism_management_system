package com.Object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Travel.TMS_generic_utility.WebdriverUtility;

public class Manage_bookingPage {
	@FindBy(xpath="//div[@class='succWrap']")
	private WebElement successmessage;
	
	public WebElement getSuccessmessage() {
		return successmessage;
	}
	
	public Manage_bookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String confirmbooking(String Username, String PackageName, String Comment,WebdriverUtility wLib, WebDriver driver) {
		WebElement confirmbtn=driver.findElement(By.xpath("(//td[.='anuj@gmail.com']/following-sibling::td[.='BALIISLAND']/following-sibling::td[.='good tour']/following-sibling::td/descendant::a[.='Confirm'])[last()]"));
		wLib.scrollAction(driver, confirmbtn);
		confirmbtn.click();
		wLib.acceptAlert(driver);
		wLib.elementtobevisible(successmessage, driver);
		return successmessage.getText();
		
	}
	public String cancelbooking(String Username, String PackageName, String Comment,WebdriverUtility wLib, WebDriver driver) {
		WebElement cancelbtn=driver.findElement(By.xpath("//td[.='anuj@gmail.com']/following-sibling::td[.='beach view 377']/following-sibling::td[.='good tour']/following-sibling::td/descendant::a[.='Cancel']"));
		wLib.scrollAction(driver, cancelbtn);
		cancelbtn.click();
		wLib.acceptAlert(driver);
		wLib.elementtobevisible(successmessage, driver);
		return successmessage.getText();
		
	}
	
	
}
