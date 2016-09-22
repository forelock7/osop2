package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 6 - "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * and the main methods with them
 */
public class Unit2CovertPage extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2CovertPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Негласні слідчі (розшукові) дії')]")
	private WebElement titleCovertUnit2;
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit2CovertPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleCovertUnit2));
		return this;
	}
}
