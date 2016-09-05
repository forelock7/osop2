package ua.bms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;


public class TopNavigationPage extends AnyPage {
	
	public TopNavigationPage(PageManager pages) {
		super(pages);
	}
	
/*------------------The Web-Elements of the MAIN TOOLBAR------------------------------------------------------*/

	//Button "LogOut" ("Вихід")
	@FindBy(xpath = "//div[contains(@id, 'mainToolBarContainer')]//span[contains(text(), 'Вихід')]")
	private WebElement linkLogOut;
	
	//Menu button of "Report sections" ("РОЗДІЛИ ЗВІТУ")
	@FindBy (xpath = "//div[contains(@id, 'mainToolBarContainer')]//span[contains(text(), 'РОЗДІЛИ ЗВІТУ')]")
	private WebElement reportSections;
	
	//Items from menu "Report sections"("РОЗДІЛИ ЗВІТУ")
	//Section Unit 9 - "Administrative Violations"(Розділ 9: "Військові адмінправопорушення")
	@FindBy (xpath = "//div[contains(@id, 'menu')]//span[contains(text(), 'Військові адмінправопорушення')]")
	private WebElement menuItemU9;
	
	//Section Unit 7 - "Mass Media"(Розділ 7: "ЗМІ")
	@FindBy (xpath = "//div[contains(@id, 'menu')]//span[contains(text(), 'ЗМІ')]")
	private WebElement menuItemU7;
	
/*------------------Methods---------------------------------------------------------------------------*/	

	public TopNavigationPage ensurePageLoaded() {
		super.ensurePageLoaded();
	    wait.until(presenceOfElementLocated(By.xpath("//div[contains(@id, 'mainToolBarContainer')]//span[contains(text(), 'Вихід')]")));
	    return this;
	}

	//Performing of logOut of system
	public LoginPage clickLogoutLink(){
		linkLogOut.click();
		buttonYesConfirmationPopup.click();
		return pages.loginPage;
	}
	
	//U7 - Moving from "Home" page to "Mass Media" page
	public Unit7MassMediaPage clickUnit7Page(){
		reportSections.click();	
		menuItemU7.click();
		return pages.unit7MassMediaPage;
	}
	
	//U9 - Moving from "Home" page to "Military Administrative violations" page
	public Unit9MilitaryPage clickUnit9Page() {
		reportSections.click();
		menuItemU9.click();
		return pages.unit9MilitaryPage;
	}

}
