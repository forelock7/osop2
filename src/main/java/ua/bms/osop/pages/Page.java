package ua.bms.osop.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

 /* 
  * Abstract class representation of a Page in the UI. Page object pattern* @author Sebastiano Armeli-Battana 
  */
public abstract class Page {
	
	protected WebDriver driver;
	protected Wait<WebDriver> wait;
	protected PageManager pages;
		
	/*
	 * Constructor injecting the WebDriver interface * @param webDriver 
	 */
	public Page(PageManager pages) {
		this.pages = pages;
	    driver = pages.getWebDriver();
	    wait= new WebDriverWait(driver, 5);
	}
	
	
	public WebDriver getWebDriver() {
		return driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	

	//Waits launching of Page and returns Page
	public Page ensurePageLoaded() {		
		return this;
	}

	//Waits launching of Page and returns boolean type
	public boolean waitPageLoaded() {
		try {
			ensurePageLoaded();
			return true;
		} catch (TimeoutException to) {
			return false;
		}
	}


}
