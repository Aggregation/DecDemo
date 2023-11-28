package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_ChangePasswordPage {
	
	@FindBy(xpath = "//p[@style=\"color:red;\"]")
	private WebElement conformMessage;
	
	@FindBy(xpath = "//button[@name=\"submit\"]")
	private WebElement submitBtn;
	
	public Admin_ChangePasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getConformMessage() {
		return conformMessage;
	}


	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	

}
