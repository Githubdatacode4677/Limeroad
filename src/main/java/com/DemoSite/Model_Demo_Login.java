package com.DemoSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Model_Demo_Login extends Base_Class  {
	
	public Model_Demo_Login() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement loginbtn;

	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(id = "Password")
	private WebElement pass;

	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement submitbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
