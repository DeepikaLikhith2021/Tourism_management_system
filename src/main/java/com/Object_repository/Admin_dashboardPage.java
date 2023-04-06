package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_dashboardPage {
	//declaration
	@FindBy(xpath=" Tour Packages") private WebElement TouRPackagesLink;
	@FindBy(xpath="//span[text()='Manage Users']") private WebElement ManageUsersLink;
	@FindBy(xpath="//span[text()='Manage Booking']")
	private WebElement ManageBookingLink;
	@FindBy(xpath="//span[text()='Manage Issues']")
	private WebElement  ManageIssues;
	@FindBy(xpath="//span[text()='Manage Pages']")
	private WebElement ManagepagesLink;
	@FindBy(xpath="//span[text()='Manage Enquiries']")
	private WebElement ManageEnquirieslink;
	@FindBy(xpath="//span[@class='fa fa-bars']")
	private WebElement sidebar;
	@FindBy(xpath="//div[@class='user-name']")
	private WebElement adminlogout;
	@FindBy(xpath="//a[text()='Back to home']")
	private WebElement backtohome;
	@FindBy(xpath="//a[text()=' Logout']")
	private WebElement clicklogout;
	
	
	public WebElement getClicklogout() {
		return clicklogout;
	}
	public WebElement getBacktohome() {
		return backtohome;
	}
	public WebElement getAdminlogout() {
		return adminlogout;
	}
	public WebElement getSidebar() {
		return sidebar;
	}
	//initialization
	public  Admin_dashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getTouRPackagesLink() {
		return TouRPackagesLink;
	}
	
	public WebElement getManageUsersLink() {
		return ManageUsersLink;
	}
	
	public WebElement getManageBookingLink() {
		return ManageBookingLink;
	}
	
	public WebElement getManageIssues() {
		return ManageIssues;
	}
	
	public WebElement getManagepagesLink() {
		return ManagepagesLink;
	}
	
	public WebElement getManageEnquirieslink() {
		return ManageEnquirieslink;
	}
	//businesslogic
	public void dashboard() {
		TouRPackagesLink.click();
	}
	public void manageusers() {
		ManageUsersLink.click();
	}
	public void managebooking() {
		
		ManageBookingLink.click();
	}
	public void manageissues() {
		
		ManageIssues.click();
	}
	public void managepages() {
		ManagepagesLink.click();
	}
	public void manageenquiries() {
		ManageEnquirieslink.click();
	}
	public void clicksidebar() {
		sidebar.click();
	}
	public void logoutadmin() {
		adminlogout.click();
	}
	public void backtohome() {
		backtohome.click();
		
	}
	public void clicklogout() {
		clicklogout.click();
	}
	
}
