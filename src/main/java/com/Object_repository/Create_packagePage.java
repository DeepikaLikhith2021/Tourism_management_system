package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Travel.TMS_generic_utility.WebdriverUtility;

public class Create_packagePage {
	@FindBy(xpath="//span[text()=' Tour Packages']")
	private WebElement Tour_package;
	@FindBy(xpath="//span[text()=' Tour Packages']/..//following-sibling::ul/li/a")
	private WebElement create;

	public WebElement getCreate() {
		return create;
	}
	public WebElement getTour_package() {
		return Tour_package;
	}
	public Create_packagePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void createpackage(WebdriverUtility wLib, WebDriver driver) {
		
		wLib.mousehover(driver, Tour_package);
	}
	public void create(WebdriverUtility wLib, WebDriver driver) {
		wLib.mousehover(driver, create);
		create.click();
		
	
		
	}

}
