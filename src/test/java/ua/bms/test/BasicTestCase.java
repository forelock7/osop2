// Basic class for all tests

package ua.bms.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import ua.bms.data.AdminViolCardData;
import ua.bms.data.UserData;
import ua.bms.utils.ConfigProperties;

public class BasicTestCase {
	
	//Keeping instance of WebDriver
	protected static WebDriver driver;

	//Initialization of object "user"	
	protected UserData user = new UserData("vova", "bMS$2016");
	protected AdminViolCardData aVCard = new AdminViolCardData("101", "01.07.2016", "01.07.2016", "‘¿¡”À¿_¡Œ“", "œ–¿¬ŒœŒ–”ÿÕ» _¡Œ“", "01.01.1980", "¬≤…—‹ Œ¬¿ ◊¿—“»Õ¿ π1");

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
