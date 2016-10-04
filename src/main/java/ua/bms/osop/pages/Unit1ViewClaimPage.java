package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 4 - "Viewing of claims, statements"("Перегляд позовів, заяв")
 * Unit 1 "Presentetion" ("Представництво")
 * and the main methods with them
 */
public class Unit1ViewClaimPage extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit1ViewClaimPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Claims Page----------------------------------------------------*/

	//Title of "Viewing of claims, statements"("Перегляд позовів, заяв")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перегляд позовів, заяв')]")
	private WebElement titleClaimsUnit1;
	/*-------------------Methods of Claims Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit1ViewClaimPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleClaimsUnit1));
		return this;
	}
}
