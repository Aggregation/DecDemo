package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {
	
	//Declaration
	@FindBy(name = "username")
	private WebElement Admin_UN;
	
	@FindBy(name = "password")
	private WebElement Admin_PWD;
	
	@FindBy(name = "submit")
	private WebElement submit_Btn;
	
	
	
	//initialization
	public AdminLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	//utilization
	public WebElement getAdmin_UN() {
		return Admin_UN;
	}

	public WebElement getAdmin_PWD() {
		return Admin_PWD;
	}

	public WebElement getSubmit_Btn() {
		return submit_Btn;
	}	
	
	//business logic
	public void adminlogin(String AdminUsername, String AdminPassword)
	{
		Admin_UN.sendKeys(AdminUsername);
		Admin_PWD.sendKeys(AdminPassword);
		submit_Btn.click();
	}


}
