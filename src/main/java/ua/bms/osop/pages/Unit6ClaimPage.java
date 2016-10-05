package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit6CardModel;

/*
 * Declare all Web-elements on Claims Page - Unit 6("Звернення")
 * and the main methods with them
 */
public class Unit6ClaimPage extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit6ClaimPage(PageManager pages) {
		super(pages);
	}
		
	/*-------------------The Web-Elements of Claim Page----------------------------------------------------*/

	//Title "Claims" ("Звернення")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Звернення')]")
	private WebElement titleUnit6;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-14).
	@FindBy(xpath = "//table[1]//td[14]/div/img")
	private WebElement buttonEdit;
	
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-15).
	@FindBy(xpath = "//table[1]//td[15]/div/img")
	private WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-14).
	@FindBy(xpath = "//div[contains(@id, 'unit68-requestGridDeleted')]//table[1]//td[14]/div/img")
	private WebElement buttonRestore;
	

	/*------------------Methods of Claim Page---------------------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit6ClaimPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit6));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCardUnit6() {
		fluientWaitforElement(buttonEdit).click();
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGridUnit6(Unit6CardModel unit6CardModel){
		buttonRemove.click();
		unit6CardModel.setRegNumberRemovedCard(super.confirmationOfRemoving());
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGridUnit6(Unit6CardModel unit6CardModel) {
		buttonRestore.click();
		unit6CardModel.setRegNumberRestoredCard(confirmRestoring());
	}
	

	
}
