package ua.bms.osop.applogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ua.bms.osop.pages.PageManager;

/*
 * Is implemented by all helpers
 * Associates Helpers with Page Manager, which initializes all Pages
 * Implements explicit waits
 */
public class DriverBasedHelper {
	
	protected WebDriver driver;
	//protected Wait<WebDriver> wait;
	protected PageManager pages;
	  
	public DriverBasedHelper(WebDriver driver) {
		this.driver = driver;
		//wait= new WebDriverWait(driver, 1);
		pages = new PageManager(driver);
	}
	

}
