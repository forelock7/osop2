package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 3 - "Participation in the trial proceedings and other CP"("Участь у судовому розгляді проваджень та інших КП");
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * and the main methods with them
 */
public class Unit3ParticipationProcPage extends AnyPage {


	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit3ParticipationProcPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Participation in the trial proceedings and other CP"("Участь у судовому розгляді проваджень та інших КП");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Участь у судовому розгляді проваджень та інших питань КП')]")
	private WebElement titleParticipationProcUnit3;
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit3ParticipationProcPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleParticipationProcUnit3));
		return this;
	}
}
