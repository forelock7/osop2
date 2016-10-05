package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit5DocumentCardModel;

/*
 * Declare all Web-elements on Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - "List of Response Documents"("Перелік документів реагування");
 * and the main methods with them
 */
public class Unit5DocumentPage  extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit5DocumentPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of "Response Document" Page----------------------------------------------------*/

	//Title "List of Response Documents"("Перелік документів реагування");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перелік документів реагування')]")
	private WebElement titleUnit5Documents;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-16).
	@FindBy(xpath = "//div[contains(@id, 'unit5-actGridDeleted')]//table[1]//td[16]/div/img")
	private WebElement buttonRestore;
	
	/*-------------------------The Methods of the "Response Document" Page --------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit5DocumentPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5Documents));
		return this;
	}
	
	public void restoreCardFromGrid(Unit5DocumentCardModel unit5DocumentCardModel) {
		buttonRestore.click();
		unit5DocumentCardModel.setRegNumberRestoredCard(confirmRestoring());
	}

}
