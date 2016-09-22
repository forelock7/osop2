package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 3 - "The Preventive Action"("Запобіжні заходи");
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * and the main methods with them
 */
public class Unit2PreventivePage extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2PreventivePage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Claims Page----------------------------------------------------*/

	//Title of "The Preventive Action"("Запобіжні заходи");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Запобіжні заходи')]")
	private WebElement titlePreventiveUnit2;
	/*-------------------Methods of Claims Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit2PreventivePage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titlePreventiveUnit2));
		return this;
	}
}
