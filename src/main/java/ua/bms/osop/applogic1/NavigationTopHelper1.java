package ua.bms.osop.applogic1;

import ua.bms.osop.applogic.NavigationTopHelper;

/*
 * Ancillary Class for tests on Top Navigation Page
 * Navigates moving over web-site
 * Declares methods for moving between Pages.
 */
public class NavigationTopHelper1 extends DriverBasedHelper implements NavigationTopHelper {

	/*
	 * Constructor of object which is managed by object Application Manager.
	 */
	public NavigationTopHelper1(ApplicationManager1 manager) {
		super(manager.getWebDriver());
	}
	
	//Moving to page Unit 1 "Presentetion" NavigationUnit1Page page
	@Override
	public void goToUnit1Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit1MenuItem();
	}
	
	//Moving to page Unit 4 "International Judicial Cooperation" Page("Міжнародно-правове співробітництво")
	@Override
	public void goToUnit4Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit4MenuItem();
	}
	
	//Moving to navigation page of Units 6 and 8 "Consideration of Claims and Requests"("Розгляд звернень та запитів")
	@Override
	public void goToNavigationUnit68Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit68MenuItem();
	}
	
	//Moving to page Unit 7 "Mass Media"("ЗМІ")
	@Override
	public void goToUnit7Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit7MenuItem();
	}	
	
	//Moving to page Unit 9 "Military Administrative Offenses"("Військові адмінправопорушення")
	@Override
	public void goToUnit9Page(){
		pages.navigationTopPage.ensurePageLoaded().clickUnit9MenuItem();
	}
	


}
