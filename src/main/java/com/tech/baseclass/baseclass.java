package com.tech.baseclass;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.tech.commons.commons;
import com.tech.utilities.propertyReading;

public class baseclass {
	@BeforeTest
	public static void setUp()
	{
		commons.openBrowser("chrome");
		commons.maximizeWindow();
	//	commons.launchURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		commons.launchURL(propertyReading.getValue("appurl","resources/application.properties"));
	}
	/*@AfterTest
	public static void tearDown()
	{
		commons.closeBrowser();
	}*/

}
