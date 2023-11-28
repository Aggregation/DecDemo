package com.hms.hospice.GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils  {
	
	/**
	 * This method is used to read data from property file
	 * @author Naveen+
	 * @param key
	 * @return
	 * @throws Throwable 
	 */

	public String readDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.FILEPATH);
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
		
		
	}

//	public static void copyFile(File src, File dst) {
//		// TODO Auto-generated method stub
//		
//	}

	
}
