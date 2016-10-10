package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit2PreventiveCardModel;

/*
 * Declare all Web-elements on 3 - "The Preventive Action"("Запобіжні заходи");
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * and the main methods with them
 */
public class Unit2PreventivePage extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2PreventivePage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements Preventive Page----------------------------------------------------*/

	//Title of "The Preventive Action"("Запобіжні заходи");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Запобіжні заходи')]")
	private WebElement titlePreventiveUnit2;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-11).
	@FindBy(xpath = "//table[1]//td[11]/div/img")
	WebElement buttonEdit;
		
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//table[1]//td[12]/div/img")
	private WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-11).
	@FindBy(xpath = "//div[contains(@id, 'unit23-preventiveActionGridDeleted')]//table[1]//td[11]/div/img")
	private WebElement buttonRestore;
	/*-------------------Methods of Preventive Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit2PreventivePage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titlePreventiveUnit2));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCard() {
		fluientWaitforElement(buttonEdit).click();
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGrid(Unit2PreventiveCardModel unit2PreventiveCardModel){
		buttonRemove.click();
		unit2PreventiveCardModel.setRegistrationNumber(this.confirmationOfRemoving());
		//unit2PreventiveCardModel.setRegNumberRemovedCard(this.confirmationOfRemoving());
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGrid(Unit2PreventiveCardModel unit2PreventiveCardModel) {
		buttonRestore.click();
		unit2PreventiveCardModel.setRegistrationNumber(this.confirmRestoring());
		//unit2PreventiveCardModel.setRegNumberRestoredCard(this.confirmRestoring());
	}
}
