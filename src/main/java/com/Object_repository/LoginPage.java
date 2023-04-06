package com.Object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
//	@FindBy(linkText="/ Sign In")
//	private WebElement signinbutton;
	@FindBy(xpath="//input[@placeholder='Enter your Email']")
	private WebElement usernameTF;
	@FindBy(id="password")
	private WebElement passwordTF;
	@FindBy(xpath="//input[@value='SIGNIN']")
	private WebElement signin;
	//intialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getUsernameTF() {
		return usernameTF;
	}
	
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	
	public WebElement getSigninButton() {
		return signin;
	}
	
	//Business Library
	public void login(String USERNAME, String PASSWORD) {
		usernameTF.sendKeys(USERNAME);
		passwordTF.sendKeys(PASSWORD);
		signin.click();
		
	}
	public void signIn() {
		signin.click();
	}
	 
	
}
