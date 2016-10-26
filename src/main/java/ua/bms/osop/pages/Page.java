package ua.bms.osop.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	}
	
	public WebElement fluientWaitforElement(WebElement element) {
	    FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
	        .pollingEvery(1, TimeUnit.SECONDS)
	        .ignoring(NoSuchElementException.class, TimeoutException.class).ignoring(StaleElementReferenceException.class);
	    for (int i = 0; i < 3; i++) {
	        try {
				//fWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='reportmanager-wrapper']/div[1]/div[2]/ul/li/span[3]/i[@data-original--title='We are processing through trillions of data events, this insight may take more than 15 minutes to complete.']")));
	        	fWait.until(ExpectedConditions.visibilityOf(element));
	        	fWait.until(ExpectedConditions.elementToBeClickable(element));
	        	} catch (Exception e) {
				System.out.println("Element Not found trying again - " + element.toString().substring(70));
	        	e.printStackTrace();
				}
			}
	    return element;
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
