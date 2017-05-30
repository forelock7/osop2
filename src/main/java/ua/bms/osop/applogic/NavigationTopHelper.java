package ua.bms.osop.applogic;

/*
 * Ancillary Class for tests on Top Navigation Page
 * Navigates moving over web-site
 * Declares methods for moving between Pages.
 */
public class NavigationTopHelper extends DriverBasedHelper {

	private String baseUrl;
	
	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public NavigationTopHelper(ApplicationManager manager) {
		super(manager.getWebDriver());
		this.baseUrl = manager.getBaseUrl();
	}
	

	/*
	 * Opens the main page. Set URL.
	 * Checks if is logged in than doesn't need to set URL of start(main) page
	 */
	public void openMainPage() {
		driver.get(baseUrl);
	}
	
	//Moving to page Unit 1 "Presentetion" NavigationUnit1Page page
	public void goToUnit1Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit1MenuItem();
	}
	
	//Moving to page Unit 2-3 "Supervision over the status of pre-trial investigation and public prosecution" NavigationUnit23Page page
	public void goToUnit23Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit23MenuItem();
	}
	
	//Moving to page Unit 4 "International Judicial Cooperation" Page("Міжнародно-правове співробітництво")
	public void goToUnit4Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit4MenuItem();
	}
	
	//Moving to page Unit 5 "Supervision of the observance of laws in the execution of judgments." Page("Нагляд за додержанням законів при виконанні судових рішень.")
	public void goToUnit5Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit5MenuItem();
	}
	
	//Moving to navigation page of Units 6 and 8 "Consideration of Claims and Requests"("Розгляд звернень та запитів")
	public void goToUnit68Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit68MenuItem();
	}
	
	//Moving to page Unit 7 "Mass Media"("ЗМІ")
	public void goToUnit7Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit7MenuItem();
	}	
	
	//Moving to page Unit 9 "Military Administrative Offenses"("Військові адмінправопорушення")
	public void goToUnit9Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit9MenuItem();
	}

	//Moving to page Administration("адміністрування")
	public void goToAdministrationPage(){
		pages.navigationTopPage.ensurePageLoaded().clickAdministrationItem();
	}

}
