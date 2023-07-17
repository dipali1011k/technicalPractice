package com.tech.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyReading {
public static String getValue(String key) {
	String value=null;
	String filePath="ObjectRepository/ObjectRepository.properties";
	try {
		FileInputStream fis=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(fis);
		value=prop.getProperty(key);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return value;	
}
public static String getValue(String key,String filepath)
{
	String value=null;
	try {
		FileInputStream fis=new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(fis);
		value=prop.getProperty(key);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return value;
	}
public static String[] getValues(String key)
{String values[]=null;
String filepath="ObjectRepository/ObjectRepository.properties";

try {
	FileInputStream fis=new FileInputStream(filepath);
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty(key);
	values=value.split("##");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

return values;
	}

}
