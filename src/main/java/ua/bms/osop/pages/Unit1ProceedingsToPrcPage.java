package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 2 - "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури");
 * Unit 1 "Presentetion" ("Представництво")
 * and the main methods with them
 */
public class Unit1ProceedingsToPrcPage extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit1ProceedingsToPrcPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Review To Procuracy Page-------------------------------------------------------*/

	//Title of "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'НП за позовом до органів прокуратури')]")
	private WebElement titleReviewToPrcUnit1;
	/*------------------The Web-Elements of the Review To Procuracy Card----------------------------------------------------*/
	
	/*------------------Methods of the Review To Procuracy Page-------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit1ProceedingsToPrcPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleReviewToPrcUnit1));
		return this;
	}
	/*------------------Methods of the Review To Procuracy Card-------------------------------------------------------------*/

}
