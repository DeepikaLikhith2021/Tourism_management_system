package com.Object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Travel.TMS_generic_utility.WebdriverUtility;

public class Manage_enquiry {
	@FindBy(xpath="//a[text()=' Enquiry ']") private WebElement enquiry;
	@FindBy(xpath = "//button[@name='submit1']") private WebElement submit;
	@FindBy(xpath="//tbody/tr[last()]/td[7]") private WebElement read;


	public Manage_enquiry(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enquiry() {
		enquiry.click();
	}
	public void submit() {
		submit.click();
	}
	public void read(WebdriverUtility wLib, WebDriver driver) {
		wLib.scrollAction(driver, read);
	}

}
