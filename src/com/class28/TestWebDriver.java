package com.class28;

public class TestWebDriver {

	public static void main(String[] args) {
		
		WebDriver obj=new ChromeDriver();
		
		obj.closeBrowser();
		obj.findElement();
		obj.maximizeWindow();
		obj.openBrowser();
		
		WebDriver obj1=new FirefoxDriver();
		
		obj.closeBrowser();
		obj.findElement();
		obj.maximizeWindow();
		obj.openBrowser();

	}

}
