package ua.bms.osop.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

 /* 
  * Abstract class representation of a Page in the UI. Page object pattern* @author Sebastiano Armeli-Battana 
  */
public abstract class Page {
	
	protected WebDriver driver;
	protected Wait<WebDriver> wait, wait1, wait2, waitFluent;
	protected PageManager pages;
		
	/*
	 * Constructor injecting the WebDriver interface * @param webDriver 
	 */
	public Page(PageManager pages) {
		this.pages = pages;
	    driver = pages.getWebDriver();
	    wait = new WebDriverWait(driver, 2, 200);
	    wait1 = new WebDriverWait(driver, 10);
		wait2 = new WebDriverWait(driver, 10).ignoring(InvalidSelectorException.class, StaleElementReferenceException.class);
		waitFluent = new FluentWait<WebDriver>(driver).withMessage("Elementwas not found").withTimeout(10, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS);
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
