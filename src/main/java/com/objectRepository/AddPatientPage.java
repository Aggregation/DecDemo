package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPatientPage {
	@FindBy(name = "patname")
	private WebElement PatnameTF;
	
	@FindBy(name = "patcontact")
	private WebElement patContactTF;
	
	@FindBy(name = "patemail")
	private WebElement PatEmailTF;
	
	@FindBy(xpath = "//label[@for=\"rg-female\"]")
	private WebElement FemaleRadioBtn;
	
	@FindBy(xpath = "//label[@for=\"rg-male\"]")
	private WebElement MaleRadioBtn;
	
	@FindBy(name = "pataddress")
	private WebElement PatAddressTF;
	
	@FindBy(name = "patage")
	private WebElement PatAge;
	
	@FindBy(name = "medhis")
	private WebElement medHistory;
	
	@FindBy(name = "submit")
	private WebElement Addbtn;
	

}
