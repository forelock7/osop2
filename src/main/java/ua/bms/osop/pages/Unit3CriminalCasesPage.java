package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 4 - "Criminal cases"("Кримінальні справи");
 *Unit 3: "Public prosecution"("Держобвинувачення");
 * and the main methods with them
 */
public class Unit3CriminalCasesPage extends AnyPage {


	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit3CriminalCasesPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Criminal cases"("Кримінальні справи");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Кримінальні справи')]")
	private WebElement titleCriminalCasesUnit3;
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit3CriminalCasesPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleCriminalCasesUnit3));
		return this;
	}
}
