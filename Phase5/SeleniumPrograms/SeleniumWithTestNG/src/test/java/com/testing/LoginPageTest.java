package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginPageTest {
	WebDriver wd;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Project1\\Phase5\\SeleniumPrograms\\chromedriver_win32\\chromedriver.exe.exe");
		wd = new ChromeDriver();
	}
	
  @Test
  public void loginPageTest() {
	  wd.get("file:///C:/Project1/Phase5/login.html");
	  WebElement emailIdRef = wd.findElement(By.id("n1"));
	  WebElement passwordRef = wd.findElement(By.id("n2"));
		emailIdRef.sendKeys("raju@gmail.com");
		passwordRef.sendKeys("1234");
		WebElement submitButtonRef = wd.findElement(By.id("b1"));
		submitButtonRef.click();
		Alert alertRef	= wd.switchTo().alert();		
		String result = alertRef.getText();		 
		alertRef.accept();
		assertEquals(result, "successfully login");
		
  }
  

  @AfterMethod
  public void afterMethod() {
	  wd.close();		
  }

}