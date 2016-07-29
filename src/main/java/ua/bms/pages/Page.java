//Abstract class representation of a Page in the UI. Page object pattern.

package ua.bms.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class Page {
	
	protected WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver = driver;
	}
	
/*---------------The similar web-elements that is available on all pages------------*/
	
/*The main page of UNITs*/	
	
	//Button "Create" ("Створити")
	@FindBy(xpath = "//span[contains(., 'Створити')]")
	protected WebElement buttonCreateCard;
	
	//Tab "Removed" 
	@FindBy (xpath = "span[contains(., 'Видалені')]")
	private WebElement tabRemoved;
	
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
	@FindBy (xpath = "//div[contains(@id, 'system-DeleteRecord')]//label[contains(., 'Реєстраційний №:')]/../following-sibling::div[1]//input")
	protected WebElement fieldRegistrationNumber;
	//Reason of Deletion
	@FindBy (xpath = "//div[contains(@id, 'system-DeleteRecord')]//label[contains(., 'Підстава видалення:')]/../following-sibling::div[1]//input")
	protected WebElement inputFieldDeletionReason;
	//The First Item of deletion reason
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[1]")
	protected WebElement itemDeletionReason;
	//Button "Delete" ("Видалити")
	@FindBy (xpath = "//div[contains(@id, 'system-DeleteRecord')]//span[contains(text(), 'Видалити')]")
	protected WebElement buttonConfirmDelete;
	
/*---------------------------------Methods-----------------------------------------*/	
	
	protected abstract void open();
	
	protected void type(WebElement webElement, String text) {
		//webElement.click();
		webElement.clear();
		webElement.sendKeys(text);
	}
		
	protected boolean isElementPresent(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public boolean isAlertPresent() {
		return isElementPresent(buttonOKAlertPopup);
	}
	
	public void clickOnAlertOK() {
		buttonOKAlertPopup.click();
	}
	
	//Clicking on "Save" button in Card
	public void saveCard() {
		buttonSave.click();
	}
		
	//Clicking on "Exit" button in Card
	public void exitFromCard() {
		buttonExit.click();
	}
	
	//Confirmation of Card Deletion 
	protected String confirmDeletion(){
		inputFieldDeletionReason.click();
		itemDeletionReason.click();
		String regNumber = fieldRegistrationNumber.getAttribute("value");
		buttonConfirmDelete.click();
		this.clickOnAlertOK();
		return regNumber;
	}
	
	protected void goTobRemoved() {
		tabRemoved.click();
		}

}
