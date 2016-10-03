package ua.bms.osop.applogic1;

import org.openqa.selenium.WebDriver;
import ua.bms.osop.applogic.ApplicationManager;
import ua.bms.osop.applogic.NavigationTopHelper;
import ua.bms.osop.applogic.NavigationUnit1Helper;
import ua.bms.osop.applogic.NavigationUnit23Helper;
import ua.bms.osop.applogic.NavigationUnit5Helper;
import ua.bms.osop.applogic.NavigationUnit68Helper;
import ua.bms.osop.applogic.Unit1ViewClaimsHelper;
import ua.bms.osop.applogic.Unit1ViewClaimsToPrcHelper;
import ua.bms.osop.applogic.Unit1CrimeHelper;
import ua.bms.osop.applogic.Unit1ProceedingsHelper;
import ua.bms.osop.applogic.Unit1ProceedingsToPrcHelper;
import ua.bms.osop.applogic.Unit2ActsOAHelper;
import ua.bms.osop.applogic.Unit2ActsPIHelper;
import ua.bms.osop.applogic.Unit2AppealsHelper;
import ua.bms.osop.applogic.Unit2CovertHelper;
import ua.bms.osop.applogic.Unit2PreventiveHelper;
import ua.bms.osop.applogic.Unit2ReleaseHelper;
import ua.bms.osop.applogic.Unit3CriminalCasesHelper;
import ua.bms.osop.applogic.Unit3CriminalProcHelper;
import ua.bms.osop.applogic.Unit3OtherCriminalCasesHelper;
import ua.bms.osop.applogic.Unit3OtherCriminalProcHelper;
import ua.bms.osop.applogic.Unit3ParticipationCasesHelper;
import ua.bms.osop.applogic.Unit3ParticipationProcHelper;
import ua.bms.osop.applogic.Unit4Helper;
import ua.bms.osop.applogic.Unit5ChargedHelper;
import ua.bms.osop.applogic.Unit5DocumentsHelper;
import ua.bms.osop.applogic.Unit5InspectionsHelper;
import ua.bms.osop.applogic.Unit6Helper;
import ua.bms.osop.applogic.Unit7Helper;
import ua.bms.osop.applogic.Unit8Helper;
import ua.bms.osop.applogic.Unit9Helper;
import ua.bms.osop.applogic.UserHelper;
import ua.bms.osop.utils.Browser;
import ua.bms.osop.utils.ConfigProperties;
import ua.bms.osop.webdriver.WebDriverFactory;

/*
 * Helps to manage application.
 * Performs initialization of instance of WebDriver, all Helpers, some properties of web-site and browser
 * Implements all get-methods of all Helpers
 */
public class ApplicationManager1 implements ApplicationManager {
	
	 private UserHelper userHelper;
	 private NavigationTopHelper navTopHelper;
	 private NavigationUnit1Helper navUnit1Helper;
	 private NavigationUnit23Helper navUnit23Helper;
	 private NavigationUnit5Helper navUnit5Helper;
	 private NavigationUnit68Helper navUnit68Helper;
	 private Unit1ProceedingsHelper unit1ProceedingsHelper;
	 private Unit1ProceedingsToPrcHelper unit1ProceedingsToPrcHelper;
	 private Unit1CrimeHelper unit1CrimeHelper;
	 private Unit1ViewClaimsHelper unit1ViewClaimsHelper;
	 private Unit1ViewClaimsToPrcHelper unit1ViewClaimsToPrcHelper;
	 private Unit2ActsOAHelper unit2ActsOAHelper;
	 private Unit2ActsPIHelper unit2ActsPIHelper;
	 private Unit2AppealsHelper unit2AppealsHelper;
	 private Unit2CovertHelper unit2CovertHelper;
	 private Unit2PreventiveHelper unit2PreventiveHelper;
	 private Unit2ReleaseHelper unit2ReleaseHelper;
	 private Unit3CriminalCasesHelper unit3CriminalCasesHelper;
	 private Unit3CriminalProcHelper unit3CriminalProcHelper;
	 private Unit3OtherCriminalCasesHelper unit3OtherCriminalCasesHelper;
	 private Unit3OtherCriminalProcHelper unit3OtherCriminalProcHelper;
	 private Unit3ParticipationCasesHelper unit3ParticipationCasesHelper;
	 private Unit3ParticipationProcHelper unit3ParticipationProcHelper;
	 private Unit4Helper unit4Helper;
	 private Unit5InspectionsHelper unit5InspectionsHelper;
	 private Unit5DocumentsHelper unit5DocumentsHelper;
	 private Unit5ChargedHelper unit5ChargedHelper;
	 private Unit6Helper unit6Helper;
	 private Unit7Helper unit7Helper;
	 private Unit8Helper unit8Helper;
	 private Unit9Helper unit9Helper;
	 private WebDriver driver;
	 private String baseUrl;
	 
