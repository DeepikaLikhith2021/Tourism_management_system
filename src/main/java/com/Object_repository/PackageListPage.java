package com.Object_repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Travel.TMS_generic_utility.WebdriverUtility;

public class PackageListPage {
	@FindBy(xpath="//img")
	private List<WebElement> imageList;
	
	@FindBy(xpath="//h4")
	private List<WebElement> packageNameList;
	@FindBy(xpath="//h6")
	private List<WebElement> packageTypeList;
	@FindBy(xpath="//b[.='Package Location :']/parent::p")
	private List<WebElement> packageLocationList;
	@FindBy(xpath="//b[.='Features']")
	private List<WebElement> featuresList;
	@FindBy(xpath="//a[.='Details']")
	private List<WebElement> detailsLinkList;
	@FindBy(xpath="//h5")
	private List<WebElement> priceList;
	
	public PackageListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public PackageDetailsPage searchPackageAndClick(WebdriverUtility wLib, WebDriver driver, String packageName, String price) 
	{
		for(int i=0;i<packageNameList.size();i++) {
			wLib.scrollAction(driver, packageNameList.get(i) );
			if((packageNameList.get(i).getText().contains(packageName) &&  (priceList.get(i).getText().contains(price))))
			{
				detailsLinkList.get(i).click();
				break;
			}
			
		}
		return  new PackageDetailsPage(driver);
	}
}







