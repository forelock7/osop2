package ua.bms.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ua.bms.utils.ConfigProperties;

public class WebDriverFactory {
	private static WebDriver driver;
	
	
	
	public static WebDriver getInstance() {
	
		if (driver == null){
			//Creating a new instance of the Firefox driver
			driver = new FirefoxDriver();
			//Maximizing a browser window
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
		}
	return driver;
	}
	
	


}
