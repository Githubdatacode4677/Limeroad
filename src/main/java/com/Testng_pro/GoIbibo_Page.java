package com.Testng_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoIbibo_Page extends GoIbibo_BaseClass {
	
	public GoIbibo_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		
		@FindBy (xpath = "(//span[text() = '12PM - 6PM'])[1]")
		private WebElement depatureTime;
		
		@FindBy (xpath = "(//span[text() = '6AM - 12PM'])[2]")
		private WebElement returnTime;
		
		@FindBy (xpath = "(//label[@class='lh1-5'])[1]")
		private WebElement minlist1;
		
		@FindBy (xpath = "(//label[@class='lh1-5'])[7]")
		private WebElement minlist2;
		
		@FindBy(xpath = "//input[@value='Book']")
		private WebElement book;

		public WebElement getDepatureTime() {
			return depatureTime;
		}

		public WebElement getReturnTime() {
			return returnTime;
		}

		public WebElement getMinlist1() {
			return minlist1;
		}

		public WebElement getMinlist2() {
			return minlist2;
		}

		public WebElement getBook() {
			return book;
		}
		
		

}

