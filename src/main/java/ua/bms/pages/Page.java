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
	
	//Button "Edit"("Редагувати") in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//table[1]//td[12]/div")
	protected WebElement buttonEdit;
	
	//Button "Delete"("Видалити")
	
/*The card*/
	
	//Button "Save" ("Зберегти") for saving card
	@FindBy(xpath = "//span[contains(., 'Зберегти')]")
	protected WebElement buttonSave;
	
	//Button "Exit" ("Вихід") for exit from card
	@FindBy (xpath = "//div[contains(@id, 'Card')]//span[contains(., 'Вихід')]")
	protected WebElement buttonExit;
	
/*The Massage Box (Popup)*/	
	
	//Alert Popup - button "OK".
	@FindBy (xpath = "//.[contains(@id, 'messagebox')]//.[contains(@id, 'button')]")
	protected WebElement buttonOKAlertPopup;
	
	//Confirmation Popup - button "Yes" 
	@FindBy (xpath = "//.[contains(@id, 'messagebox')]//span[contains(.,'Так')]")
	protected WebElement buttonYesConfirmationPopup;
	//Confirmation Popup - button "No" 
	@FindBy (xpath = "//.[contains(@id, 'messagebox')]//span[contains(.,'Ні')]")
	protected WebElement buttonNoConfirmationPopup;
	
/*---------------------------------Methods-----------------------------------------*/	
	
	protected abstract void open();
	
	protected void type(WebElement webElement, String text) {
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

}
