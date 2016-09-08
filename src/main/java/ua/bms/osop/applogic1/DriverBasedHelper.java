package ua.bms.osop.applogic1;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import ua.bms.osop.pages.PageManager;

public class DriverBasedHelper {
	
	protected WebDriver driver;
	protected Wait<WebDriver> wait;
	//protected WebDriverWait wait;
	protected PageManager pages;
	  
	public DriverBasedHelper(WebDriver driver) {
		this.driver = driver;
		//
		wait= new WebDriverWait(driver, 2).ignoring(StaleElementReferenceException.class);
		//wait = new WebDriverWait(driver, 10, 2000);
		pages = new PageManager(driver);
	}

}