	 /*Initialization configuration properties from application.properties(pom.xml(depend on profile))*/ 
	 public ApplicationManager1() {
		 		 
		 baseUrl = ConfigProperties.getProperty("base.url");
		 String gridHubUrl = ConfigProperties.getProperty("grid2.hub");
		 Browser browser = new Browser();
		 browser.setName(ConfigProperties.getProperty("browser.name"));
		 browser.setVersion(ConfigProperties.getProperty("browser.version"));
		 browser.setPlatform(ConfigProperties.getProperty("browser.platform"));
		 String username = ConfigProperties.getProperty("user.username");
		 String password = ConfigProperties.getProperty("user.password");
	    
		 driver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);
	 	 //driver = WebDriverFactory.getInstance();

		 userHelper = new UserHelper1(this);
		 navTopHelper = new NavigationTopHelper1(this);
		 navUnit1Helper = new NavigationUnit1Helper1(this);
		 navUnit23Helper = new NavigationUnit23Helper1(this);
		 navUnit5Helper = new NavigationUnit5Helper1(this);
		 navUnit68Helper = new NavigationUnit68Helper1(this);
		 unit1ProceedingsHelper = new Unit1ProceedingsHelper1(this);
		 unit1ProceedingsToPrcHelper = new Unit1ProceedingsToPrcHelper1(this);
		 unit1CrimeHelper = new Unit1CrimeHelper1(this);
		 unit1ViewClaimsHelper = new Unit1ViewClaimsHelper1(this);
		 unit1ViewClaimsToPrcHelper = new Unit1ViewClaimsToPrcHelper1(this);
		 unit2ActsOAHelper = new Unit2ActsOAHelper1(this);
		 unit2ActsPIHelper = new Unit2ActsPIHelper1(this);
		 unit2AppealsHelper = new Unit2AppealsHelper1(this);
		 unit2CovertHelper = new Unit2CovertHelper1(this);
		 unit2PreventiveHelper = new Unit2PreventiveHelper1(this);
		 unit2ReleaseHelper = new Unit2ReleaseHelper1(this);
		 unit3CriminalCasesHelper = new Unit3CriminalCasesHelper1(this);
		 unit3CriminalProcHelper = new Unit3CriminalProcHelper1(this);
		 unit3OtherCriminalCasesHelper = new Unit3OtherCriminalCasesHelper1(this);
		 unit3OtherCriminalProcHelper = new Unit3OtherCriminalProcHelper1(this);
		 unit3ParticipationCasesHelper = new Unit3ParticipationCasesHelper1(this);
		 unit3ParticipationProcHelper = new Unit3ParticipationProcHelper1(this);
		 unit4Helper = new Unit4Helper1(this);
		 unit5InspectionsHelper = new Unit5InspectionsHelper1(this);
		 unit5DocumentsHelper = new Unit5DocumentsHelper1(this);
		 unit5ChargedHelper = new Unit5ChargedHelper1(this);
		 unit6Helper = new Unit6Helper1(this);
		 unit7Helper = new Unit7Helper1(this);
		 unit8Helper = new Unit8Helper1(this);
		 unit9Helper = new Unit9Helper1(this);
		 
