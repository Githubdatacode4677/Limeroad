package com.Testng_pro;

import org.openqa.selenium.support.PageFactory;

public class GoIbibo_pom extends  GoIbibo_BaseClass {
		
	public GoIbibo_pom() {
			PageFactory.initElements(driver, this);;
		}

		private GoIbibo_Page flight;

		public GoIbibo_Page getFligt() {
			flight = new GoIbibo_Page(driver);

			return flight;
		}

}
