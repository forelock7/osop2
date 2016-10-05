package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit5InspectionCardModel;

/*
 * Declare all Web-elements on Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 1 - "List Inspections"("Перелік перевірок");
 * and the main methods with them
 */
public class Unit5InspectionPage extends AnyPage {
		
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit5InspectionPage(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Inspection Page----------------------------------------------------*/

	//Title "List Inspections"("Перелік перевірок")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Перелік перевірок')]")
	private WebElement titleUnit5InspectionPage;

	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//table[1]//td[13]/div/img")
	WebElement buttonEdit;
	
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-14).
	@FindBy(xpath = "//table[1]//td[14]/div/img")
	WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//div[contains(@id, 'unit5-inspectionGridDeleted')]//table[1]//td[13]/div/img")
	private WebElement buttonRestore;
	

	
	/*------------------Methods of Inspection Page---------------------------------------------------------------------------*/
		
	/* Determines loading of Page */
	public Unit5InspectionPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5InspectionPage));
		return this;
	}

	public void clickButtonEditInspectionCardUnit5() {
		fluientWaitforElement(buttonEdit).click();
	}
	
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeInspectionCardFromGridUnit5(Unit5InspectionCardModel unit5InspectionCardModel) {
		fluientWaitforElement(buttonRemove).click();
		unit5InspectionCardModel.setRegNumberRemovedCard(this.confirmationOfRemoving());
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGridUnit5(Unit5InspectionCardModel unit5InspectionCardModel) {
		buttonRestore.click();
		unit5InspectionCardModel.setRegNumberRestoredCard(confirmRestoring());
	}
	

}
