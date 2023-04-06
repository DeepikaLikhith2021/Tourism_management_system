package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_enquiriesPage{
		@FindBy(xpath="//tbody/tr[last()]/td[7]/span/a[text()='Pending']")
		private WebElement enquiry;

		public WebElement getEnquiry() {
			return enquiry;
		}

		public Manage_enquiriesPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void manage_enquiry() {
			enquiry.click();
		}
}
