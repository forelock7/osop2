package ua.bms.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import ua.bms.utils.ConfigProperties;

public class Pages {
	
	protected static WebDriver driver;
	
	protected WebDriver getWebDriver() {
		if (driver == null){
			//Creating a new instance of the Firefox driver
			driver = new FirefoxDriver();
			//Maximizing a browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
		}
		return driver;
	}

    private static <T> T getPage(Class<T> pageType)  {
        T page;
        try {
            page = pageType.newInstance();
        } catch (InstantiationException | IllegalAccessException e) { //make sure you use JDK 1.7
            throw new RuntimeException(e);
        }
        //replace the driver reference here with a suitable mechanism using which a webdriver reference can be obtained.
        PageFactory.initElements(driver, page);
        return page;
    }

    public static LoginPage login() {
        return getPage(LoginPage.class);
    }
}
