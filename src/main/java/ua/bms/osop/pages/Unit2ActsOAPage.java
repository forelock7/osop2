package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 5 - "Acts of supervision over Operational Activities"("Акти нагляду за ОРД");
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * and the main methods with them
 */
public class Unit2ActsOAPage extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2ActsOAPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Acts of supervision over Operational Activities"("Акти нагляду за ОРД");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Акти нагляду за ОРД')]")
	private WebElement titleActsOAUnit2;
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit2ActsOAPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleActsOAUnit2));
		return this;
	}
}
