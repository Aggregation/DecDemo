package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminEditDoctorDetailsPage {
	
	
	@FindBy(name = "Doctorspecialization")
	private WebElement DoctorspecDD;
	
	@FindBy(name = "docname")
	private WebElement DoctNameTF;
	
	@FindBy(name = "clinicaddress")
	private WebElement CliAdddressTF;
	
	@FindBy(name = "docfees")
	private WebElement ConFessTF;
	
	@FindBy(name = "doccontact")
	private WebElement ContactTF;
	
	@FindBy(xpath = "//input[@name=\"docemail\"]")
	private WebElement DocEmailTF;
	
	@FindBy(name = "npass")
	private WebElement NewPasswordTF;
	
	@FindBy(name = "cfpass")
	private WebElement ConPassowrdTF;
	
	@FindBy(name = "submit")
	private WebElement SubmitBtn;
	
	@FindBy(xpath = "//h5[@style=\"color: green; font-size:18px; \"]")
	private WebElement ConfirmMessage;
	
	//initialization
	public AdminEditDoctorDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getDoctorspecDD() {
		return DoctorspecDD;
	}

	public WebElement getDoctNameTF() {
		return DoctNameTF;
	}

	public WebElement getCliAdddressTF() {
		return CliAdddressTF;
	}

	public WebElement getConFessTF() {
		return ConFessTF;
	}

	public WebElement getContactTF() {
		return ContactTF;
	}

	public WebElement getDocEmailTF() {
		return DocEmailTF;
	}

	public WebElement getNewPasswordTF() {
		return NewPasswordTF;
	}

	public WebElement getConPassowrdTF() {
		return ConPassowrdTF;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}

	public WebElement getConfirmMessage() {
		return ConfirmMessage;
	}
	
	
	
	

}
