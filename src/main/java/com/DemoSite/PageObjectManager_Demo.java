package com.DemoSite;

public class PageObjectManager_Demo {

	private Model_Demo_Register mdg;

	private Model_Demo_Login mdl;

	public Model_Demo_Register getMdg() {
		mdg = new Model_Demo_Register();
		return mdg;
	}

	public Model_Demo_Login getMdl() {
		mdl = new Model_Demo_Login();
		return mdl;
	}

}
