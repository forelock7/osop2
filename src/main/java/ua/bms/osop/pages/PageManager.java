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
	public NavigationUnit23Page navigationUnit23Page;
	public NavigationUnit5Page navigationUnit5Page;
	public NavigationUnits68Page navigationUnits68Page;
	public Unit1ProceedingsPage unit1ProceedingsPage;
	public Unit1ProceedingsToPrcPage unit1ProceedingsToPrcPage;
	public Unit1CrimePage unit1CrimePage;
	public Unit1ViewClaimsPage unit1ViewClaimsPage;
	public Unit1ViewClaimsToPrcPage unit1ViewClaimsToPrcPage;
	public Unit2ReleasePage unit2ReleasePage;
	public Unit2ActsOAPage unit2ActsOAPage;
	public Unit2ActsPIPage unit2ActsPIPage;
	public Unit2AppealsPage unit2AppealsPage;
	public Unit2CovertPage unit2CovertPage;
	public Unit2PreventivePage unit2PreventivePage;
	public Unit3CriminalCasesPage unit3CriminalCasesPage;
	public Unit3CriminalProcPage unit3CriminalProcPage;
	public Unit3OtherCriminalCasesPage unit3OtherCriminalCasesPage;
	public Unit3OtherCriminalProcPage unit3OtherCriminalProcPage;
	public Unit3ParticipationCasesPage unit3ParticipationCasesPage;
	public Unit3ParticipationProcPage unit3ParticipationProcPage;
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
		navigationUnit23Page = initElements(new NavigationUnit23Page(this));
		navigationUnit5Page = initElements(new NavigationUnit5Page(this));
		navigationUnits68Page = initElements(new NavigationUnits68Page(this));
		unit1ProceedingsPage = initElements(new Unit1ProceedingsPage(this));
		unit1ProceedingsToPrcPage = initElements(new Unit1ProceedingsToPrcPage(this));
		unit1CrimePage = initElements(new Unit1CrimePage(this));
		unit1ViewClaimsPage = initElements(new Unit1ViewClaimsPage(this));
		unit1ViewClaimsToPrcPage = initElements(new Unit1ViewClaimsToPrcPage(this));
		unit2ReleasePage = initElements(new Unit2ReleasePage(this));
		unit2ActsOAPage = initElements(new Unit2ActsOAPage(this));
		unit2ActsPIPage = initElements(new Unit2ActsPIPage(this));
		unit2AppealsPage = initElements(new Unit2AppealsPage(this));
		unit2CovertPage = initElements(new Unit2CovertPage(this));
		unit2PreventivePage = initElements(new Unit2PreventivePage(this));
		unit3CriminalCasesPage = initElements(new Unit3CriminalCasesPage(this));
		unit3CriminalProcPage = initElements(new Unit3CriminalProcPage(this));
		unit3OtherCriminalCasesPage = initElements(new Unit3OtherCriminalCasesPage(this));
		unit3OtherCriminalProcPage = initElements(new Unit3OtherCriminalProcPage(this));
		unit3ParticipationCasesPage = initElements(new Unit3ParticipationCasesPage(this));
		unit3ParticipationProcPage = initElements(new Unit3ParticipationProcPage(this));
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
