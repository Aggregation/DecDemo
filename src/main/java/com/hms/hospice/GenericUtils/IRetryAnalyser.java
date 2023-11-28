package com.hms.hospice.GenericUtils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyser implements IRetryAnalyzer {

	int count=0;
	int retrylimit=3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<retrylimit)
		{
			count++;
			return true;
		}
		return false;
	}
	

}
