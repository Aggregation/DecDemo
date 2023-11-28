package com.hms.hospice.GenericUtils;
      
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtils {
	
	Connection con=null;
	
	public void connectDB() throws SQLException
	{
  
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		con=DriverManager.getConnection(IpathConstants.DBURL, IpathConstants.DB_USERNAME, IpathConstants.DB_PASSWORD);
	}
	
	
	public String ExecuteAndGetData(int colData, String ExpData, String query) throws SQLException
	{
		Statement state=con.createStatement();
		//String query="select * from student;";
		ResultSet result = state.executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			String actual=result.getString(colData);
			if(actual.equalsIgnoreCase(ExpData))
			{
				flag=true;
				break;
				
			}
		}
		if(flag)
		{
			System.out.println("Project created successfully");
			return ExpData;
		}
		else
		{
			System.out.println("Project is not created");
			return "";
		}
	}
	
	/**
	 * This method is used to close the DataBase Connectivity
	 * @throws Throwable
	 */
	
	public void disconnectDB() throws Throwable
	{
		con.close();
	}

}
