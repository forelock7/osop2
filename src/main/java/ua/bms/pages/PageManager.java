package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {
	
	  private WebDriver driver;

	  public LoginPage loginPage;
	  public NavigationTopPage navigationTopPage;
	  public NavigationUnits68Page navigationUnits68Page;
	  public Unit7MassMediaPage unit7MassMediaPage;
	  public Unit9MilitaryPage unit9MilitaryPage;

	  public PageManager(WebDriver driver) {
		  this.driver = driver;
		  loginPage = initElements(new LoginPage(this));
		  navigationTopPage = initElements(new NavigationTopPage(this));
		  navigationUnits68Page = initElements(new NavigationUnits68Page(this));
		  unit7MassMediaPage = initElements(new Unit7MassMediaPage(this));
		  unit9MilitaryPage = initElements(new Unit9MilitaryPage(this));
	  }
	  
	  private <T extends Page> T initElements(T page) {
	    PageFactory.initElements(driver, page);
	    //PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), page);
	    //PageFactory.initElements(new DisplayedElementLocatorFactory(driver, 10), page);
	    return page;
	  }
	  
	  public WebDriver getWebDriver() {
	    return driver;
	  }

}
