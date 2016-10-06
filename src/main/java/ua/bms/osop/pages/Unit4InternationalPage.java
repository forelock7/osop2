package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit4CardModel;

/*
 * Declare all Web-elements on "International Judicial Cooperation" Page - Unit 4 ("Міжнародно-правове співробітництво")
 * and the main methods with them
 */
public class Unit4InternationalPage extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit4InternationalPage(PageManager pages) {
		super(pages);
	}
		
	/*-------------------The Web-Elements of International Page----------------------------------------------------*/

	//Title "International Judicial Cooperation" ("Міжнародно-правове співробітництво")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Міжнародно-правове співробітництво')]")
	private WebElement titleUnit4;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//table[1]//td[13]/div/img")
	WebElement buttonEdit;
		
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-14).
	@FindBy(xpath = "//table[1]//td[14]/div/img")
	private WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestGridDeleted')]//table[1]//td[13]/div/img")
	private WebElement buttonRestore;
	

	/*------------------Methods of International Page-------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit4InternationalPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit4));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCard() {
		fluientWaitforElement(buttonEdit).click();
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGrid(Unit4CardModel unit4CardModel){
		buttonRemove.click();
		unit4CardModel.setRegNumberRemovedCard(super.confirmationOfRemoving());
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGrid(Unit4CardModel unit4CardModel) {
		buttonRestore.click();
		unit4CardModel.setRegNumberRestoredCard(confirmRestoring());
	}
	

}
