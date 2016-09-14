package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit8Card;

/*
 * Declare all Web-elements on Requests Page - Unit 8("Запити")
 * and the main methods with them
 */
public class Unit8RequestsPage extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit8RequestsPage(PageManager pages) {
		super(pages);
	}
	
	/*
	 * Determines loading of Page
	 */
	public Unit8RequestsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit8));
		return this;
	}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

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
	
	/*------------------The Web-Elements of the Card------------------------------------------------------*/
	
	//Input field "Number of Request" ("№ запиту")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//label[contains(., '№ запиту:')]/following-sibling::div//input")
	private WebElement inputRequestNumber;
	
	//Input field "Requesters of Information" ("Запитувачі інформації")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//span[contains(., 'Запитувачі інформації:')]")
	private WebElement inputRequesters;
	//First item of Requesters of Information - Individuals
	@FindBy (xpath = "//div[contains(@id, 'treepanel')]//span[contains(., 'Фізичні особи')]")/*table[1]*/
	private WebElement itemRequester;
	
	//Input field "Request received" ("Запит отримано")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//span[contains(., 'Запит отримано:')]")
	private WebElement inputRequestReceived;
	//First item of "Request received" - writing
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[1]") 
	private WebElement itemRequestReceived;
	
	//Input field "Receipt Date" ("Дата надходження")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//label[contains(., 'Дата надходження:')]/following-sibling::div//input")
	private WebElement inputReceiptDate;
	
	//Input field "Specificity of Request" ("Характер запиту")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//span[text() = 'Характер запиту:']")
	private WebElement inputRequestSpecificity;
	//First item of "Specificity of Request"
	@FindBy (xpath = "//div[contains(@id, 'treepanel')]//span[contains(., 'З питань досудового розслідування')]") 
	private WebElement itemRequestSpecificity;
	
	//Input field "Summary" ("Стислий зміст")
	@FindBy(xpath = "//div[contains(@id, 'unit68-claimTabMain')]//textarea")
	private WebElement inputSummary;
	
	/*------------------Methods---------------------------------------------------------------------------*/

	//Setting the new card with filling all fields in
	public Unit8RequestsPage setCardUnit8(Unit8Card unit8Card){
		type(inputRequestNumber, unit8Card.requestNumber);
		inputRequesters.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'treepanel')]//span[contains(., 'Фізичні особи')]"))).click();
		inputRequestReceived.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[1]"))).click();
		type(inputReceiptDate, unit8Card.receiptDate);
		inputRequestSpecificity.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'treepanel')]//span[contains(., 'З питань досудового розслідування')]"))).click();
		type(inputSummary, unit8Card.summary);
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCardUnit8() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonEdit)).click();
	}
	
	//Getting value from input-field "Request Number" in formerly created card
	public String getInputRequestNumberUnit8() {
		return inputRequestNumber.getAttribute("value");
	}
	
	//Editing SOME field ("Summary" ("Стислий зміст"))
	public void setInputSummaryUnit8(String someText){
		type(inputSummary, someText);
	}
	
	//Getting existing value from input-field ("Summary" ("Стислий зміст"))
	public String getInputSummaryUnit8() {
		return inputSummary.getAttribute("value");
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGridUnit8(Unit8Card unit8Card){
		buttonDelete.click();
		unit8Card.regNumberRemovedCard = super.confirmationOfRemoving();
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGridUnit8(Unit8Card unit8Card) {
		buttonRestore.click();
		unit8Card.regNumberRestoredCard = confirmRestoring();
	}
	
}
