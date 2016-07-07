package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	//Button "Вихід"
	@FindBy(id = "button-1038-btnInnerEl")
	public WebElement linkLogOut;
	
	@FindBy(xpath = "html/body/div[1]/form/h2")
	public WebElement linkLogIn;
	
	//Alert of logout confirmation 
	@FindBy (id = "button-1006-btnInnerEl")
	public WebElement confirmLogOut;
	
	//Menu button of "Report sections"
	@FindBy (id = "button-1015-btnInnerEl")
	public WebElement reportSections;
	
	//Items from menu "Report sections"
	//Section Addition Table 5 - "Administrative Violations"
	@FindBy (id = "menuitem-1029-textEl")
	public WebElement adminViol;
	
	@Override
	public void open(){};
	
	//Checking if user is logged out of system(have to exist the title "ВХІД ДО СИСТЕМИ" on Login Page)
	public boolean isLoggedOut() {
		if (isElementPresent(linkLogIn)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Checking if user is logged in system(have to exist the button "Вихід")
	public boolean isLoggedIn() {
		return isElementPresent(linkLogOut);
	}
	
	//Performing of logging of system
	public void logOut() {
		linkLogOut.click();
		confirmLogOut.click();
	}

	public AdministrativeViolationsPage goToAV() {
		reportSections.click();
		adminViol.click();
		return PageFactory.initElements(driver, AdministrativeViolationsPage.class);
	}
}
