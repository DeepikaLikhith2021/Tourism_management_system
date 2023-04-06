package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_login_page {
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement adminusername;
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement adminpassword;
	@FindBy(name="login")
	private WebElement adminsbmt;
	@FindBy(xpath="//a[text()='Back to home']") private WebElement backbutton;
	public WebElement getAdminusername() {
		return adminusername;
	}
	public WebElement getAdminpassword() {
		return adminpassword;
	}
	public WebElement getAdminsbmt() {
		return adminsbmt;
	}
	

	public Admin_login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void adminusername(String ADMINUSERNAME, String ADMINPASSWORD) {
		adminusername.sendKeys(ADMINUSERNAME);
		
		adminpassword.sendKeys(ADMINPASSWORD);
	}
	public void click_submit() {
		adminsbmt.click();
		
	}
	public void backToUserhome() {
		backbutton.click();
		
	}
}
