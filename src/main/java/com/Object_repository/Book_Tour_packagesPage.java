package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Tour_packagesPage {
	//declaration
	@FindBy(xpath="//button[@name='submit2']")
	private WebElement Booksubmitbtn;
	
	
	public WebElement getBooksubmitbtn() {
		return Booksubmitbtn;
	}

	
	//initialization
	public Book_Tour_packagesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	//business library
	public void Book_Tour_package() {
		Booksubmitbtn.click();
	}
	
	

}
