package com.hms.hospice.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcelUtils {
	
	/**
	 * This method used to read the data from excel
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String readDatafromExcel(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IpathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		String value = sh.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	/**
	 * This method is used to get the total row count
	 * @return 
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * 
	 */
	public int getLastRowNO(String sheetName) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream(IpathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int count = sh.getLastRowNum();
		return count;
			
	}

	/**
	 * This method is used to write data into excel
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws Throwable
	 */
	public void WriteDataIntoExcel(String sheetName, int row, int cell,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		sh.createRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream fout=new FileOutputStream(IpathConstants.EXCELPATH);
		wb.write(fout);
		wb.close();
		
	}
	/**
	 * This method is used to read multiple data from Excel
	 * @param sheetName
	 * @param driver
	 * @throws Throwable
	 */
	
	public void readMultipleData(String sheetName, WebDriver driver) throws Throwable
	{
		JavaUtils jlib=new JavaUtils();
		FileInputStream fis=new FileInputStream(IpathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int count=sh.getLastRowNum();
		String value="";
		HashMap<String, String> map=new HashMap<String, String>();
		for(int i=0;i<=count;i++)
		{
			String key=sh.getRow(i).getCell(0).getStringCellValue();
			value=sh.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
			
		}
		
		for(Entry<String, String> set:map.entrySet())
		{
			
//			if(set.getKey().contains("doctorname"))
//			{
//				driver.findElement(By.name(set.getKey())).sendKeys(set.getValue()+jlib.getRandomNo());
//			}
	
			 WebElement data = driver.findElement(By.name(set.getKey()));
			data.clear();
			data.sendKeys(set.getValue()+jlib.getRandomNo());
			
			
		}
		
	}
	
  
	
	
	//object[][] by DataProvider
	public Object[][] readmultipleDatafromDataProvider(String sheetname) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int rowcount=sh.getPhysicalNumberOfRows();
		int colcount=sh.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[rowcount][colcount];
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
