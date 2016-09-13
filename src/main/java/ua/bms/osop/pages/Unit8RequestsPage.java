package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on Requests Page - Unit 8("Запити")
 * and the main methods with them
 */
public class Unit8RequestsPage extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit8RequestsPage(PageManager pages) {
		super(pages);
	}
	
	/*
	 * Determines loading of Page
	 */
	public Unit8RequestsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit8));
		return this;
	}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "Requests" ("Запити")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Запити')]")
	private WebElement titleUnit8;
	
	/*------------------The Web-Elements of the Card------------------------------------------------------*/
	
	/*------------------Methods---------------------------------------------------------------------------*/

}
