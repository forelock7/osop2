package ua.bms.applogic1;

import org.openqa.selenium.WebDriver;
import ua.bms.applogic.ApplicationManager;
import ua.bms.applogic.NavigationHelper;
import ua.bms.applogic.Unit7Helper;
import ua.bms.applogic.Unit9Helper;
import ua.bms.applogic.UserHelper;
import ua.bms.utils.ConfigProperties;
import ua.bms.webdriver.WebDriverFactory;

public class ApplicationManager1 implements ApplicationManager {
	
	 private UserHelper userHelper;
	 private NavigationHelper navHelper;
	 private Unit7Helper unit7Helper;
	 private Unit9Helper unit9Helper;
	 
	 private WebDriver driver;
	 private String baseUrl;

	 
	 
	 public ApplicationManager1() {
		 
		 baseUrl = ConfigProperties.getProperty("base.url");
		 
		 driver = WebDriverFactory.getInstance();

		 userHelper = new UserHelper1(this);
		 navHelper = new NavigationHelper1(this);
		 unit7Helper = new Unit7Helper1(this);
		 unit9Helper = new Unit9Helper1(this);
		 
		 getNavigationHelper().openMainPage();
		 
	 }
	 
	@Override
	public UserHelper getUserHelper() {
		return userHelper;
	}
	
	@Override
	public NavigationHelper getNavigationHelper() {
	  return navHelper;
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
