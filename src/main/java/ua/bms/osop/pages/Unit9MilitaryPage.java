package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.bms.osop.model.Unit9CardModel;

/*
 * Declare all Web-elements on Military Administrative Offenses Page - Unit 9("Військові адмінправопорушення")
 * and the main methods with them
 */
public class Unit9MilitaryPage extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit9MilitaryPage(PageManager pages) {
		super(pages);
	}
		
/*-------------------The Web-Elements of Military Page----------------------------------------------------*/

	//Title "Military Administrative Offenses" ("Військові адмінправопорушення")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Військові адмінправопорушення')]")
	private WebElement titleUnit9;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//table[1]//td[12]/div")
	private WebElement buttonEdit;
	
	//Button "Delete"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//table[1]//td[13]/div/img")
	private WebElement buttonRemove;
		
	//Button "Recover" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//div[contains(@id, 'crimeGridDeleted')]//table[1]//td[12]/div/img")
	private WebElement buttonRestore;
	

	/*------------------Methods of Military Page-------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit9MilitaryPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit9));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCardUnit9() {
		fluientWaitforElement(buttonEdit).click();
	}
	
	//Removing Card with getinging registration number of the card that will be removed
	public void removeCardUnit9(Unit9CardModel unit9CardModel){
		buttonRemove.click();
		unit9CardModel.regNumberRemovedCard = super.confirmationOfRemoving();
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardUnit9(Unit9CardModel unit9CardModel) {
		buttonRestore.click();
		unit9CardModel.regNumberRestoredCard = confirmRestoring();
	}
	


}
	

