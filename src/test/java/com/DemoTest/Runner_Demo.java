package com.DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.DemoSite.Base_Class;
import com.DemoSite.PageObjectManager_Demo;

public class Runner_Demo extends Base_Class {

	static PageObjectManager_Demo pomd = new PageObjectManager_Demo();

	public static void launchBrowser() {
		browserLaunch("chrome");
		getUrl("https://demowebshop.tricentis.com/register");

	}

	public static void register() {

		//WebElement gender = pomd.getMdg().getGender();
		WebElement firstname = pomd.getMdg().getFirstname();
		WebElement lastname = pomd.getMdg().getLastname();
		WebElement email = pomd.getMdg().getEmail();
		WebElement pass = pomd.getMdg().getPass();
		WebElement cpass = pomd.getMdg().getCpass();
		WebElement registerbtn = pomd.getMdg().getRegisterbtn();
		// WebElement submitbtn = pomd.getMdg().getSubmitbtn();
		

		clickElement(pomd.getMdg().getGender());
		inputValue(firstname, "Mark");
		inputValue(lastname, "Antony");
		inputValue(email, "MarkAntony@gmail.com");
		inputValue(pass, "123456789");
		inputValue(cpass, "123456789");
		clickElement(registerbtn);
		//clickElement(submitbtn);

	}

	public static void login() {
		browserLaunch("chrome");
		getUrl("https://demowebshop.tricentis.com/register");

	

		WebElement login = pomd.getMdl().getLoginbtn();
		WebElement email = pomd.getMdl().getEmail();
		WebElement pass = pomd.getMdl().getPass();
		WebElement submitbtn = pomd.getMdl().getSubmitbtn();

		clickElement(login);
		inputValue(email, "MarkAntony@gmail.com");
		inputValue(pass, "123456789");
		clickElement(submitbtn);
	}

	public static void main(String[] args) {

		launchBrowser();
		//register();
		login();

	}

}
