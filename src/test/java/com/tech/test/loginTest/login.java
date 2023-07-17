package com.tech.test.loginTest;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.tech.commons.commons;
import com.tech.constants.constants;
import com.tech.utilities.propertyReading;

public class login {
	@Test(dataProvider="loginDataProvider",dataProviderClass=loginDataProvider.class)
		public static void tech001(String uname,String pword) throws InterruptedException
	{
		//constants.driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//constants.driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(" admin123");
		//commons.enterText("xpath", "//input[@placeholder='Username']", "Admin");
	//commons.enterText("xpath","//input[@placeholder='Password']","admin123");
		//commons.getWebElement("xpath","//input[@placeholder='Username']").sendKeys("admin");
		commons.enterText(propertyReading.getValues("emailfield")[0],propertyReading.getValues("emailfield")[1],uname);
		commons.enterText(propertyReading.getValues("passfield")[0],propertyReading.getValues("passfield")[1],pword);
		
	
	}
}
