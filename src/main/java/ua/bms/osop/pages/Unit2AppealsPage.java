package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on - 2 - "The appeals on the pre-trial investigation"("Апеляційні скарги з питань ДР");
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * and the main methods with them
 */
public class Unit2AppealsPage extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2AppealsPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "The appeals on the pre-trial investigation"("Апеляційні скарги з питань ДР");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Апеляційні скарги з питань ДР')]")
	private WebElement titleAppealsUnit2;
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit2AppealsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleAppealsUnit2));
		return this;
	}
}
