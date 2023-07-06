package com.DemoTest;

import org.openqa.selenium.WebElement;

import com.DemoSite.Base_Class;
import com.Testng_pro.PageObjectModel;

public class Test_Task extends Base_Class {
	
	public static void main(String[] args) {
		browserLaunch("chrome");
		getUrl("https://www.facebook.com");
		
		PageObjectModel pom = new PageObjectModel();
	
		inputValue(pom.getUsername(), "jai");
		inputValue(pom.getPassword(), "jai@123");
		clickElement(pom.getLoginbtn());
		
		String expectText = "The email address entered is correct";
		String currentText = gettext(pom.getMsgtext());
		if (expectText.equalsIgnoreCase(currentText))   {
			System.out.println("Expected Text Is Same");
		
		}
		else {
			System.out.println("Text Is Not Same");
		}
		
	}


	


	
	
	
}
