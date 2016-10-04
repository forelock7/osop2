package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 5 - "Viewing of claims to Procuracy authorities"("Перегляд позовів до органів прокуратури")
 * Unit 1 "Presentetion" ("Представництво")
 * and the main methods with them
 */
public class Unit1ViewClaimToPrcPage extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit1ViewClaimToPrcPage(PageManager pages) {
		super(pages);
	}

	/*-------------------The Web-Elements of Claims To Procuracy Page----------------------------------------------------*/

	//Title of "Viewing of claims to Procuracy authorities"("Перегляд позовів до органів прокуратури")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'позовів до органів прокуратури')]")
	private WebElement titleClaimsToPrcUnit1;
	
	/*------------------Methods of Claims To Procuracy Page--------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit1ViewClaimToPrcPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleClaimsToPrcUnit1));
		return this;
	}
}
