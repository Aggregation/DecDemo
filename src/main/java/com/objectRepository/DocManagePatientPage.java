package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocManagePatientPage {

	@FindBy(name = "searchdata")
	private WebElement PatientSearchTF;
	
	@FindBy(xpath = "//button[@name=\"submit\"]")
	private WebElement submitBtn;
	
	@FindBy (xpath = "//i[@class=\"fa fa-eye\"]")
	private WebElement EyeIcon;
	
	@FindBy(xpath = "//i[@class=\"fa fa-edit\"]")
	private WebElement EditIcon;
	
	@FindBy(xpath = "//button[@class=\"btn btn-primary waves-effect waves-light w-lg\"]")
	private WebElement AddMedicalHistoryBtn;
	
	
	//
	public DocManagePatientPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//
	public WebElement getPatientSearchTF() {
		return PatientSearchTF;
	}

	

	public WebElement getSubmitBtn() {
		return submitBtn;
	}


	public WebElement getEyeIcon() {
		return EyeIcon;
	}

	public WebElement getEditIcon() {
		return EditIcon;
	}

	public WebElement getAddMedicalHistoryBtn() {
		return AddMedicalHistoryBtn;
	}
	
	
}
