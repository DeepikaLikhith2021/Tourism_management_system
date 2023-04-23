package com.Object_repository;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Travel.TMS_generic_utility.ExcelUtility;
import com.Travel.TMS_generic_utility.WebdriverUtility;

public class PackageDetailsPage {
	@FindBy(id="datepicker")
	private WebElement fromdate;
	
	
	@FindBy(id="datepicker1")
	private WebElement todate;
	
	@FindBy(name="comment")
	private WebElement comments;
	
	@FindBy(name="submit2")
	private WebElement submitbtn;
	
	@FindBy(xpath="//div[@class='succWrap']")
	private WebElement successmsg;
	@FindBy(xpath="//h2[text()='bangalore palace']") private WebElement search;
	
	public PackageDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getFromdate() {
		return fromdate;
	}

	public WebElement getTodate() {
		return todate;
	}

	public WebElement getComments() {
		return comments;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getSuccessmsg() {
		return successmsg;
	}
	public String booktour(ExcelUtility eLib,WebdriverUtility wLib, WebDriver driver) throws Throwable {
		ArrayList<String> details = eLib.readMultipleData("book_the_tour", 1);
		fromdate.sendKeys(details.get(0));
		todate.sendKeys(details.get(1));
		
		wLib.scrollAction(driver, comments);
		comments.sendKeys(details.get(1));
		submitbtn.click();
		return successmsg.getText();
		
	}
	

	
	
	

}
