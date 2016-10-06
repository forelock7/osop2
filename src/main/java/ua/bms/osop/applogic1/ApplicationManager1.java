package ua.bms.osop.applogic1;

import org.openqa.selenium.WebDriver;
import ua.bms.osop.applogic.ApplicationManager;
import ua.bms.osop.applogic.NavigationTopHelper;
import ua.bms.osop.applogic.NavigationUnit1Helper;
import ua.bms.osop.applogic.NavigationUnit23Helper;
import ua.bms.osop.applogic.NavigationUnit5Helper;
import ua.bms.osop.applogic.NavigationUnit68Helper;
import ua.bms.osop.applogic.Unit1ViewClaimHelper;
import ua.bms.osop.applogic.Unit1ViewClaimToPrcHelper;
import ua.bms.osop.applogic.Unit1CriminalHelper;
import ua.bms.osop.applogic.Unit1ProceedingHelper;
import ua.bms.osop.applogic.Unit1ProceedingToPrcHelper;
import ua.bms.osop.applogic.Unit2ActOAHelper;
import ua.bms.osop.applogic.Unit2ActPIHelper;
import ua.bms.osop.applogic.Unit2AppealHelper;
import ua.bms.osop.applogic.Unit2CovertHelper;
import ua.bms.osop.applogic.Unit2PreventiveHelper;
import ua.bms.osop.applogic.Unit2ReleaseHelper;
import ua.bms.osop.applogic.Unit3CriminalCaseHelper;
import ua.bms.osop.applogic.Unit3CriminalProceedingHelper;
import ua.bms.osop.applogic.Unit3OtherCriminalCaseHelper;
import ua.bms.osop.applogic.Unit3OtherCriminalProceedingHelper;
import ua.bms.osop.applogic.Unit3ParticipationCaseHelper;
import ua.bms.osop.applogic.Unit3ParticipationProceedingHelper;
import ua.bms.osop.applogic.Unit4Helper;
import ua.bms.osop.applogic.Unit5ChargedHelper;
import ua.bms.osop.applogic.Unit5DocumentHelper;
import ua.bms.osop.applogic.Unit5InspectionHelper;
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
	 private Unit1ProceedingHelper unit1ProceedingHelper;
	 private Unit1ProceedingToPrcHelper unit1ProceedingToPrcHelper;
	 private Unit1CriminalHelper unit1CriminalHelper;
	 private Unit1ViewClaimHelper unit1ViewClaimHelper;
	 private Unit1ViewClaimToPrcHelper unit1ViewClaimToPrcHelper;
	 private Unit2ActOAHelper unit2ActOAHelper;
	 private Unit2ActPIHelper unit2ActPIHelper;
	 private Unit2AppealHelper unit2AppealHelper;
	 private Unit2CovertHelper unit2CovertHelper;
	 private Unit2PreventiveHelper unit2PreventiveHelper;
	 private Unit2ReleaseHelper unit2ReleaseHelper;
	 private Unit3CriminalCaseHelper unit3CriminalCaseHelper;
	 private Unit3CriminalProceedingHelper unit3CriminalProceedingHelper;
	 private Unit3OtherCriminalCaseHelper unit3OtherCriminalCaseHelper;
	 private Unit3OtherCriminalProceedingHelper unit3OtherCriminalProceedingHelper;
	 private Unit3ParticipationCaseHelper unit3ParticipationCaseHelper;
	 private Unit3ParticipationProceedingHelper unit3ParticipationProceedingHelper;
	 private Unit4Helper unit4Helper;
	 private Unit5InspectionHelper unit5InspectionHelper;
	 private Unit5DocumentHelper unit5DocumentHelper;
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
		 unit1ProceedingHelper = new Unit1ProceedingHelper1(this);
		 unit1ProceedingToPrcHelper = new Unit1ProceedingToPrcHelper1(this);
		 unit1CriminalHelper = new Unit1CrimeHelper1(this);
		 unit1ViewClaimHelper = new Unit1ViewClaimHelper1(this);
		 unit1ViewClaimToPrcHelper = new Unit1ViewClaimToPrcHelper1(this);
		 unit2ActOAHelper = new Unit2ActOAHelper1(this);
		 unit2ActPIHelper = new Unit2ActPIHelper1(this);
		 unit2AppealHelper = new Unit2AppealHelper1(this);
		 unit2CovertHelper = new Unit2CovertHelper1(this);
		 unit2PreventiveHelper = new Unit2PreventiveHelper1(this);
		 unit2ReleaseHelper = new Unit2ReleaseHelper1(this);
		 unit3CriminalCaseHelper = new Unit3CriminalCaseHelper1(this);
		 unit3CriminalProceedingHelper = new Unit3CriminalProceedingHelper1(this);
		 unit3OtherCriminalCaseHelper = new Unit3OtherCriminalCaseHelper1(this);
		 unit3OtherCriminalProceedingHelper = new Unit3OtherCriminalProceedingHelper1(this);
		 unit3ParticipationCaseHelper = new Unit3ParticipationCaseHelper1(this);
		 unit3ParticipationProceedingHelper = new Unit3ParticipationProceedingHelper1(this);
		 unit4Helper = new Unit4Helper1(this);
		 unit5InspectionHelper = new Unit5InspectionHelper1(this);
		 unit5DocumentHelper = new Unit5DocumentHelper1(this);
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
	public Unit1ProceedingHelper getUnit1ProceedingsHelper(){
		return unit1ProceedingHelper;
	}
	
	@Override
	public Unit1ProceedingToPrcHelper getUnit1ProceedingsToPrcHelper(){
		return unit1ProceedingToPrcHelper;
	}
	
	@Override
	public Unit1CriminalHelper getUnit1CrimeHelper(){
		return unit1CriminalHelper;
	}
	
	@Override
	public Unit1ViewClaimHelper getUnit1ViewClaimsHelper(){
		return unit1ViewClaimHelper;
	}
	
	@Override
	public Unit1ViewClaimToPrcHelper getUnit1ViewClaimsToPrcHelper(){
		return unit1ViewClaimToPrcHelper;
	}
	
	@Override
	public Unit2ReleaseHelper getUnit2ReleaseHelper(){
		return unit2ReleaseHelper;
	}
		
	@Override
	public Unit2ActOAHelper getUnit2ActsOAHelper(){
		return unit2ActOAHelper;
	}
	@Override
	public Unit2ActPIHelper getUnit2ActsPIHelper(){
		return unit2ActPIHelper;
	}
	@Override
	public Unit2AppealHelper getUnit2AppealsHelper(){
		return unit2AppealHelper;
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
	public Unit3CriminalCaseHelper getUnit3CriminalCasesHelper() {
		return unit3CriminalCaseHelper;
	}
	
	@Override
	public Unit3CriminalProceedingHelper getUnit3CriminalProceedingHelper() {
		return unit3CriminalProceedingHelper;
	}
	
	@Override
	public Unit3OtherCriminalCaseHelper getUnit3OtherCriminalCasesHelper() {
		return unit3OtherCriminalCaseHelper;
	}
	
	@Override
	public Unit3OtherCriminalProceedingHelper getUnit3OtherCriminalProcHelper() {
		return unit3OtherCriminalProceedingHelper;
	}
	
	@Override
	public Unit3ParticipationCaseHelper getUnit3ParticipationCasesHelper() {
		return unit3ParticipationCaseHelper;
	}
	
	@Override
	public Unit3ParticipationProceedingHelper getUnit3ParticipationProceedingHelper() {
		return unit3ParticipationProceedingHelper;
	}
			
	@Override
	public Unit4Helper getUnit4Helper(){
		return unit4Helper;
	}
	
	@Override
	public Unit5InspectionHelper getUnit5InspectionsHelper(){
		return unit5InspectionHelper;
	}
	
	@Override
	public Unit5DocumentHelper getUnit5DocumentsHelper(){
		return unit5DocumentHelper;
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
