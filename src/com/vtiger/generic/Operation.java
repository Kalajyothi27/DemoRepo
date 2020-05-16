package com.vtiger.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Operation 
{
	public static void main(String[] args) throws Exception
	{
	File f1 = new File("‪‪‪C:\\Users\\Kalajyothi\\Documents\\testData.xlsx");
	FileInputStream fis = new FileInputStream(f1);
	Workbook w1 = WorkbookFactory.create(fis);
	String data = w1.getSheet("TC-01").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	}
	
	

}
