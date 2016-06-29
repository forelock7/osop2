package ua.bms.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class BasicTestCase {
	
	protected static WebDriver driver;
	
	protected UserData admin = new UserData("vova", "bMS$2016");
	
	protected WebDriver getWebDriver() {
		if (driver == null){
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
