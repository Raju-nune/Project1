package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Project1\\Phase5\\SeleniumPrograms\\chromedriver_win32//chromedriver.exe.exe");
		//System.setProperty("webdriver.edge.driver", null)	
		WebDriver wd = new ChromeDriver();
		wd.get("file:///C:/Project1/Phase5/login.html");
//		String sourceCurrentPagePath = wd.getCurrentUrl();
//		System.out.println(sourceCurrentPagePath);
//		WebElement emailIdRef = wd.findElement(By.id("n1"));
//		WebElement passwordRef = wd.findElement(By.id("n2"));
//		emailIdRef.sendKeys("raju@gmail.com");
//		passwordRef.sendKeys("1234");
//		WebElement submitRef = wd.findElement(By.id("b1"));
//		submitRef.click();
//		String targetCurrentPagePath = wd.getCurrentUrl();
//		System.out.println(targetCurrentPagePath);
//		WebElement h2tagRef=wd.findElement(By.tagName("h2"));
//		System.out.println(h2tagRef.getText());
//		WebElement resetRef = wd.findElement(By.id("b2"));
//		resetRef.click();
		// email validation 
//		WebElement emailIdRef = wd.findElement(By.id("n1"));
//		WebElement passwordRef = wd.findElement(By.id("n2"));
//		WebElement submitButtonRef = wd.findElement(By.id("b1"));
//		submitButtonRef.click();
//		Alert alertRef	= wd.switchTo().alert();		// give the alert box reference 
//		System.out.println(alertRef.getText());		// alert box content 
//		alertRef.accept();							// click ok bututon of alert box 
//		wd.close();									// close the application. 
		
		// password validation 
		WebElement emailIdRef = wd.findElement(By.id("n1"));
		WebElement passwordRef = wd.findElement(By.id("n2"));
		emailIdRef.sendKeys("raju@gmail.com");
		WebElement submitButtonRef = wd.findElement(By.id("b1"));
		submitButtonRef.click();
		Alert alertRef	= wd.switchTo().alert();		// give the alert box reference 
		System.out.println(alertRef.getText());		// alert box content 
		alertRef.accept();							// click ok bututon of alert box 

	//	wd.close();
	}

}
