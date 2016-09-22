package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 4 - "The release from custody"("Звільнення з-під варти");
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * and the main methods with them
 */
public class Unit2ReleasePage extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2ReleasePage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "The release from custody"("Звільнення з-під варти");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Звільнення з-під варти')]")
	private WebElement titleReleaseUnit2;
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit2ReleasePage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleReleaseUnit2));
		return this;
	}
}
