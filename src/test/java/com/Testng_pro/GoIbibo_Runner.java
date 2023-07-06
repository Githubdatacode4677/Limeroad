package com.Testng_pro;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoIbibo_Runner extends GoIbibo_BaseClass {
	
	
	GoIbibo_pom gpm = new GoIbibo_pom();
	
	@BeforeTest
	private void launchbrowser()  {
		
		browserLaunch("chrome");
		getUrl("https://www.goibibo.com/flights/air-MAA-TRV-20230710-20230720-2-1-0-B-D?");
		
	}
	
	@BeforeMethod
	private void flightTiming() throws Throwable  {
		
		clickElement(gpm.getFligt().getDepatureTime());
		clickElement(gpm.getFligt().getReturnTime());
		Thread.sleep(5000);
		
		scrollByValue(0,300);
		clickElement(gpm.getFligt().getMinlist1());
		clickElement(gpm.getFligt().getMinlist2());
		Thread.sleep(5000);

		clickElement(gpm.getFligt().getBook());
		
	}
	
	@Test
	private void validateTitle() {

		String currentTitle = getCurrentTitle();
		System.out.println(currentTitle);
	}

	
	

}
