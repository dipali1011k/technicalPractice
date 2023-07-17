package com.tech.test.loginTest;

import org.testng.annotations.DataProvider;

public class loginDataProvider {
	@DataProvider(name="loginDataProvider")
public static Object[][] dataProvider() {
	Object values[][]= {{"abc","123"},{"efg","456"},{"ghb","765"},{"oik","098"}};
	return values;
}
}
