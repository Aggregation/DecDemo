package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.hospice.GenericUtils.WebdriverUtils;

public class HomePage  {
	
     //Deceleration
	@FindBy(xpath = "//div[@class=\"top-nav\"]//a[@href=\"index.html\"]")
	private WebElement Home_linkTop;
	
	@FindBy(xpath = "//div[@class=\"top-nav\"]//a[@href=\"contact.php\"]")
	private WebElement Contact_LinkTop;
	
	@FindBy(xpath = "//a[@href=\"hms/user-login.php\"]")
	private WebElement patient_login_link;
	
	@FindBy(xpath = "//a[@href=\"hms/doctor/\"]")
	private WebElement Doctor_login_link;
	
	@FindBy(xpath = "//a[@href=\"hms/admin\"]")
	private WebElement Admin_login_link;
	
	@FindBy(xpath = "//div[@class=\"footer\"]//a[@href=\"index.html\"]")
	private WebElement Home_linkFotter;
	
	@FindBy(xpath = "//div[@class=\"footer\"]//a[@href=\"contact.php\"]")
	private WebElement contact_linkFotter;
	
	
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

	//utilization
	public WebElement getHome_linkTop() {
		return Home_linkTop;
	}

	public WebElement getContact_LinkTop() {
		return Contact_LinkTop;
	}

	public WebElement getPatient_login_link() {
		return patient_login_link;
	}

	public WebElement getDoctor_login_link() {
		return Doctor_login_link;
	}

	public WebElement getAdmin_login_link() {
		return Admin_login_link;
	}

	public WebElement getHome_linkFotter() {
		return Home_linkFotter;
	}

	public WebElement getContact_linkFotter() {
		return contact_linkFotter;
	}
	
	//business logic
	
	public void adminlinkClick()
	{
		Admin_login_link.click();
	}
	public void patientlinkClick()
	{
		patient_login_link.click();
	}
	public void doctorlinkClick()
	{
		Doctor_login_link.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
