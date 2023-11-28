package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorDashBoardPage {


	@FindBy(xpath = "//a[@href=\"dashboard.php\"]")
	private WebElement DoctorDashboard_submod;
	
	@FindBy(xpath = "//a[@href=\"appointment-history.php\"]//span[@class=\"title\"]")
	private WebElement AppointmentHistory_submod;
	
	@FindBy(xpath = "//a[@href=\"javascript:void(0)\"]//span[@class=\"title\"]")
	private WebElement Patients_submod;
	
	@FindBy(xpath = "//a[@href=\"add-patient.php\"]//span[@class=\"title\"]")
	private WebElement AddPatient_link;
	
	@FindBy(xpath = "//a[@href=\"manage-patient.php\"]//span[@class=\"title\"]")
	private WebElement managepatient_link;
	
	@FindBy(xpath = "//a[@href=\"search.php\"]//span[@class=\"title\"]")
	private WebElement Search_submodule;
	
	@FindBy(xpath = "//p[@class=\"links cl-effect-1\"]//a[@href=\"edit-profile.php\"]")
	private WebElement UpdateProfile_link;
	
	@FindBy(xpath = "//p[@class=\"cl-effect-1\"]//a[@href=\"appointment-history.php\"]")
	private WebElement  View_AppointementHistory_link;
	
	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
	private WebElement ProfileDD;
	
	@FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-dark\"]//a[@href=\"edit-profile.php\"]")
	private WebElement MyprofileLink;
	
	@FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-dark\"]//a[@href=\"change-password.php\"]")
	private WebElement DChangePassswordLink;
	
	@FindBy(xpath = "//a[@href=\"logout.php\"]")
	private WebElement DLogout_link;
	
	
	
	public DoctorDashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public WebElement getDoctorDashboard_submod() {
		return DoctorDashboard_submod;
	}



	public WebElement getAppointmentHistory_submod() {
		return AppointmentHistory_submod;
	}



	public WebElement getPatients_submod() {
		return Patients_submod;
	}



	public WebElement getAddPatient_link() {
		return AddPatient_link;
	}



	public WebElement getManagepatient_link() {
		return managepatient_link;
	}



	public WebElement getSearch_submodule() {
		return Search_submodule;
	}



	public WebElement getUpdateProfile_link() {
		return UpdateProfile_link;
	}



	public WebElement getView_AppointementHistory_link() {
		return View_AppointementHistory_link;
	}



	public WebElement getProfileDD() {
		return ProfileDD;
	}



	public WebElement getMyprofileLink() {
		return MyprofileLink;
	}



	public WebElement getDChangePassswordLink() {
		return DChangePassswordLink;
	}



	public WebElement getDLogout_link() {
		return DLogout_link;
	}

	
	
	
}


