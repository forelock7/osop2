package ua.bms.osop.pages;

import java.lang.reflect.Field;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;

/*
 * Class extends AjaxElementLocator with adding condition: Element is Displayed
 */
public class DisplayedElementLocator extends AjaxElementLocator {
	
	public DisplayedElementLocator(WebDriver driver, Field field, int timeOutInSeconds) {
		super(driver, field, timeOutInSeconds);
	}
	  
	/*
	 * Extension: Web-element is found if it is visible(displayed)
	 */
	protected boolean isElementUsable(WebElement element) {
	    return element.isDisplayed();
	}

}
