package com.Testng_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page extends Base_Class {

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbtn;
	
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[2]")
	private WebElement pimbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getPimbtn() {
		return pimbtn;
	}

	public void setPimbtn(WebElement pimbtn) {
		this.pimbtn = pimbtn;
	}
	
	

}
