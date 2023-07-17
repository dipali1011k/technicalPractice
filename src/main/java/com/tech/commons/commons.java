package com.tech.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tech.constants.constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commons {
	/**
	 * this method will open the required browser
	 * @param browserName
	 */
public static void openBrowser(String browserName) {
	switch(browserName) {
	case "chrome":{
		WebDriverManager.chromedriver().setup();
		constants.driver=new ChromeDriver();
		break;
		
	}
	case"firefox":{
		WebDriverManager.firefoxdriver().setup();
		constants.driver=new FirefoxDriver();
		break;}
		default:System.out.println("invalid browsername");
	}	
	}
	public static void maximizeWindow()
	{
		constants.driver.manage().window().maximize();
	}
	public static void launchURL(String url)
	{
		constants.driver.get(url);
	}
	public static void closeBrowser()
{
		constants.driver.close();
		}
	public static void closeAllBrowser()
	{
		constants.driver.quit();
	}
	public static void enterText(String locatorType,String locatorValue,String textToEnter)
	{
		/*switch(locatorType)
	
		{
	case "id":
	constants.driver.findElement(By.id(locatorValue)).sendKeys(textToEnter);
	break;

	case "name":
	constants.driver.findElement(By.name(locatorValue)).sendKeys(textToEnter);
break;
	
	case "className":
constants.driver.findElement(By.className(locatorValue)).sendKeys(textToEnter);
break;
	case "tagName":
constants.driver.findElement(By.tagName(locatorValue)).sendKeys(textToEnter);
break;
	case "xpath":
constants.driver.findElement(By.xpath(locatorValue)).sendKeys(textToEnter);
break;
	case "cssSelector":
constants.driver.findElement(By.cssSelector(locatorValue)).sendKeys(textToEnter);
break;
	case "linkText":
constants.driver.findElement(By.linkText(locatorValue)).sendKeys(textToEnter);
break;
	case "partiallinktext":
constants.driver.findElement(By.partialLinkText(locatorValue)).sendKeys(textToEnter);
break;
default:System.out.println("invalid locator");*/
		getWebElement(locatorType, locatorValue).sendKeys(textToEnter);

	}
	
	
	public static WebElement getWebElement(String locatorType,String locatorValue)
	{
		WebElement ele=null;
		switch(locatorType)
		{
	case "id":
	ele=constants.driver.findElement(By.id(locatorValue));
	break;
	case "name":
	ele=constants.driver.findElement(By.name(locatorValue));
    break;
	case "className":
    ele=constants.driver.findElement(By.className(locatorValue));
    break;
	case "tagName":
    ele=constants.driver.findElement(By.tagName(locatorValue));
    break;
	case "xpath":
    ele=constants.driver.findElement(By.xpath(locatorValue));
    break;
	case "cssSelector":
    ele=constants.driver.findElement(By.cssSelector(locatorValue));
    break;
	case "linkText":
    ele=constants.driver.findElement(By.linkText(locatorValue));
    break;
	case "partiallinktext":
    ele=constants.driver.findElement(By.partialLinkText(locatorValue));
    break;
    default:System.out.println("invalid locator");
	}
	return ele;
	}

}
