package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 1 - "Review proceedings on a claim"("НП за позовом");
 * Unit 1 "Presentetion" ("Представництво")
 * and the main methods with them
 */
public class Unit1ReviewPage extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit1ReviewPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of the Review Page---------------------------------------------------*/

	//Title of "Review proceedings on a claim"("НП за позовом")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'НП за позовом')]")
	private WebElement titleReviewUnit1;
	/*------------------The Web-Elements of the Review Card----------------------------------------------------*/
	
	/*------------------Methods of the Review Page-------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit1ReviewPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleReviewUnit1));
		return this;
	}
	/*------------------Methods of the Review Card-------------------------------------------------------------*/
}
