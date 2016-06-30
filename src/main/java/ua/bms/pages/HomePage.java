package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "button-1038-btnInnerEl")
	public WebElement linkLogOut;
	
	@FindBy(xpath = "html/body/div[1]/form/h2")
	public WebElement linkLogIn;
	
	@FindBy (id = "button-1006-btnInnerEl")
	public WebElement confirmLogOut;
	
	@FindBy (id = "button-1015-btnInnerEl")
	public WebElement reportSections;
	
	@FindBy (id = "menuitem-1029-textEl")
	public WebElement adminViol;
	
	@Override
	public void open(){};
	
	public boolean isLoggedOut() {
		if (isElementPresent(linkLogIn)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isLoggedIn() {
		return isElementPresent(linkLogOut);
	}
	
	public void logOut() {
		linkLogOut.click();
		confirmLogOut.click();
	}

	public void goToAV() {
		reportSections.clear();
		adminViol.clear();
	}
}
