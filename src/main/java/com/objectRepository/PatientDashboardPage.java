package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientDashboardPage {
	
	@FindBy(xpath = "//a[@href=\"dashboard.php\"]")
	private WebElement patientDashBoard_subMod;
	
	@FindBy(xpath = "//a[@href=\"book-appointment.php\"]/child::div[@class=\"item-content\"]")
	private WebElement BookAppointment_submod;
	
	@FindBy(xpath = "//a[@href=\"appointment-history.php\"]/child::div[@class=\"item-content\"]" )
	private WebElement AppointmentHistory_submod;
	
	@FindBy(xpath = "//a[@href=\"manage-medhistory.php\"]/child::div[@class=\"item-content\"]")
	private WebElement MedicalHistory_submod;
	
	@FindBy(xpath = "//p[@class=\"links cl-effect-1\"]/a[@href=\"edit-profile.php\"]")
	private WebElement Patinet_UpdateProfile_link;
	
	@FindBy(xpath = "//p[@class=\"cl-effect-1\"]/a[@href=\"appointment-history.php\"]")
	private WebElement PatView_Appoint_History_link;
	
	@FindBy(xpath = "//p[@class=\"links cl-effect-1\"]/a[@href=\"book-appointment.php\"]")
	private WebElement Book_appointment_link;
	
	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
	private WebElement ProfileDD;
	
	@FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-dark\"]//a[@href=\"edit-profile.php\"]")
	private WebElement MyProfile_link;
	
	@FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-dark\"]//a[@href=\"change-password.php\"]")
	private WebElement ChangePassword_link;
	
	@FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-dark\"]//a[@href=\"logout.php\"]")
	private WebElement Logout_link;
	
	
	
	
	public PatientDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	
	public WebElement getPatientDashBoard_subMod() {
		return patientDashBoard_subMod;
	}

	public WebElement getBookAppointment_submod() {
		return BookAppointment_submod;
	}

	public WebElement getAppointmentHistory_submod() {
		return AppointmentHistory_submod;
	}

	public WebElement getMedicalHistory_submod() {
		return MedicalHistory_submod;
	}

	public WebElement getPatinet_UpdateProfile_link() {
		return Patinet_UpdateProfile_link;
	}

	public WebElement getPatView_Appoint_History_link() {
		return PatView_Appoint_History_link;
	}

	public WebElement getBook_appointment_link() {
		return Book_appointment_link;
	}

	public WebElement getProfileDD() {
		return ProfileDD;
	}

	public WebElement getMyProfile_link() {
		return MyProfile_link;
	}

	public WebElement getChangePassword_link() {
		return ChangePassword_link;
	}

	public WebElement getLogout_link() {
		return Logout_link;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
