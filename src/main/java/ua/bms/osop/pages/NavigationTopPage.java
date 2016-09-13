package ua.bms.osop.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Declare all Web-elements on Top Navigation Page and the main methods with them
 */
public class NavigationTopPage extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public NavigationTopPage(PageManager pages) {
		super(pages);
	}
	
	/*
	 * Ensures if Navigation Page is available using explicit waits
	 */
	public NavigationTopPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.xpath("//div[contains(@id, 'mainToolBarContainer')]//.[contains(text(), 'Вихід')]")));
	    //wait.until(ExpectedConditions.visibilityOf(linkLogOut));
	    return this;
	}
	
/*------------------The Web-Elements of the MAIN TOOLBAR------------------------------------------------------*/

	//Button "LogOut" ("Вихід")
	@FindBy(xpath = "//div[contains(@id, 'mainToolBarContainer')]//.[contains(text(), 'Вихід')]")
	private WebElement linkLogOut;
	
	//Menu button of "Report sections" ("РОЗДІЛИ ЗВІТУ")
	@FindBy (xpath = "//div[contains(@id, 'mainToolBarContainer')]//span[contains(text(), 'РОЗДІЛИ ЗВІТУ')]")
	private WebElement buttonReportSections;
	
	//Items from menu "Report sections"("РОЗДІЛИ ЗВІТУ")
	
	//Section Unit 68 - "Consideration of Claims and Requests"(Розділ 6 та 8: "Розгляд звернень та запитів")
	@FindBy (xpath = "//div[contains(@id, 'menu')]//span[contains(text(), 'Розгляд звернень та запитів')]")
	private WebElement itemMenuU68;
		
	//Section Unit 7 - "Mass Media"(Розділ 7: "ЗМІ")
	@FindBy (xpath = "//div[contains(@id, 'menu')]//span[contains(text(), 'ЗМІ')]")
	private WebElement itemMenuU7;
	
	//Section Unit 9 - "Military Administrative Offenses"(Розділ 9: "Військові адмінправопорушення")
	@FindBy (xpath = "//div[contains(@id, 'menu')]//span[contains(text(), 'Військові адмінправопорушення')]")
	private WebElement itemMenuU9;
	
	/*------------------Methods---------------------------------------------------------------------------*/	

	//Performing of logOut of system
	public LoginPage clickLinkLogOut(){
		linkLogOut.click();
		buttonYesConfirmationPopup.click();
		return pages.loginPage;
	}
	
	//U68 - Moving from "Home" page to "Consideration of Claims and Requests" page
		public NavigationUnits68Page moveToNavigationUnit68Page(){
			buttonReportSections.click();	
			itemMenuU68.click();
			return pages.navigationUnits68Page;
		}
	
	//U7 - Moving from "Home" page to "Mass Media" page
	public Unit7MassMediaPage moveToUnit7Page(){
		buttonReportSections.click();	
		itemMenuU7.click();
		return pages.unit7MassMediaPage;
	}
	
	//U9 - Moving from "Home" page to "Military Administrative violations" page
	public Unit9MilitaryPage moveToUnit9Page() {
		buttonReportSections.click();
		itemMenuU9.click();
		return pages.unit9MilitaryPage;
	}

}
