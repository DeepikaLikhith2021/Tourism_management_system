package com.Object_repository;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Travel.TMS_generic_utility.WebdriverUtility;

public class Insidecreatepackage {
	@FindBy(xpath="//button[text()='Create']")
	private WebElement createbutton;
	@FindBy(id="packagename")
	private WebElement packagename;
	@FindBy(id="packagetype")
	private WebElement packagetype;
	public WebElement getPackagename() {
		return packagename;
	}

	public WebElement getPackagetype() {
		return packagetype;
	}

	public WebElement getPackagelocation() {
		return packagelocation;
	}

	public WebElement getPackageprice() {
		return packageprice;
	}

	public WebElement getPackagefeatures() {
		return packagefeatures;
	}

	public WebElement getPackagedetails() {
		return packagedetails;
	}

	@FindBy(id="packagelocation")
	private WebElement packagelocation;
	
	@FindBy(id="packageprice")
	private WebElement packageprice;
	
	@FindBy(id="packagefeatures")
	private WebElement packagefeatures;
	
	@FindBy(id="packagedetails")
	private WebElement packagedetails;
	@FindBy(id="packageimage")
	private WebElement packageimage;
	
	
	
	
	
	
	public WebElement getPackageimage() {
		return packageimage;
	}

	public Insidecreatepackage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreatebutton() {
		return createbutton;
	}
	public void createbutton() {
		createbutton.click();
	}
	
	public void createPackage(ArrayList<String> details)
	{
		packagename.sendKeys(details.get(0));
		packagetype.sendKeys(details.get(1));
		packagelocation.sendKeys(details.get(2));
		packageprice.sendKeys(details.get(3));
		packagefeatures.sendKeys(details.get(4));
		packagedetails.sendKeys(details.get(5));
		packageimage.sendKeys(details.get(6));
	}
	public void tillscroll(WebdriverUtility wLib, WebDriver driver) {
		wLib.scrollAction(driver, createbutton);
	}


	
}
