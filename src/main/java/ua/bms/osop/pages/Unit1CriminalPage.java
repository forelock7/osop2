package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit1CriminalCardModel;

/*
 * Declare all Web-elements on "Started Crime Proceedings"("Розпочато кримінальних проваджень")
 * Unit 1 "Presentetion" ("Представництво")
 * and the main methods with them
 */
public class Unit1CriminalPage extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit1CriminalPage(PageManager pages) {
		super(pages);
	}

	/*------------------------The Web-Elements of Crime Page----------------------------------------------------*/

	//Title of "Started Crime Proceedings"("Розпочато кримінальних проваджень")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'кримінальних проваджень')]")
	private WebElement titleCrimeUnit1;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-9).
	@FindBy(xpath = "//table[1]//td[9]/div/img")
	WebElement buttonEdit;
		
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-10).
	@FindBy(xpath = "//table[1]//td[10]/div/img")
	private WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-9).
	@FindBy(xpath = "//div[contains(@id, 'unit1-crimeGridDeleted')]//table[1]//td[9]/div/img")
	private WebElement buttonRestore;
	
	/*------------------------Methods of Crime Page-------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit1CriminalPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleCrimeUnit1));
		return this;
	}
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCard() {
		fluientWaitforElement(buttonEdit).click();
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGrid(Unit1CriminalCardModel unit1CriminalCardModel){
		buttonRemove.click();
		unit1CriminalCardModel.setRegNumberRemovedCard(super.confirmationOfRemoving());
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGrid(Unit1CriminalCardModel unit1CriminalCardModel) {
		buttonRestore.click();
		unit1CriminalCardModel.setRegNumberRestoredCard(confirmRestoring());
	}
	/*------------------------Methods of Crime Card-------------------------------------------------------------*/


}
