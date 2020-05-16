package com.vtiger.alltestscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vtiger.generic.ExcelOperation;
import com.vtiger.generic.ValidationOperation;
import com.vtiger.specific.SuperTestScript;

public class LoginAndLogout extends SuperTestScript
{
	@Test
	public void testLoginAndLogout() throws Exception
	{
		String lpExpTitle = ExcelOperation.readData("TC-01", 1, 0);
		String userName = ExcelOperation.readData("TC-01", 1, 3);
		String password = ExcelOperation.readData("TC-01",1, 4);
		String hpExpTitle = ExcelOperation.readData("TC-01", 1, 5);
		
		
		String lpActTitle = driver.getTitle();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(userName);
	    driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		String hpActTitle = driver.getTitle();
		
		
		ExcelOperation.writeData("TC-01",1,1,lpActTitle);
		String lpTitleValidation = ValidationOperation.verifyMsg(lpActTitle, lpExpTitle);
		ExcelOperation.writeData("TC-01", 1, 2,lpTitleValidation);
		ExcelOperation.writeData("TC-01", 1, 6, hpActTitle);
		String hpTitleValidation = ValidationOperation.verifyMsg(hpActTitle, hpExpTitle);
		ExcelOperation.writeData("TC-01",1,7,hpTitleValidation);
		
		
	}
	

}
