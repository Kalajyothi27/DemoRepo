package com.vtiger.generic;

import org.testng.Assert;

public class ValidationOperation
{
	public static String verifyMsg(String actResult, String expResult)
	{
		try
		{
			System.out.println("Inside Validation");
			Assert.assertEquals(actResult, expResult);
			return "Pass";
		}
		catch(AssertionError rv)
		{
			return "Fail";
		}
	}

}
