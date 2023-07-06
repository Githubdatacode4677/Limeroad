package com.Testng_pro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Runner_Class extends Base_Class {
PageObjectManager pom = new PageObjectManager();

	@BeforeTest
	private void launchBrowser() throws InterruptedException {
		browserLaunch("chrome");
		getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//getUrl("https://www.google.com");
		
Thread.sleep(3000);
	}

	@BeforeMethod
	private void loginCredential() {
		inputValues(pom.getOrange().getUsername(), "Admin");
		inputValues(pom.getOrange().getPassword(), "admin123");
//		clickByScript(pom.getOrange().getLoginbtn());
		
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//(//a[@class='oxd-main-menu-item'])[2]")).click();
            
	}
	
	


	@Test
	private void validateTitle() {

		String currentTitle = getCurrentTitle();
		System.out.println(currentTitle);
	}

//	@AfterMethod
//	private void screenShot() throws Throwable {
//		screenShot("orange");
//	}
//
//	@AfterTest
//	private void tearDown() {
//		exit();
//
//	}

}
