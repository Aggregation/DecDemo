package com.hms.hospice.GenericUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

public class JavaUtils {
	
	public int getRandomNo()
	{
		Random ran=new Random();
		int random=ran.nextInt(500);
		return random;
	}
	
	public String readDateTime()
	{
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
         return timestamp;
	} 
	
	public int systemDate()
	{
		Date date=new Date();
		String SystemDate=date.toString();
		return systemDate();
	}
	public String systemDateInFormat()
	{
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy HH-mm-ss");
		Date date=new Date();
		String systemDateINformat=dateformat.format(date);
		return systemDateINformat;
	}

}
