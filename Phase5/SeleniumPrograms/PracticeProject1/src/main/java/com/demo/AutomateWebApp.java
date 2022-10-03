package com.demo;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class AutomateWebApp {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Project1\\\\\\\\\\\\\\\\Phase5\\\\\\\\\\\\\\\\SeleniumPrograms\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
			driver.manage().window().maximize();
			
		
			Thread.sleep(5000);
			WebElement email=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content"));
			email.sendKeys("dhoni@gmail.com");
			Thread.sleep(3000);
			
			
			WebElement pass=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
			pass.sendKeys("DhoniSingh@07");
			Thread.sleep(3000);
			
			
			
			WebElement repass=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content"));
			repass.sendKeys("DhoniSingh@07");
			Thread.sleep(3000);
			

			WebElement country=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content"));
			country.sendKeys("India");
			Thread.sleep(3000);

			WebElement Fname=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content"));
			Fname.sendKeys("Mahendra");
			Thread.sleep(3000);

			WebElement Lname=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));
			Lname.sendKeys("Singh");
			Thread.sleep(3000);

			WebElement JobTitle=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content"));
			JobTitle.sendKeys("Cricketer");
			Thread.sleep(3000);

			WebElement phone=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content"));
			phone.sendKeys("9703538364");
			Thread.sleep(3000);

			WebElement comName=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content"));
			comName.sendKeys("BCCI");
			Thread.sleep(3000);

			WebElement add=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content"));
			add.sendKeys("PUNE");
			Thread.sleep(3000);

			WebElement city=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content"));
			city.sendKeys("PUNE");
			Thread.sleep(3000);

			WebElement state=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content"));
			state.sendKeys("MAHARASHTRA");
			Thread.sleep(3000);

			WebElement postal=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content"));
			postal.sendKeys("515761");
			Thread.sleep(3000);
			
			WebElement create= driver.findElement(By.id("sView1:r1:0:b1"));
			create.submit();
			Thread.sleep(3000);

		}
	}

