package com.Testng_pro;

import org.openqa.selenium.support.PageFactory;

public class PageObjectManager extends Base_Class {

	public PageObjectManager() {
		PageFactory.initElements(driver, this);
	}

	private Home_Page orange;

	public Home_Page getOrange() {
		orange = new Home_Page(driver);

		return orange;
	}

}
