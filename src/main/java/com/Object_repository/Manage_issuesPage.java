package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Travel.TMS_generic_utility.WebdriverUtility;

public class Manage_issuesPage {
	@FindBy(xpath="//tbody/tr[last()]/td[8]//a")
	private WebElement Manageissues;

	public WebElement getManageissues() {
		return Manageissues;
	}
	public Manage_issuesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void Manageissue(WebdriverUtility wLib, WebDriver driver){
		wLib.scrollAction(driver, Manageissues);
		Manageissues.click();
	}
	
	
}
