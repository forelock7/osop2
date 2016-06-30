// Basic class for all tests

package ua.bms.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import ua.bms.data.UserData;
import ua.bms.utils.ConfigProperties;

public class BasicTestCase {
	
//Keeping instance of WebDriver
	protected static WebDriver driver;

//Initialization of object "user"	
	protected UserData user = new UserData("vova", "bMS$2016");

	protected WebDriver getWebDriver() {
		if (driver == null){
			//Creating a new instance of the Firefox driver
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
		}
		return driver;
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}
