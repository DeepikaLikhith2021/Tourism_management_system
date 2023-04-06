package com.Object_repository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Travel.TMS_generic_utility.ExcelUtility;

public class UpdateRemarkPage {
	@FindBy(xpath="//textarea[@name='remark']") private WebElement remark;
	@FindBy(xpath="//input[@value='update']") private WebElement update;
	public  UpdateRemarkPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void remarktheissue(ExcelUtility Elib, String data) throws IOException, Throwable {
	data=Elib.readdatafromexcel("Issue_solve", 0, 0);
	remark.sendKeys(data);	
	update.click();
	}
	

}
