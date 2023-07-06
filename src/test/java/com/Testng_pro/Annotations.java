package com.Testng_pro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@Test
	public void chrome() {
		System.out.println("Login-Main");

	}

	@BeforeTest

	public void firefox() {
		System.out.println("firefox");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");

	}

}
