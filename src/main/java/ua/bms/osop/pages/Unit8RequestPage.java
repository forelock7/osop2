package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit8CardModel;

/*
 * Declare all Web-elements on Requests Page - Unit 8("Запити")
 * and the main methods with them
 */
public class Unit8RequestPage extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit8RequestPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Request Page----------------------------------------------------*/

	//Title "Requests" ("Запити")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Запити')]")
	private WebElement titleUnit8;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-11).
	@FindBy(xpath = "//table[1]//td[11]/div")
	private WebElement buttonEdit;
	
	//Button "Delete"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//table[1]//td[12]/div")
	private WebElement buttonDelete;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-11).
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimGridDeleted')]//table[1]//td[11]/div/img")
	private WebElement buttonRestore;
	

	
	/*------------------Methods of Request Page---------------------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit8RequestPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit8));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCardUnit8() {
		fluientWaitforElement(buttonEdit).click();
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGridUnit8(Unit8CardModel unit8CardModel){
		buttonDelete.click();
		unit8CardModel.regNumberRemovedCard = super.confirmationOfRemoving();
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGridUnit8(Unit8CardModel unit8CardModel) {
		buttonRestore.click();
		unit8CardModel.regNumberRestoredCard = confirmRestoring();
	}
	

	
	
}
