package com.vtiger.specific;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.vtiger.generic.ExcelOperation;

abstract public class SuperTestScript 
{
  public static WebDriver driver;
  
  @BeforeMethod
  public void preConfig()
  {
	  System.out.println("Inside BeforeMethod");
	  String browser = ExcelOperation.readData("PreConfig", 1, 0);
	  String url = ExcelOperation.readData("PreConfig", 1, 1);
	  
	  if(browser.equals("FF"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Kalajyothi\\Documents\\Softwares\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
	  }
	  
	  else
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalajyothi\\Documents\\Softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @AfterMethod
  public void postConfig()
  {
	  System.out.println("Inside AfterMethod");
	  driver.close();
  }
}
