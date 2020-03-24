package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddNewAddress {

	WebDriver driver;
	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver",  "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	
	 //using webdriver get visting the testing website
	
		driver.get("http://automationpractice.com/index.php?");
		System.out.println(driver.getTitle());
	}
	public void LoginDeatils() throws IOException, InterruptedException 
	{
		Thread.sleep(1000);
	//	loginClick.click();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("likhithagudur98@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("likki464");
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
		
	}
	
	public void myAddress() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'My addresses')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Add a new address')]")).click();
		
	}
	
	public void addAddress() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("vamsi");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("sholiganur");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");
		WebElement drop=driver.findElement(By.xpath("//select[@id='id_state']"));
		drop.click();
		WebElement ind=driver.findElement(By.xpath("//option[contains(text(),'Indiana')]"));
		ind.click();
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("04022004689");
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("7702828488");
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("homeaddress");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
		
	}
	
}
