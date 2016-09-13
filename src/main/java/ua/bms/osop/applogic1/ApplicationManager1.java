package ua.bms.osop.applogic1;

import org.openqa.selenium.WebDriver;
import ua.bms.osop.applogic.ApplicationManager;
import ua.bms.osop.applogic.NavigationTopHelper;
import ua.bms.osop.applogic.NavigationUnit68Helper;
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
	 private NavigationUnit68Helper navUnit68Helper;
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
		 navUnit68Helper = new NavigationUnit68Helper1(this);
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
	public NavigationUnit68Helper getNavigationUnit68Helper() {
		return navUnit68Helper;
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
