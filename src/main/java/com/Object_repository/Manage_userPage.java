package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_userPage {
	@FindBy(xpath="//tbody/tr[last()]/td[9]/span/a[text()='Cancel']")
	private WebElement cancelbooking;
	@FindBy(xpath="//tbody/tr[last()]/td[9]/span/a[text()='Confirm']")
	private WebElement confirmbooking;
	

	public WebElement cancel() {
		return cancelbooking;
	}
	public WebElement confirm() {
		return confirmbooking;
	}

	public Manage_userPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void cancel_the_tour() {
		cancelbooking.click();
	}
	public void confirm_the_tour() {
		confirmbooking.click();
	}

}
