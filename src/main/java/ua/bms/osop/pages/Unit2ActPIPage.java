package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit2ActPICardModel;


/*
 * Declare all Web-elements on 1 - "Acts of supervision over pre-trial investigation"("Акти нагляду за ДР");
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * and the main methods with them
 */
public class Unit2ActPIPage extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2ActPIPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Acts of supervision over pre-trial investigation"("Акти нагляду за ДР")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Акти нагляду за ДР')]")
	private WebElement titleActsPIUnit2;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-9).
	@FindBy(xpath = "//table[1]//td[9]/div/img")
	WebElement buttonEdit;
		
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-10).
	@FindBy(xpath = "//table[1]//td[10]/div/img")
	private WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-9).
	@FindBy(xpath = "//div[contains(@id, 'unit23-actDRGridDeleted')]//table[1]//td[9]/div/img")
	private WebElement buttonRestore;
	
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit2ActPIPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleActsPIUnit2));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCard() {
		fluientWaitforElement(buttonEdit).click();
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGrid(Unit2ActPICardModel unit2ActPICardModel){
		buttonRemove.click();
		unit2ActPICardModel.setRegNumberRemovedCard(this.confirmationOfRemoving());
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGrid(Unit2ActPICardModel unit2ActPICardModel) {
		buttonRestore.click();
		unit2ActPICardModel.setRegNumberRestoredCard(this.confirmRestoring());
	}
}
