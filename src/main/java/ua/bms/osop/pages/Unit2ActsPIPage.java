package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 1 - "Acts of supervision over pre-trial investigation"("Акти нагляду за ДР");
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * and the main methods with them
 */
public class Unit2ActsPIPage extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2ActsPIPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Acts of supervision over pre-trial investigation"("Акти нагляду за ДР")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Акти нагляду за ДР')]")
	private WebElement titleActsPIUnit2;
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit2ActsPIPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleActsPIUnit2));
		return this;
	}
}
