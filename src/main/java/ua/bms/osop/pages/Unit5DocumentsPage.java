package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - "List of Response Documents"("Перелік документів реагування");
 * and the main methods with them
 */
public class Unit5DocumentsPage  extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit5DocumentsPage(PageManager pages) {
		super(pages);
	}
	
	/*
	 * Determines loading of Page
	 */
	public Unit5DocumentsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5Documents));
		return this;
	}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "List of Response Documents"("Перелік документів реагування");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перелік документів реагування')]")
	private WebElement titleUnit5Documents;
	
	/*------------------The Web-Elements of the Card------------------------------------------------------*/
	
	/*------------------Methods---------------------------------------------------------------------------*/

}
