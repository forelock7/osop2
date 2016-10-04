package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.bms.osop.model.Unit7CardModel;

/*
 * Declare all Web-elements on Mass Media Page - Unit 7("ЗМІ")
 * and the main methods with them
 */
public class Unit7MassMediaPage extends AnyPage{
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit7MassMediaPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Mass Media Page----------------------------------------------------*/

	//Title "Mass Media" ("ЗМІ")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'ЗМІ')]")
	private WebElement titleUnit7;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-9).
	@FindBy(xpath = "//table[1]//td[9]/div")
	private WebElement buttonEdit;
	
	//Button "Delete"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-10).
	@FindBy(xpath = "//table[1]//td[10]/div")
	private WebElement buttonDelete;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-9).
	@FindBy(xpath = "//div[contains(@id, 'mediaGridDeleted')]//table[1]//td[9]/div/img")
	private WebElement buttonRestore;
	
	
	/*------------------Methods of Mass Media Page------------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit7MassMediaPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit7));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCardUnit7() {
		buttonEdit.click();
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGridUnit7(Unit7CardModel unit7CardModel){
		buttonDelete.click();
		unit7CardModel.regNumberRemovedCard = super.confirmationOfRemoving();
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGridUnit7(Unit7CardModel unit7CardModel) {
		buttonRestore.click();
		unit7CardModel.regNumberRestoredCard = confirmRestoring();
	}
	



}
