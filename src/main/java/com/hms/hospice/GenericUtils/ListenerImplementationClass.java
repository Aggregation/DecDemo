package com.hms.hospice.GenericUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementationClass implements ITestListener {

	ExtentReports report;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		
		String MethodName = result.getMethod().getMethodName();
		test =report.createTest(MethodName);
		Reporter.log(MethodName+"--- Test script execution starts from here ---");
		
	}
 
	@Override
	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName+"-->PASSED");
		Reporter.log(MethodName+"-- Testscript executed successfully--");
	} 

	@Override
	public void onTestFailure(ITestResult result) {
		String fscript = result.getMethod().getMethodName();
		test.addScreenCaptureFromPath(fscript);
		try
		{
		WebdriverUtils.getscreenshoot(BaseClass.sdriver, fscript);
		}
		catch (Throwable e) {
		    e.printStackTrace();
		}
		
		test.log(Status.FAIL, result.getThrowable());
		test.log(Status.FAIL, fscript+"--> Failed");
		Reporter.log(fscript+"--> Testscript execution failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	   String MethodName=result.getMethod().getMethodName();
	   test.log(Status.SKIP, MethodName+"--Skipped");
	   test.log(Status.SKIP, result.getThrowable());
	   Reporter.log(MethodName+"--> Testscript execution skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlreport=new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setDocumentTitle("TY");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("HOSPICE");
		
	   report=new ExtentReports();
	   report.attachReporter(htmlreport);
	   report.setSystemInfo("Base-Browser", "Chrome");
	   report.setSystemInfo("URL", "http://rmgtestingserver/domain/Hospital_Management_System/");
	   report.setSystemInfo("Reporter Name", "NaveenKumar");
	
	}

	@Override
	public void onFinish(ITestContext context) {
	
		//consolidate the report/ clean older report
		report.flush();
		
	}
	

}
