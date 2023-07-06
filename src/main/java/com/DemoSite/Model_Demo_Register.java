package com.DemoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Model_Demo_Register extends Base_Class {

	public Model_Demo_Register() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//label[text()='Male']")
	private WebElement gender;

	@FindBy(id = "FirstName")
	private WebElement firstname;

	@FindBy(id = "LastName")
	private WebElement lastname;

	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(id = "Password")
	private WebElement pass;

	@FindBy(id = "ConfirmPassword")
	private WebElement cpass;

	@FindBy(xpath = "//input[@value='Register']")
	private WebElement registerbtn;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement submitbtn;

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getCpass() {
		return cpass;
	}

	public WebElement getRegisterbtn() {
		return registerbtn;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
