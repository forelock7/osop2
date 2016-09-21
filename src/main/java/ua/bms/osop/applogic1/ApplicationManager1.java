package ua.bms.osop.applogic1;

import org.openqa.selenium.WebDriver;
import ua.bms.osop.applogic.ApplicationManager;
import ua.bms.osop.applogic.NavigationTopHelper;
import ua.bms.osop.applogic.NavigationUnit1Helper;
import ua.bms.osop.applogic.NavigationUnit5Helper;
import ua.bms.osop.applogic.NavigationUnit68Helper;
import ua.bms.osop.applogic.Unit1ClaimsHelper;
import ua.bms.osop.applogic.Unit1ClaimsToPrcHelper;
import ua.bms.osop.applogic.Unit1CrimeHelper;
import ua.bms.osop.applogic.Unit1ReviewHelper;
import ua.bms.osop.applogic.Unit1ReviewToPrcHelper;
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
	 private NavigationUnit5Helper navUnit5Helper;
	 private NavigationUnit68Helper navUnit68Helper;
	 private Unit1ReviewHelper unit1ReviewHelper;
	 private Unit1ReviewToPrcHelper unit1ReviewToPrcHelper;
	 private Unit1CrimeHelper unit1CrimeHelper;
	 private Unit1ClaimsHelper unit1ClaimsHelper;
	 private Unit1ClaimsToPrcHelper unit1ClaimsToPrcHelper;
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
		 navUnit5Helper = new NavigationUnit5Helper1(this);
		 navUnit68Helper = new NavigationUnit68Helper1(this);
		 unit1ReviewHelper = new Unit1ReviewHelper1(this);
		 unit1ReviewToPrcHelper = new Unit1ReviewToPrcHelper1(this);
		 unit1CrimeHelper = new Unit1CrimeHelper1(this);
		 unit1ClaimsHelper = new Unit1ClaimsHelper1(this);
		 unit1ClaimsToPrcHelper = new Unit1ClaimsToPrcHelper1(this);
		 unit4Helper = new Unit4Helper1(this);
		 unit5InspectionsHelper = new Unit5InspectionsHelper1(this);
		 unit5DocumentsHelper = new Unit5DocumentsHelper1(this);
		 unit5ChargedHelper = new Unit5ChargedHelper1(this);
		 unit6Helper = new Unit6Helper1(this);
		 unit7Helper = new Unit7Helper1(this);
		 unit8Helper = new Unit8Helper1(this);
		 unit9Helper = new Unit9Helper1(this);
		 
		 /*Sets URL of main page*/
		 getUserHelper().openMainPage();
		 
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
	public NavigationUnit5Helper getNavigationUnit5Helper() {
		return navUnit5Helper;
	}
	
	@Override
	public NavigationUnit68Helper getNavigationUnit68Helper() {
		return navUnit68Helper;
	}
		
	@Override
	public Unit1ReviewHelper getUnit1ReviewHelper(){
		return unit1ReviewHelper;
	}
	
	@Override
	public Unit1ReviewToPrcHelper getUnit1ReviewToPrcHelper(){
		return unit1ReviewToPrcHelper;
	}
	
	@Override
	public Unit1CrimeHelper getUnit1CrimeHelper(){
		return unit1CrimeHelper;
	}
	
	@Override
	public Unit1ClaimsHelper getUnit1ClaimsHelper(){
		return unit1ClaimsHelper;
	}
	
	@Override
	public Unit1ClaimsToPrcHelper getUnit1ClaimsToPrcHelper(){
		return unit1ClaimsToPrcHelper;
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
