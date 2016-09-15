package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 3 - "List of Charged Person"("Перелік осіб, притягнутих до відповідальності").
 * and the main methods with them
 */
public class Unit5ChargedPage  extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit5ChargedPage(PageManager pages) {
		super(pages);
	}
	
	/*
	 * Determines loading of Page
	 */
	public Unit5ChargedPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5Charged));
		return this;
	}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "List of Charged Person"("Перелік осіб, притягнутих до відповідальності")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перелік осіб, притягнутих до відповідальності')]")
	private WebElement titleUnit5Charged;
	
	/*------------------The Web-Elements of the Card------------------------------------------------------*/
	
	/*------------------Methods---------------------------------------------------------------------------*/

}
