package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonApp{
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Project1\\\\\\\\\\\\\\\\Phase5\\\\\\\\\\\\\\\\SeleniumPrograms\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIwqLa6_q--gIV3oNLBR2NrAC7EAAYASAAEgKWp_D_BwE%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9061995%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D694462394144260769%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        WebElement e=driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
        e.sendKeys("6303775582");
        WebElement e1=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
        e1.click();
        WebElement e2=driver.findElement(By.xpath("//input[@name=\"password\"]"));
      e2.sendKeys("Raju@123");
      WebElement e3=driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
      e3.click();
      WebElement e4=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
    e4.clear();
    e4.sendKeys("iphone 13 256gb");
    WebElement e5=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
    e5.click();
    WebElement e6=driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\" and text()=\"Apple iPhone 13 Pro Max (256GB) - Graphite\"]"));
  e6.click();
//  WebElement e7=driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]"));
//  
//  
// JavascriptExecutor js=(JavascriptExecutor)driver;
//  js.executeScript("arguments[0].scrollIntoView(true);",e7);
//  e7.click();
	}
	 
 }