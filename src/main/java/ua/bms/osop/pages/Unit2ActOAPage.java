package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit2ActOACardModel;

/*
 * Declare all Web-elements on 5 - "Acts of supervision over Operational Activities"("Акти нагляду за ОРД");
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * and the main methods with them
 */
public class Unit2ActOAPage extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2ActOAPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Acts of supervision over Operational Activities"("Акти нагляду за ОРД");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Акти нагляду за ОРД')]")
	private WebElement titleActsOAUnit2;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-8).
	@FindBy(xpath = "//table[1]//td[8]/div/img")
	WebElement buttonEdit;
		
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-9).
	@FindBy(xpath = "//table[1]//td[9]/div/img")
	private WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-8).
	@FindBy(xpath = "//div[contains(@id, 'unit23-actORDGridDeleted')]//table[1]//td[8]/div/img")
	private WebElement buttonRestore;
	
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit2ActOAPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleActsOAUnit2));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCard() {
		fluientWaitforElement(buttonEdit).click();
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGrid(Unit2ActOACardModel unit2ActOACardModel){
		buttonRemove.click();
		unit2ActOACardModel.setRegistrationNumber(this.confirmationOfRemoving());
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGrid(Unit2ActOACardModel unit2ActOACardModel) {
		buttonRestore.click();
		unit2ActOACardModel.setRegistrationNumber(this.confirmRestoring());
	}
}
