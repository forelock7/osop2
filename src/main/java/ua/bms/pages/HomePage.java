package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
/*------------------The Web-Elements of the MAIN TOOLBAR------------------------------------------------------*/

	//Button "Вихід"
	@FindBy(id = "button-1038-btnInnerEl")
	private WebElement linkLogOut;
	
	//Menu button of "Report sections"
	@FindBy (id = "button-1015-btnInnerEl")
	private WebElement reportSections;
	
	//Items from menu "Report sections"
	//Section Addition Table 5 - "Administrative Violations"
	@FindBy (id = "menuitem-1029-textEl")
	private WebElement adminViol;
	
/*------------------Methods---------------------------------------------------------------------------*/	
	
	@Override
	public void open(){};
	
	
	//Checking if user is logged in system(have to exist the button "Вихід")
	public boolean isLoggedIn() {
		return isElementPresent(linkLogOut);
	}
	
	//Performing of logging of system
	public LoginPage logOut() {
		linkLogOut.click();
		buttonYesConfirmationPopup.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}

	//Moving from "Home" page to "Military Administrative violations" page
	public Unit9MilitaryPage goToAV() {
		reportSections.click();
		adminViol.click();
		return PageFactory.initElements(driver, Unit9MilitaryPage.class);
	}
}
