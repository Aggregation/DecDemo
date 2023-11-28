package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientBookAppointmentPage {
	
	@FindBy(xpath = "//select[@name=\"Doctorspecialization\"]")
	private WebElement DoctorSpecDD;
	
	@FindBy(xpath = "//select[@name=\"doctor\"]")
	private WebElement DoctornameTF;
	
	@FindBy(xpath = "//td[text()=\"26\"]")
	private WebElement Date_Field;
	
	@FindBy(name = "apptime")
	private WebElement TimeField;
	
	@FindBy(name = "submit")
	private WebElement SubmitBtn;
	
	public PatientBookAppointmentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getDoctorSpecDD() {
		return DoctorSpecDD;
	}

	public WebElement getDoctornameTF() {
		return DoctornameTF;
	}

	public WebElement getDate_Field() {
		return Date_Field;
	}

	
	public WebElement getTimeField() {
		return TimeField;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	

}
