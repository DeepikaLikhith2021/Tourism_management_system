package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAfterLogin {
	@FindBy(linkText = "Home")
	private WebElement HomeButton;
	@FindBy(linkText = "About")
	private WebElement Aboutbtn;
	
	@FindBy(linkText = "Tour Packages")
	private WebElement Tourpackageslist;
	

	@FindBy(linkText = "Privacy Policy")
	private WebElement Priavacypolicy;
	
	@FindBy(linkText = "Terms of Use")
	private WebElement TermsofUse;
	
	@FindBy(linkText = "Contact Us")
	private WebElement ContactUs;
	
	@FindBy(partialLinkText = "Write Us")
	private WebElement WriteIssues;
	
	@FindBy(linkText = "My Profile")
	private WebElement Myprofile;
	
	@FindBy(linkText = "Change Password")
	private WebElement ChangePassword;
	
	@FindBy(linkText = "My Tour History")
	private WebElement MyTourHistory;
	
	@FindBy(linkText = "Issue Tickets")
	private WebElement IssueTickets;
	
	@FindBy(xpath="//a[@href='logout.php']")
	private WebElement logoutbtn;
	
	@FindBy(linkText = "Admin Login")
	private WebElement adminloginbtn;
	
	
	public HomePageAfterLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	public void homepage() {
		HomeButton.click();
	}

	public void issueticket() {
		IssueTickets.click();
	}

	public void mytourhistory() {

		MyTourHistory.click();
	}

	public void myprofile() {

		Myprofile.click();
	}

	public void tourpackages() {
		Tourpackageslist.click();
	}

	public void changepassword() {
		ChangePassword.click();
	}

	public void logout() {
		logoutbtn.click();
	}

	public void adminloginbtn() {
		adminloginbtn.click();

	}

	public void writeisuue() {

		WriteIssues.click();
	}
	
		
	
}
