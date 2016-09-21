package ua.bms.osop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*
 * Helps to manage pages.
 * Performs initialization of each page
 */
public class PageManager {

	private WebDriver driver;
	public LoginPage loginPage;
	public NavigationTopPage navigationTopPage;
	public NavigationUnit1Page navigationUnit1Page;
	public NavigationUnit5Page navigationUnit5Page;
	public NavigationUnits68Page navigationUnits68Page;
	public Unit1ReviewPage unit1ReviewPage;
	public Unit1ReviewToPrcPage unit1ReviewToPrcPage;
	public Unit1CrimePage unit1CrimePage;
	public Unit1ClaimsPage unit1ClaimsPage;
	public Unit1ClaimsToPrcPage unit1ClaimsToPrcPage;
	public Unit4InternationalPage unit4InternationalPage;
	public Unit5InspectionsPage unit5InspectionsPage;
	public Unit5DocumentsPage unit5DocumentsPage;
	public Unit5ChargedPage unit5ChargedPage;
	public Unit6ClaimsPage unit6ClaimsPage;
	public Unit7MassMediaPage unit7MassMediaPage;
	public Unit8RequestsPage unit8RequestsPage;
	public Unit9MilitaryPage unit9MilitaryPage;
	
	

	/*
	 * Performs initialization of each page.
	 * Dispatches control over WebDriver to determinate Page
	 */
	public PageManager(WebDriver driver) {
		this.driver = driver;
		loginPage = initElements(new LoginPage(this));
		navigationTopPage = initElements(new NavigationTopPage(this));
		navigationUnit1Page = initElements(new NavigationUnit1Page(this));
		navigationUnit5Page = initElements(new NavigationUnit5Page(this));
		navigationUnits68Page = initElements(new NavigationUnits68Page(this));
		unit1ReviewPage = initElements(new Unit1ReviewPage(this));
		unit1ReviewToPrcPage = initElements(new Unit1ReviewToPrcPage(this));
		unit1CrimePage = initElements(new Unit1CrimePage(this));
		unit1ClaimsPage = initElements(new Unit1ClaimsPage(this));
		unit1ClaimsToPrcPage = initElements(new Unit1ClaimsToPrcPage(this));
		unit4InternationalPage = initElements(new Unit4InternationalPage(this));
		unit5InspectionsPage = initElements(new Unit5InspectionsPage(this));
		unit5DocumentsPage = initElements(new Unit5DocumentsPage(this));
		unit5ChargedPage = initElements(new Unit5ChargedPage(this));
		unit6ClaimsPage = initElements(new Unit6ClaimsPage(this));
		unit7MassMediaPage = initElements(new Unit7MassMediaPage(this));
		unit8RequestsPage = initElements(new Unit8RequestsPage(this));
		unit9MilitaryPage = initElements(new Unit9MilitaryPage(this));
	}
	
	/*
	 * Methods initialization of each page.
	 * Uses explicit waits 
	 */
	private <T extends Page> T initElements(T page) {
		/*
		 * 1-Initialization Page using implicit waits 
		 * 
	     * PageFactory.initElements(driver, page);
	     * 
		 * 2-Initialization Page using explicit waits. Must be turned implicit waits off!
		 * Waits till Web-element appear in DOM.
		 * 
	     * PageFactory.initElements(new AjaxElementLocatorFactory(driver, 1), page);
	     * 
		 * 3-Initialization Page using explicit waits with modified method AjaxElementLocatorFactory.
		 * Waits till Web-element doesn't only appear in DOM and also be visible(is displayed)
		 */
	    PageFactory.initElements(new DisplayedElementLocatorFactory(driver, 2), page);
	    return page;
	}
	  
	public WebDriver getWebDriver() {
	    return driver;
	}

}
