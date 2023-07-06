package com.Testng_pro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel extends Base_Class {

	public PageObjectModel() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginbtn;

	@FindBy(xpath = "//div[@class='_9ay7']")
	private WebElement msgtext;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getMsgtext() {
		return msgtext;
	}

}
