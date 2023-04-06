package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.WebdriverUtility;

public class Write_uspage {
	@FindBy(id="country")
	private WebElement Writeissues;
	
	@FindBy(name = "description")
	private WebElement description; 
	@FindBy(xpath="//button[@name='submit']")
	private WebElement submitbtn;

	public WebElement getWriteissues() {
		return Writeissues;
	}
	
	public  Write_uspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void writeissue(WebdriverUtility wLib) {
		wLib.select("Booking Issues", Writeissues);
		
	}
	public void description(ExcelUtility Elib) throws Throwable {
		String value = Elib.readdatafromexcel("Manageissue", 0,1);
		description.sendKeys(value);
		submitbtn.click();
	}
}
