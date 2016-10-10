package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit2CovertCardModel;

/*
 * Declare all Web-elements on 6 - "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * and the main methods with them
 */
public class Unit2CovertPage extends AnyPage  {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2CovertPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Page----------------------------------------------------*/

	//Title of "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Негласні слідчі (розшукові) дії')]")
	private WebElement titleCovertUnit2;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-11).
	@FindBy(xpath = "//table[1]//td[11]/div/img")
	WebElement buttonEdit;
		
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//table[1]//td[12]/div/img")
	private WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-11).
	@FindBy(xpath = "//div[contains(@id, 'unit23-actNSRDGridDeleted')]//table[1]//td[11]/div/img")
	private WebElement buttonRestore;
	
	
	/*-------------------Methods of Page-------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit2CovertPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleCovertUnit2));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCard() {
		fluientWaitforElement(buttonEdit).click();
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGrid(Unit2CovertCardModel unit2CovertCardModel){
		buttonRemove.click();
		unit2CovertCardModel.setRegistrationNumber(this.confirmationOfRemoving());
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGrid(Unit2CovertCardModel unit2CovertCardModel) {
		buttonRestore.click();
		unit2CovertCardModel.setRegistrationNumber(this.confirmRestoring());
	}
	
}