		 /*Sets URL of main page*/
		 getNavigationTopHelper().openMainPage();
		 
	}
	
	 
	/*
	 * Implements methods for managing Helpers objects
	 */
	@Override
	public UserHelper getUserHelper() {
		return userHelper;
	}
	
	@Override
	public NavigationTopHelper getNavigationTopHelper() {
		return navTopHelper;
	}
	
	@Override
	public NavigationUnit1Helper getNavigationUnit1Helper() {
		return navUnit1Helper;
	}
	
	@Override
	public NavigationUnit23Helper getNavigationUnit23Helper() {
		return navUnit23Helper;
	}
	
	@Override
	public NavigationUnit5Helper getNavigationUnit5Helper() {
		return navUnit5Helper;
	}
	
	@Override
	public NavigationUnit68Helper getNavigationUnit68Helper() {
		return navUnit68Helper;
	}
		
	@Override
	public Unit1ProceedingsHelper getUnit1ProceedingsHelper(){
		return unit1ProceedingsHelper;
	}
	
	@Override
	public Unit1ProceedingsToPrcHelper getUnit1ProceedingsToPrcHelper(){
		return unit1ProceedingsToPrcHelper;
	}
	
	@Override
	public Unit1CrimeHelper getUnit1CrimeHelper(){
		return unit1CrimeHelper;
	}
	
	@Override
	public Unit1ViewClaimsHelper getUnit1ViewClaimsHelper(){
		return unit1ViewClaimsHelper;
	}
	
	@Override
	public Unit1ViewClaimsToPrcHelper getUnit1ViewClaimsToPrcHelper(){
		return unit1ViewClaimsToPrcHelper;
	}
	
	@Override
	public Unit2ReleaseHelper getUnit2ReleaseHelper(){
		return unit2ReleaseHelper;
	}
		
	@Override
	public Unit2ActsOAHelper getUnit2ActsOAHelper(){
		return unit2ActsOAHelper;
	}
	@Override
	public Unit2ActsPIHelper getUnit2ActsPIHelper(){
		return unit2ActsPIHelper;
	}
	@Override
	public Unit2AppealsHelper getUnit2AppealsHelper(){
		return unit2AppealsHelper;
	}
	@Override
	public Unit2CovertHelper getUnit2CovertHelper(){
		return unit2CovertHelper;
	}
	@Override
	public Unit2PreventiveHelper getUnit2PreventiveHelper(){
		return unit2PreventiveHelper;
	}
	
	@Override
	public Unit3CriminalCasesHelper getUnit3CriminalCasesHelper() {
		return unit3CriminalCasesHelper;
	}
	
	@Override
	public Unit3CriminalProcHelper getUnit3CriminalProcHelper() {
		return unit3CriminalProcHelper;
	}
	
	@Override
	public Unit3OtherCriminalCasesHelper getUnit3OtherCriminalCasesHelper() {
		return unit3OtherCriminalCasesHelper;
	}
	
	@Override
	public Unit3OtherCriminalProcHelper getUnit3OtherCriminalProcHelper() {
		return unit3OtherCriminalProcHelper;
	}
	
	@Override
	public Unit3ParticipationCasesHelper getUnit3ParticipationCasesHelper() {
		return unit3ParticipationCasesHelper;
	}
	
	@Override
	public Unit3ParticipationProcHelper getUnit3ParticipationProcHelper() {
		return unit3ParticipationProcHelper;
	}
			
	@Override
	public Unit4Helper getUnit4Helper(){
		return unit4Helper;
	}
	
	@Override
	public Unit5InspectionsHelper getUnit5InspectionsHelper(){
		return unit5InspectionsHelper;
	}
	
	@Override
	public Unit5DocumentsHelper getUnit5DocumentsHelper(){
		return unit5DocumentsHelper;
	}
	
	@Override
	public Unit5ChargedHelper getUnit5ChargedHelper(){
		return unit5ChargedHelper;
	}
	
	@Override
	public Unit6Helper getUnit6Helper(){
		return unit6Helper;
	}
	
	@Override
	public Unit7Helper getUnit7Helper(){
		return unit7Helper;
	}
	
	@Override
	public Unit8Helper getUnit8Helper(){
		return unit8Helper;
	}
	
	@Override
	public Unit9Helper getUnit9Helper(){
		return unit9Helper;
	}
	  
	protected WebDriver getWebDriver() {
		return driver;
	}
	
	protected String getBaseUrl() {
	    return baseUrl;
	  }
	
	/*Performs quitting from WebDriver*/
	@Override
	public void stop() {
		if (driver != null) {
			driver.quit();
		}
	}
}
