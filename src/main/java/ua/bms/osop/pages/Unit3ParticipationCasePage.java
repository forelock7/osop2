package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 6 - "Participation in the trial cases and other CC"("Участь у судовому розгляді справ та інших КС");
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * and the main methods with them
 */
public class Unit3ParticipationCasePage extends AnyPage {


	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit3ParticipationCasePage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Participation in the trial cases and other CC"("Участь у судовому розгляді справ та інших КС");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Участь у судовому розгляді справ та інших питань КС')]")
	private WebElement titleParticipationCasesUnit3;
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit3ParticipationCasePage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleParticipationCasesUnit3));
		return this;
	}
}
