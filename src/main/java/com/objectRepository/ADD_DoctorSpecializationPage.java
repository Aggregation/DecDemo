package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ADD_DoctorSpecializationPage {
	
	@FindBy(name = "doctorspecilization")
	private WebElement DoctorSpecilization;
	
	@FindBy(name = "submit")
	private WebElement SubmitBtn;

}
