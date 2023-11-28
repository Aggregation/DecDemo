package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientEditProfilePage {
	
	
	@FindBy(name = "fname")
	private WebElement UserNameTF;
	
	@FindBy(name = "address")
	private WebElement AddressTf;
	
	@FindBy(name = "city")
	private WebElement CityTf;
	
	
	@FindBy(name = "submit")
	private WebElement submitBtn;
	
	
	@FindBy(xpath = "//h5[@style=\"color: green; font-size:18px; \"]")
	private WebElement ConformMessage;
	
	
	public PatientEditProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getUserNameTF() {
		return UserNameTF;
	}


	public WebElement getAddressTf() {
		return AddressTf;
	}


	public WebElement getCityTf() {
		return CityTf;
	}


	public WebElement getSubmitBtn() {
		return submitBtn;
	}


	public WebElement getConformMessage() {
		return ConformMessage;
	}
	
	
	

}
