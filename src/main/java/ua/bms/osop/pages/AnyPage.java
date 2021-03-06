package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/*
 * Abstract class declare Web-elements and methods with them that could be used on every Page 
 */
public abstract class AnyPage extends Page {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public AnyPage(PageManager pages) {
		super(pages);
	}
		
/*---------------The similar web-elements that is available on all pages------------*/
	
	/*The main page of UNITs*/	
		
	//Button "Create" ("Створити")
	@FindBy(xpath = "//span[contains(., 'Створити')]")
	private WebElement buttonCreateCard;
	
	//Tab "Removed" ("Видалені")
	@FindBy (xpath = "//span[contains(text(), 'Видалені')]")
	private WebElement tabRemoved;
	
	//Tab Main in Unit
	@FindBy (xpath = "//div[contains(@id, 'tabbar')]/a[1]//span[contains(@id, 'btnInnerEl')]")
	private WebElement tabMain;
	
	//Header of "Registration Number" column(2) in Main Grid
	@FindBy (xpath = "//div[contains(@id, 'headercontainer')]/div[3]")
	private WebElement headerMainGrid;

	//Registration Number in the first record of grid on Main tab
	@FindBy(xpath = "//div[1]//table[1]//td[2]/div")
	private WebElement cellRegNumberInGridOnMainTab;
	
	//Registration Number in the first record of grid on "Removed" tab
	@FindBy(xpath = "//div[contains(@id, 'GridDeleted')]//table[1]//td[2]/div")
	private WebElement cellRegNumberInGridOnRemovedTab;
	
	/*The card*/
	
	//Button "Save" ("Зберегти") for saving card
	@FindBy(xpath = "//span[contains(., 'Зберегти')]")
	private WebElement buttonSaveCard;
	
	//Button "Exit" ("Вихід") for exit from card
	@FindBy (xpath = "//div[contains(@id, 'Card')]//span[contains(., 'Вихід')]")
	private WebElement buttonExitFromCard;
	
	/*The Massage Box (Popup)*/	
		
	//Alert Popup - button "OK".
	@FindBy (xpath = "//.[contains(@id, 'messagebox')]//.[contains(@id, 'button')]")
	private WebElement buttonOKAlertPopup;

	//Alert Popup - button "OK".
	@FindBy (xpath = "//div[contains(@id, 'messagebox')]/div[contains(text(), 'Увага!')]")
	private WebElement alertFieldIsRequired;
	
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
	protected WebElement inputFieldRemoveReason;
	
	//The First Item of deletion reason
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[2]")
	protected WebElement itemRemoveReason;
	
	//Button "Delete" ("Видалити")
	@FindBy (xpath = "//div[contains(@id, 'system-DeleteRecord')]//span[contains(text(), 'Видалити')]")
	protected WebElement buttonConfirmRemove;
		
	/*Form of Recovering Confirmation*/	
	//Registration Number Field is the same in "Deletion Confirmation Form" AND "Recovering Confirmation From"!!!!
	//Button "Recover" ("Відновити")
	@FindBy (xpath = "//div[contains(@id, 'system-DeleteRecord')]//span[contains(text(), 'Відновити')]")
	protected WebElement buttonConfirmRestoring;
		


	/*---------------------------------Methods are related to Pages-----------------------------------------*/	
		
	protected void type(WebElement webElement, String text) {
		//webElement.click();
		webElement.clear();
		webElement.sendKeys(text);
	}
	
	public void clickButtonCreateCard(){
		buttonCreateCard.click();
	}
	
	protected void clickOnGridHeader() {
		headerMainGrid.click();
	}


	public void doubleClickOnGridHeader() {
		Actions action = new Actions(driver);
		action.click(headerMainGrid).click(headerMainGrid).perform();
	}

	//Opens to review Card
	public void doubleClickOnFirstRecordInGridOnMainTab() {
	    Actions action = new Actions(driver);
		action.doubleClick(fluientWaitforElement(cellRegNumberInGridOnMainTab)).build().perform();
	}
	
	//Moving to "Deleted"("Видалені") tab
	public void clickOnRemovedTab() {
		tabRemoved.click();
	}
	
	//Moving to Main Tab
	public void clickOnMainTab() {
		tabMain.click();		
	}
	
	//Getting registration number from the first record in grid on "Deleted" tab
	public String getRegNumberFromGridOnRemovedTab(){
		return cellRegNumberInGridOnRemovedTab.getText();
	}
		
	//Getting registration number from the first record in grid on Main tab
	public String getRegNumberFromGridOnMainTab(){
		return fluientWaitforElement(cellRegNumberInGridOnMainTab).getText();
	}
			
	/*---------------------------------Methods are related to Cards-----------------------------------------*/
	
	protected boolean isElementPresent(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
			}
		 catch (ElementNotVisibleException e1) {
			 return false;
		 }
	}
		
	//Clicking on "Save"("Зберегти") button in Card
	public void clickButtonSaveCard() {
		buttonSaveCard.click();
		if (isElementPresent(alertFieldIsRequired)) {
			clickOnAlertOK();
			buttonSaveCard.click();
		}
	}
	
	//Clicking on button "OK" of Alert Popup
	public void clickOnAlertOK() {
		fluientWaitforElement(buttonOKAlertPopup).click();
	}
	
	//Clicking on "Exit"("Вихід") button in Card
	public void clickButtonExitFromCardForm() {
		buttonExitFromCard.click();
	}
	
	//Confirmation of Card Removing with getting registration number of removed card
	protected String confirmationOfRemoving(){
		inputFieldRemoveReason.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[2]"))).click();
		//Getting Registration Number from "Deletion Confirmation Form" AND "Recovering Confirmation From"
		String regNumberRemovedCard = fieldRegNumInConfirmationForm.getAttribute("value");
		buttonConfirmRemove.click();
		this.clickOnAlertOK();
		return regNumberRemovedCard;
	}
	
	//Confirmation of Card Recovering with getting registration number of recovered card	
	protected String confirmRestoring() {
		String regNumberRestoringCard = fieldRegNumInConfirmationForm.getAttribute("value");
		buttonConfirmRestoring.click();
		this.clickOnAlertOK();
		return regNumberRestoringCard;
	}
}



