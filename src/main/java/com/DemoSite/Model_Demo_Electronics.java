package com.DemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Model_Demo_Electronics extends Base_Class {
	
	public Model_Demo_Electronics()  {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@href='/electronics'])[1]")
	private WebElement element;
	
	@FindBy (xpath = "(//a[@href='/camera-photo'])[4]")
	private WebElement camera;	
	
	
}
