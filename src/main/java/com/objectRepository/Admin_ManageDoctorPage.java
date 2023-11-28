package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_ManageDoctorPage {
	
	@FindBy(xpath="//tr//td[3]/following-sibling::td/div/a[@href=\"edit-doctor.php?id=3\"]")
	private WebElement Editicon;

	public Admin_ManageDoctorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEditicon() {
		return Editicon;
	}
	
	
}
