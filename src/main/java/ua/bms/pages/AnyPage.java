package ua.bms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AnyPage extends Page {
	
	public AnyPage(PageManager pages) {
		super(pages);
	}
		
/*---------------The similar web-elements that is available on all pages------------*/
	
	/*The main page of UNITs*/	
		
	//Button "Create" ("Створити")
	@FindBy(xpath = "//span[contains(., 'Створити')]")
	protected WebElement buttonCreateCard;
	
	//Tab "Removed" ("Видалені")
	@FindBy (xpath = "//span[contains(text(), 'Видалені')]")
	private WebElement tabRemoved;
	
	//Tab Main in Unit
	@FindBy (xpath = "//div[contains(@id, 'tabbar')]/a[1]//span[contains(@id, 'btnInnerEl')]")
	private WebElement tabMain;
	
	//Registration Number in the first record of grid on "Deleted" tab
	@FindBy(xpath = "//div[contains(@id, 'GridDeleted')]//table[1]//td[2]/div")
	private WebElement cellRegNumberInGridOnDelTab;
	
	//Registration Number in the first record of grid on Main tab
	@FindBy(xpath = "//div[contains(@id, 'tabpanel')]/div[1]//table[1]//td[2]/div")
	private WebElement cellRegNumberInGridOnMainTab;

	/*The card*/
		
	//Button "Save" ("Зберегти") for saving card
	@FindBy(xpath = "//span[contains(., 'Зберегти')]")
	private WebElement buttonSave;
	
	//Button "Exit" ("Вихід") for exit from card
	@FindBy (xpath = "//div[contains(@id, 'Card')]//span[contains(., 'Вихід')]")
	protected WebElement buttonExit;
	
	/*The Massage Box (Popup)*/	
		
	//Alert Popup - button "OK".
	@FindBy (xpath = "//.[contains(@id, 'messagebox')]//.[contains(@id, 'button')]")
	private WebElement buttonOKAlertPopup;
	
	//Confirmation Popup - button "Yes" 
	@FindBy (xpath = "//.[contains(@id, 'messagebox')]//span[contains(.,'Так')]")
	protected WebElement buttonYesConfirmationPopup;
	
	//Confirmation Popup - button "No" 
	@FindBy (xpath = "//.[contains(@id, 'messagebox')]//span[contains(.,'Ні')]")
	protected WebElement buttonNoConfirmationPopup;
	
	/*Form of Deletion Confirmation*/
		
	//Registration Number Field in "Deletion Confirmation Form" AND "Recovering Confirmation From"
	@FindBy (xpath = "//div[contains(@id, 'system-DeleteRecord')]//label[contains(., 'Реєстраційний №:')]/following-sibling::div[1]//input")
	protected WebElement fieldRegNumInConfirmationForm;
	
	//Reason of Deletion
	@FindBy (xpath = "//div[contains(@id, 'system-DeleteRecord')]//div[contains(@id, 'combo')]//input")
	protected WebElement inputFieldDeletionReason;
	
	//The First Item of deletion reason
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[2]")
	protected WebElement itemDeletionReason;
	
	//Button "Delete" ("Видалити")
	@FindBy (xpath = "//div[contains(@id, 'system-DeleteRecord')]//span[contains(text(), 'Видалити')]")
	protected WebElement buttonConfirmDelete;
		
	/*Form of Recovering Confirmation*/	
	//Registration Number Field is the same in "Deletion Confirmation Form" AND "Recovering Confirmation From"!!!!
	//Button "Recover" ("Відновити")
	@FindBy (xpath = "//div[contains(@id, 'system-DeleteRecord')]//span[contains(text(), 'Відновити')]")
	protected WebElement buttonConfirmRecover;
		
	/*---------------------------------Methods-----------------------------------------*/	
		
	protected void type(WebElement webElement, String text) {
		//webElement.click();
		webElement.clear();
		webElement.sendKeys(text);
	}
	/*	
	protected boolean isElementPresent(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
			}
		}
/*		
	public boolean isAlertPresent() {
		return isElementPresent(buttonOKAlertPopup);
	}
	
	//Clicking on button "OK" of Alert Popup
	public void clickOnAlertOK() {
		buttonOKAlertPopup.click();
	}
	
	//Clicking on "Save"("Зберегти") button in Card
	public void saveCard() {
		buttonSave.click();
	}
		
	//Clicking on "Exit"("Вихід") button in Card
	public void exitFromCard() {
		buttonExit.click();
	}
	
	//Getting Registration Number from "Deletion Confirmation Form" AND "Recovering Confirmation From"
	private String getRegNumberFromConfirmForm(){
		return fieldRegNumInConfirmationForm.getAttribute("value");
	}
	
	//Confirmation of Card Deletion with getting registration number of removed card
	protected String confirmDeletion() throws InterruptedException{
		inputFieldDeletionReason.click();
		Thread.sleep(2000);
		itemDeletionReason.click();
		String regNumber = getRegNumberFromConfirmForm();
		buttonConfirmDelete.click();
		this.clickOnAlertOK();
		return regNumber;
	}
	
	//Confirmation of Card Recovering with getting registration number of recovered card	
	protected String confirmRecovering() {
		String regNumber = getRegNumberFromConfirmForm();
		buttonConfirmRecover.click();
		this.clickOnAlertOK();
		return regNumber;
	}
	
	//Moving to "Deleted"("Видалені") tab
	protected void goToRemoved() {
		tabRemoved.click();
		}
	
	//Moving to Main Tab
	protected void goToMainTab() {
		tabMain.click();		
	}

	//Getting registration number from the first record in grid on "Deleted" tab
	public String getRegNumberFromGridOnDelTab() throws InterruptedException{
		return cellRegNumberInGridOnDelTab.getText();
	}

	//Getting registration number from the first record in grid on Main tab
	public String getRegNumberFromGridMainTab() throws InterruptedException{
		return cellRegNumberInGridOnMainTab.getText();
	}
*/
}
