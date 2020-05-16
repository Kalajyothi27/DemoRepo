package com.vtiger.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstScript 
{
  public static void main(String[] args) throws  InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:/Users/Kalajyothi/Documents/Softwares/selenium/chromedriver_win32/chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://localhost:8888/");
	
	  driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	  
	  
	  driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("7757");
	  driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	  driver.findElement(By.xpath("//a[text()='Products']")).click();
	  WebElement productDropdownElement = driver.findElement(By.xpath("(//select[@name='search_field'])[1]"));
	  Select pdd = new Select(productDropdownElement);
	  pdd.selectByIndex(1);
	  
	  
  }
}
