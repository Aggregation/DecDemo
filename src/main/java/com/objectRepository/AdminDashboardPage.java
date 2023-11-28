package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPage {
	
	//declaration
	
	@FindBy(xpath = "//a[@href=\"dashboard.php\"]")
	private WebElement Dashboard_submodule;
	
	
	@FindBy(xpath = "//span[text()=\" Doctors \"]/ancestor::a[@href=\"javascript:void(0)\"]")
	private WebElement Doctor_submodule;
	
	@FindBy(xpath = "//span[text()=\" Doctor Specialization \"]")
	private WebElement DoctorSpecialization_link;
	
	@FindBy(xpath = "//span[text()=\" Add Doctor\"]")
	private WebElement AddDoctor_link;
	
	@FindBy(xpath = "//span[text()=\" Manage Doctors \"]")
	private WebElement ManageDoctor_link;
	
	@FindBy(xpath = "//span[text()=\" Users \"]/ancestor::a[@href=\"javascript:void(0)\"]")
	private WebElement User_submodule;
	
	@FindBy(xpath = "//span[text()=\" Manage Users \"]")
	private WebElement Manage_users_link;
	
	@FindBy(xpath = "//span[text()=\" Manage Patients \"]")
	private WebElement ManagePatients_links;
	
	@FindBy(xpath = "//span[text()=\" Patients \"]/ancestor::a[@href=\"javascript:void(0)\"]")
	private WebElement Patient_submodule;
	
	@FindBy(xpath = "//span[text()=\" Appointment History \"]")
	private WebElement AppointmentHistory_submodule;
	
	@FindBy(xpath = "//span[text()=\" Conatctus Queries \"]/ancestor::a[@href=\"javascript:void(0)\"]")
	private WebElement ContactQueries_submodule;
	
	@FindBy(xpath = "//span[text()=\" Unread Query \"]")
	private WebElement UnreadQueries_link;
	
	@FindBy(xpath = "//span[text()=\" Read Query \"]")
	private WebElement ReadQueries_link;
	
	@FindBy(xpath = "//span[text()=\"B/w dates reports \"]")
	private WebElement BetweenDateReports_link;
	
	
	@FindBy(xpath = "//span[text()=\" Doctor Session Logs \"]")
	private WebElement DoctorSessionLogs_submodule;
	
	@FindBy(xpath = "//span[text()=\" User Session Logs \"]")
	private WebElement UserSessionLogs_submodule;
	
	@FindBy(xpath = "//span[text()=\" Reports \"]/ancestor::a[@href=\"javascript:void(0)\"]")
	private WebElement Reports_submodule;
	
	@FindBy(xpath = "//span[text()=\" Patient Search \"]")
	private WebElement patientSearch_submodule;
	
	@FindBy(xpath = "//a[@href=\"manage-users.php\"]/parent::p[@class=\"links cl-effect-1\"]")
	private WebElement TotalUser_link;
	
	@FindBy(xpath = "//a[@href=\"manage-doctors.php\"]/parent::p[@class=\"cl-effect-1\"]")
	private WebElement TotalDoctors_link;
	
	@FindBy(xpath = "//a[@href=\"appointment-history.php\"]/parent::p[@class=\"links cl-effect-1\"]")
	private WebElement Appointmenthistory_link;
	
	@FindBy(xpath = "//a[@href=\"manage-patient.php\"]/parent::p[@class=\"links cl-effect-1\"]")
	private WebElement TotalPatients_link;
	
	@FindBy(xpath = "//a[@href=\"unread-queries.php\"]/parent::p[@class=\"links cl-effect-1\"]")
	private WebElement TotalQueries_link;
	
	@FindBy(xpath = "//a[@class=\"dropdown-toggle\"]")
	private WebElement profileDD;
	
	@FindBy(xpath = "//a[@href=\"change-password.php\"]")
	private WebElement ChangePassword_link;
	
	@FindBy(xpath = "//a[@href=\"logout.php\"]")
	private WebElement Logout_link;
	
	
	public AdminDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getDashboard_submodule() {
		return Dashboard_submodule;
	}

	public WebElement getDoctor_submodule() {
		return Doctor_submodule;
	}

	public WebElement getDoctorSpecialization_link() {
		return DoctorSpecialization_link;
	}

	public WebElement getAddDoctor_link() {
		return AddDoctor_link;
	}

	public WebElement getManageDoctor_link() {
		return ManageDoctor_link;
	}

	public WebElement getUser_submodule() {
		return User_submodule;
	}

	public WebElement getManage_users_link() {
		return Manage_users_link;
	}

	public WebElement getManagePatients_links() {
		return ManagePatients_links;
	}

	public WebElement getPatient_submodule() {
		return Patient_submodule;
	}

	public WebElement getAppointmentHistory_submodule() {
		return AppointmentHistory_submodule;
	}

	public WebElement getContactQueries_submodule() {
		return ContactQueries_submodule;
	}

	public WebElement getUnreadQueries_link() {
		return UnreadQueries_link;
	}

	public WebElement getReadQueries_link() {
		return ReadQueries_link;
	}

	public WebElement getBetweenDateReports_link() {
		return BetweenDateReports_link;
	}

	public WebElement getDoctorSessionLogs_submodule() {
		return DoctorSessionLogs_submodule;
	}

	public WebElement getUserSessionLogs_submodule() {
		return UserSessionLogs_submodule;
	}

	public WebElement getReports_submodule() {
		return Reports_submodule;
	}

	public WebElement getPatientSearch_submodule() {
		return patientSearch_submodule;
	}

	public WebElement getTotalUser_link() {
		return TotalUser_link;
	}

	public WebElement getTotalDoctors_link() {
		return TotalDoctors_link;
	}

	public WebElement getAppointmenthistory_link() {
		return Appointmenthistory_link;
	}

	public WebElement getTotalPatients_link() {
		return TotalPatients_link;
	}

	public WebElement getTotalQueries_link() {
		return TotalQueries_link;
	}

	public WebElement getProfileDD() {
		return profileDD;
	}

	public WebElement getChangePassword_link() {
		return ChangePassword_link;
	}

	public WebElement getLogout_link() {
		return Logout_link;
	}
	
	

}
