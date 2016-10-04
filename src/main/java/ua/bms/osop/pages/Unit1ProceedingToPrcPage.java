package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on 2 - "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури");
 * Unit 1 "Presentetion" ("Представництво")
 * and the main methods with them
 */
public class Unit1ProceedingToPrcPage extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit1ProceedingToPrcPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Review To Procuracy Page-------------------------------------------------------*/

	//Title of "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'НП за позовом до органів прокуратури')]")
	private WebElement titleReviewToPrcUnit1;

	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-9).
	@FindBy(xpath = "//table[1]//td[9]/div/img")
	WebElement buttonEdit;

	//Registration Number in the first record of grid on Main tab
	@FindBy(xpath = "//div[contains(@id, 'tableview')]/div[1]//table[1]//td[2]/div")
	private WebElement cellRegNumberInGridOnMainTab;

	
	/*------------------Methods of the Review To Procuracy Page-------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit1ProceedingToPrcPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleReviewToPrcUnit1));
		return this;
	}

	//Opens to review Card
	@Override
	public void doubleClickOnFirstRecordInGridOnMainTab() {
		Actions action = new Actions(driver);
		action.doubleClick(fluientWaitforElement(cellRegNumberInGridOnMainTab)).perform();
	}

	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEdit() {
		fluientWaitforElement(buttonEdit).click();
	}

	
}
