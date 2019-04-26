package com.class28;

/*
 * Create a WebDriver Interface that will have the following unimplemented behaviour:
 *  openBrowser(), closeBrowser(), maximizeWindow(), findElement().
 *   Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();

}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("it can open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("it can close browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("it can maximize window");
		
	}

	@Override
	public void findElement() {
	System.out.println("it can find element");
		
	}
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("it can open chrome Firefox driver");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("it can close browser");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("it can maximize window");
		
	}

	@Override
	public void findElement() {
	System.out.println("it can find element");
		
	}
	
}

