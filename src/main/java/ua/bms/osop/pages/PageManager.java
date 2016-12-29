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
	public Unit1ProceedingPage unit1ProceedingPage;
	public Unit1ProceedingCard unit1ProceedingCard;
	public Unit1ProceedingToPrcPage unit1ProceedingToPrcPage;
	public Unit1ProceedingToPrcCard unit1ProceedingToPrcCard;
	public Unit1CriminalPage unit1CriminalPage;
	public Unit1CriminalCard unit1CriminalCard;
	public Unit1ViewClaimPage unit1ViewClaimPage;
	public Unit1ViewClaimToPrcPage unit1ViewClaimToPrcPage;
	public Unit2ReleasePage unit2ReleasePage;
	public Unit2ReleaseCard unit2ReleaseCard;
	public Unit2ActOAPage unit2ActOAPage;
	public Unit2ActOACard unit2ActOACard;
	public Unit2ActPIPage unit2ActPIPage;
	public Unit2ActPICard unit2ActPICard;
	public Unit2AppealPage unit2AppealPage;
	public Unit2AppealCard unit2AppealCard;
	public Unit2CovertPage unit2CovertPage;
	public Unit2CovertCard unit2CovertCard;
	public Unit2PreventivePage unit2PreventivePage;
	public Unit2PreventiveCard unit2PreventiveCard;
	public Unit3AccusedCard unit3AccusedCard;
	public Unit3CriminalCasePage unit3CriminalCasePage;
	public Unit3CriminalCaseCard unit3CriminalCaseCard;
	public Unit3CriminalProceedingPage unit3CriminalProceedingPage;
	public Unit3CriminalProceedingCard unit3CriminalProceedingCard;
	public Unit3OtherCriminalCasePage unit3OtherCriminalCasePage;
	public Unit3OtherCriminalCaseCard unit3OtherCriminalCaseCard;
	public Unit3OtherCriminalProceedingPage unit3OtherCriminalProceedingPage;
	public Unit3OtherCriminalProceedingCard unit3OtherCriminalProceedingCard;
	public Unit3ParticipationCasePage unit3ParticipationCasePage;
	public Unit3ParticipationProceedingPage unit3ParticipationProceedingPage;
	public Unit4InternationalPage unit4InternationalPage;
	public Unit4InternationalCard unit4InternationalCard;
	public Unit5InspectionPage unit5InspectionPage;
	public Unit5InspectionCard unit5InspectionCard;
	public Unit5DocumentPage unit5DocumentPage;
	public Unit5DocumentCard unit5DocumentCard;
	public Unit5ChargedPage unit5ChargedPage;
	public Unit5ChargedCard unit5ChargedCard;
	public Unit6ClaimPage unit6ClaimPage;
	public Unit6ClaimCard unit6ClaimCard;
	public Unit7MassMediaPage unit7MassMediaPage;
	public Unit7MassMediaCard unit7MassMediaCard;
	public Unit8RequestPage unit8RequestPage;
	public Unit8RequestCard unit8RequestCard;
	public Unit9MilitaryPage unit9MilitaryPage;
	public Unit9MilitaryCard unit9MilitaryCard;
	
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
		unit1ProceedingPage = initElements(new Unit1ProceedingPage(this));
		unit1ProceedingCard = initElements(new Unit1ProceedingCard(this));
		unit1ProceedingToPrcPage = initElements(new Unit1ProceedingToPrcPage(this));
		unit1ProceedingToPrcCard = initElements(new Unit1ProceedingToPrcCard(this));
		unit1CriminalPage = initElements(new Unit1CriminalPage(this));
		unit1CriminalCard = initElements(new Unit1CriminalCard(this));
		unit1ViewClaimPage = initElements(new Unit1ViewClaimPage(this));
		unit1ViewClaimToPrcPage = initElements(new Unit1ViewClaimToPrcPage(this));
		unit2ReleasePage = initElements(new Unit2ReleasePage(this));
		unit2ReleaseCard = initElements(new Unit2ReleaseCard(this));
		unit2ActOAPage = initElements(new Unit2ActOAPage(this));
		unit2ActOACard = initElements(new Unit2ActOACard(this));
		unit2ActPIPage = initElements(new Unit2ActPIPage(this));
		unit2ActPICard = initElements(new Unit2ActPICard(this));
		unit2AppealPage = initElements(new Unit2AppealPage(this));
		unit2AppealCard = initElements(new Unit2AppealCard(this));
		unit2CovertPage = initElements(new Unit2CovertPage(this));
		unit2CovertCard = initElements(new Unit2CovertCard(this));
		unit2PreventivePage = initElements(new Unit2PreventivePage(this));
		unit2PreventiveCard = initElements(new Unit2PreventiveCard(this));
		unit3AccusedCard = initElements(new Unit3AccusedCard(this));
		unit3CriminalCasePage = initElements(new Unit3CriminalCasePage(this));
		unit3CriminalCaseCard = initElements(new Unit3CriminalCaseCard(this));
		unit3CriminalProceedingPage = initElements(new Unit3CriminalProceedingPage(this));
		unit3CriminalProceedingCard = initElements(new Unit3CriminalProceedingCard(this));
		unit3OtherCriminalCasePage = initElements(new Unit3OtherCriminalCasePage(this));
		unit3OtherCriminalCaseCard = initElements(new Unit3OtherCriminalCaseCard(this));
		unit3OtherCriminalProceedingPage = initElements(new Unit3OtherCriminalProceedingPage(this));
		unit3OtherCriminalProceedingCard = initElements(new Unit3OtherCriminalProceedingCard(this));
		unit3ParticipationCasePage = initElements(new Unit3ParticipationCasePage(this));
		unit3ParticipationProceedingPage = initElements(new Unit3ParticipationProceedingPage(this));
		unit4InternationalPage = initElements(new Unit4InternationalPage(this));
		unit4InternationalCard = initElements(new Unit4InternationalCard(this));
		unit5InspectionPage = initElements(new Unit5InspectionPage(this));
		unit5InspectionCard = initElements(new Unit5InspectionCard(this));
		unit5DocumentPage = initElements(new Unit5DocumentPage(this));
		unit5DocumentCard = initElements(new Unit5DocumentCard(this));
		unit5ChargedPage = initElements(new Unit5ChargedPage(this));
		unit5ChargedCard = initElements(new Unit5ChargedCard(this));
		unit6ClaimPage = initElements(new Unit6ClaimPage(this));
		unit6ClaimCard = initElements(new Unit6ClaimCard(this));
		unit7MassMediaPage = initElements(new Unit7MassMediaPage(this));
		unit7MassMediaCard = initElements(new Unit7MassMediaCard(this));
		unit8RequestPage = initElements(new Unit8RequestPage(this));
		unit8RequestCard = initElements(new Unit8RequestCard(this));
		unit9MilitaryPage = initElements(new Unit9MilitaryPage(this));
		unit9MilitaryCard = initElements(new Unit9MilitaryCard(this));
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
	    PageFactory.initElements(new DisplayedElementLocatorFactory(driver, 1), page);
	    return page;
	}
	  
	public WebDriver getWebDriver() {
	    return driver;
	}

}
