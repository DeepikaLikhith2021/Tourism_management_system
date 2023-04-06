package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change_password1page {
	@FindBy(xpath="//button[@name='submit']")
	private WebElement change_passwordbtn;

	public WebElement getChange_passwordbtn() {
		return change_passwordbtn;
	}

	public Change_password1page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void changepasswordbutton() {
		change_passwordbtn.click();
	}

}
