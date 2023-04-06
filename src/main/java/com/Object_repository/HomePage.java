package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// declaration
	@FindBy(xpath="//a[text()='/ Sign In']")
	private WebElement SignInlink;

	@FindBy(linkText = "Sign Up")
	private WebElement SignUpLink;

	@FindBy(xpath="//a[@href='admin/index.php']")
	private WebElement AdminLoginLink;

	@FindBy(xpath="//a[@href='tour-history.php']")
	private WebElement TourPackagesLink;

	@FindBy(linkText = " Enquiry ")
	private WebElement EnquiryLink;

	@FindBy(linkText = "Contact Us")
	private WebElement ContactUsLink;

	// intialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization

	public WebElement getSignInLink() {
		return SignInlink;

	}

	public WebElement getSignUpLink() {
		return SignUpLink;
	}

	public WebElement getAdminLoginLink() {
		return AdminLoginLink;

	}

	public WebElement getTourPackagesLink() {
		return TourPackagesLink;
	}

	public WebElement getEnquiryLink() {
		return EnquiryLink;
	}

	public WebElement getContactUsLink() {
		return ContactUsLink;
	}

//business libraries
	public void SignIn() {
		SignInlink.click();
		
		

	}

	public void SignUp() {
		SignUpLink.click();
	}

	public void AdminLogin() {
		AdminLoginLink.click();
	}

	public void TourPackages() {
		TourPackagesLink.click();
	}

	public void EnquiryLink() {
		EnquiryLink.click();
	}

	public void ContactUsLink() {
		ContactUsLink.click();
	}

}
