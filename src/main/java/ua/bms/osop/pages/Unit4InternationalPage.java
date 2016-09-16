package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit4Card;

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
	
	/*
	 * Determines loading of Page
	 */
	public Unit4InternationalPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit4));
		return this;
	}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "International Judicial Cooperation" ("Міжнародно-правове співробітництво")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Міжнародно-правове співробітництво')]")
	private WebElement titleUnit4;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//table[1]//td[13]/div")
	WebElement buttonEdit;
		
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-14).
	@FindBy(xpath = "//table[1]//td[14]/div")
	private WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestGridDeleted')]//table[1]//td[13]/div/img")
	private WebElement buttonRestore;
	
	/*------------------The Web-Elements of the Card------------------------------------------------------*/
	
	//Input field "Number of Claim" ("№ звернення")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//label[contains(., '№ звернення:')]/following-sibling::div//input")
	private WebElement inputClaimNumber;
	
	//Input field "Receipt Date" ("Дата надходження")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//label[contains(., 'Дата надходження:')]/following-sibling::div//input")
	private WebElement inputReceiptDate;
	
	//Input field "Type of Claim" ("Вид звернення")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//span[contains(., 'Вид звернення:')]")
	private WebElement inputClaimType;
	//First item of Type of Claim
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[contains(., 'Звернення (запит) іноземних установ')]") 
	private WebElement itemClaimType;
		
	//Input field "Type of legal assistance" ("Вид правової допомоги")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//span[contains(., 'Вид правової допомоги:')]")
	private WebElement inputLegalAssistType;
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[contains(., 'Виконання процесуальних дій')]")
	private WebElement itemLegalAssistType;
	
	//Input field "Summary" ("Стислий зміст")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//label[contains(., 'Стислий зміст:')]/following-sibling::div//textarea")
	private WebElement inputSummary;
	
	//Input field "Country Claim" ("Країна звернення")
	@FindBy(xpath = "//div[contains(@id, 'unit4-requestTabMain')]//div[contains(@id, 'listcombo')]//a")
	private WebElement inputCountryClaim;
	@FindBy (xpath = "//div[contains(@id, 'listcombowindow')]//table[6]//td[3]//img")
	private WebElement itemCountryClaim;
		
	/*------------------Methods---------------------------------------------------------------------------*/
	
	//Sets the new card with filling all fields in
	public Unit4InternationalPage setCardUnit4(Unit4Card unit4Card){
		type(inputClaimNumber, unit4Card.claimNumber);
		type(inputReceiptDate, unit4Card.receiptDate);
		inputClaimType.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[contains(., 'Звернення (запит) іноземних установ')]"))).click();
		inputLegalAssistType.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[contains(., 'Виконання процесуальних дій')]"))).click();
		inputCountryClaim.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'listcombowindow')]//table[6]//td[3]//img"))).click();
		type(inputSummary, unit4Card.summary);
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCardUnit4() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonEdit)).click();
	}
	
	//Getting value from input-field "Claim Number" in formerly created card
	public String getInputClaimNumberUnit4() {
		return inputClaimNumber.getAttribute("value");
	}
	
	//Editing SOME field ("Summary" ("Стислий зміст"))
	public void setInputSummaryUnit4(String someText){
		type(inputSummary, someText);
	}
	
	//Getting existing value from input-field ("Summary" ("Стислий зміст"))
	public String getInputSummaryUnit4() {
		return inputSummary.getAttribute("value");
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGridUnit4(Unit4Card unit4Card){
		buttonRemove.click();
		unit4Card.regNumberRemovedCard = super.confirmationOfRemoving();
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGridUnit4(Unit4Card unit4Card) {
		buttonRestore.click();
		unit4Card.regNumberRestoredCard = confirmRestoring();
	}

}
