package ua.bms.osop.applogic1;

import org.openqa.selenium.WebDriver;

import ua.bms.osop.applogic.ApplicationManager;
import ua.bms.osop.applogic.NavigationTopHelper;
import ua.bms.osop.applogic.NavigationUnit68Helper;
import ua.bms.osop.applogic.Unit7Helper;
import ua.bms.osop.applogic.Unit9Helper;
import ua.bms.osop.applogic.UserHelper;
import ua.bms.osop.utils.ConfigProperties;
import ua.bms.osop.webdriver.WebDriverFactory;

public class ApplicationManager1 implements ApplicationManager {
	
	 private UserHelper userHelper;
	 private NavigationTopHelper navTopHelper;
	 private NavigationUnit68Helper navUnit68Helper;
	 private Unit7Helper unit7Helper;
	 private Unit9Helper unit9Helper;
	 
	 private WebDriver driver;
	 private String baseUrl;

	 
	 
	 public ApplicationManager1() {
		 
		 baseUrl = ConfigProperties.getProperty("base.url");
		 
		 driver = WebDriverFactory.getInstance();

		 userHelper = new UserHelper1(this);
		 navTopHelper = new NavigationTopHelper1(this);
		 navUnit68Helper = new NavigationUnit68Helper1(this);
		 unit7Helper = new Unit7Helper1(this);
		 unit9Helper = new Unit9Helper1(this);
		 
		 getUserHelper().openMainPage();
		 
	 }
	 
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
	public Unit7Helper getUnit7Helper(){
		return unit7Helper;
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
	 
	@Override
	public void stop() {
		if (driver != null) {
			driver.quit();
		}
	}
	  

}
