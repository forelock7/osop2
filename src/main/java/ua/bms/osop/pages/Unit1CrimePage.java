package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on "Started Crime Proceedings"("Розпочато кримінальних проваджень")
 * Unit 1 "Presentetion" ("Представництво")
 * and the main methods with them
 */
public class Unit1CrimePage extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit1CrimePage(PageManager pages) {
		super(pages);
	}

	/*------------------------The Web-Elements of Crime Page----------------------------------------------------*/

	//Title of "Started Crime Proceedings"("Розпочато кримінальних проваджень")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'кримінальних проваджень')]")
	private WebElement titleCrimeUnit1;
	/*----------------------The Web-Elements of the Crime Card--------------------------------------------------*/
	
	/*------------------------Methods of Crime Page-------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit1CrimePage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleCrimeUnit1));
		return this;
	}
	/*------------------------Methods of Crime Card-------------------------------------------------------------*/


}
