package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientLoginPage {

	//declaration
	@FindBy(name = "username")
	private WebElement Patient_UN;
	
	@FindBy(name = "password")
	private WebElement Patient_PWD;
	
	@FindBy(name = "submit")
	private WebElement submit_Btn;
	

	//initialization
	public PatientLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getPatient_UN() {
		return Patient_UN;
	}


	public WebElement getPatient_PWD() {
		return Patient_PWD;
	}


	public WebElement getSubmit_Btn() {
		return submit_Btn;
	}
	
	

	
     	

}
