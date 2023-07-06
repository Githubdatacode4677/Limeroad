package com.DemoTest;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.DemoSite.Base_Class;
import com.Testng_pro.PageObjectManager;

public class Task_Test extends Base_Class {
	
	PageObjectManager pom = new PageObjectManager();

	@BeforeTest
	private void launchBrowser() {
		browserLaunch("chrome");
		getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	@BeforeMethod
	private void loginCredentials()   {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	@Test
	private void validateTitle() {

		String currentTitle = getCurrentTitle();
		System.out.println(currentTitle);
	}
	
}
