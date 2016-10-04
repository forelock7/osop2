package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 3 - "List of Charged Person"("Перелік осіб, притягнутих до відповідальності").
 * and the main methods with them
 */
public class Unit5ChargedPage  extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit5ChargedPage(PageManager pages) {
		super(pages);
	}
		
	/*-------------------The Web-Elements of Charged Person Page----------------------------------------------------*/

	//Title "List of Charged Person"("Перелік осіб, притягнутих до відповідальності")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перелік осіб, притягнутих до відповідальності')]")
	private WebElement titleUnit5Charged;
	
	//Registration Number in the first record of grid on Main tab
	@FindBy(xpath = "//div[contains(@id, 'tableview')]/div[1]//table[1]//td[2]/div")
	private WebElement cellRegNumberInGridOnMainTab;
	
	//Name of Charged Person in the first record of grid on Main tab
	@FindBy(xpath = "//div[contains(@id, 'tableview')]/div[1]//table[1]//td[2]/div")
	private WebElement cellNameInGridOnMainTab;
	

	
	/*------------------Methods of Charged Person Page-------------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit5ChargedPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5Charged));
		return this;
	}
	
	//Opens to review Card
	@Override
	public void doubleClickOnFirstRecordInGridOnMainTab() {
		Actions action = new Actions(driver);
		action.doubleClick(fluientWaitforElement(cellNameInGridOnMainTab)).perform();
	}
	
	//Getting registration number from the first record in grid on Main tab
	@Override
	public String getRegNumberFromGridOnMainTab(){
		return fluientWaitforElement(cellRegNumberInGridOnMainTab).getText();
	}
	
	public String getChargedNameFirstCardInGrid() {
		return fluientWaitforElement(cellNameInGridOnMainTab).getText();
	}

}
