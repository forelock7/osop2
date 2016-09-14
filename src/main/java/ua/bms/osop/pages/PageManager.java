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
	public NavigationUnits68Page navigationUnits68Page;
	public Unit4InternationalPage unit4InternationalPage;
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
		navigationUnits68Page = initElements(new NavigationUnits68Page(this));
		unit4InternationalPage = initElements(new Unit4InternationalPage(this));
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
