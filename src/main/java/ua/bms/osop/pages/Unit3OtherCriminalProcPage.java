package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 2 - "Other criminal proceedings"("Інші кримінальні провадження");
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * and the main methods with them
 */
public class Unit3OtherCriminalProcPage extends AnyPage {


	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit3OtherCriminalProcPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Other criminal proceedings"("Інші кримінальні провадження");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Інші питання кримінального провадження')]")
	private WebElement titleOtherCriminalProcUnit3;
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit3OtherCriminalProcPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleOtherCriminalProcUnit3));
		return this;
	}
}
