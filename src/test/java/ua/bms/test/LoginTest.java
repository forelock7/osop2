// Logining test

package ua.bms.test;

import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import ua.bms.pages.HomePage;
import ua.bms.pages.LoginPage;

public class LoginTest extends BasicTestCase {
	
	//Initialization of page instance according to PageFactory
	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	
	private HomePage homePage;
	
	@Test
	public void testLoginForm() throws Exception {
		loginPage.open();
		homePage = loginPage.loginAs(user);
		assertTrue(homePage.isLoggedIn());
		homePage.logOut();
		assertTrue(homePage.isLoggedOut());
	}


	
	
	/*private WebDriver driver;
	
	@BeforeClass // Runs this method before the first test method in the current class is invoked
	public void setUp() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
	}*/
	
	/*@Test // Marking this method as part of the test
	public void gotoStartPageOsop() {
		// Go to the Wikipedia home page
		driver.get("http://10.100.7.71:57775/osop/osop.Index.cls");
		// Find the text input element by its id and type "Selenium"
		driver.findElement(By.name("username")).sendKeys("vova");
		driver.findElement(By.name("password")).sendKeys("bMS$2016");
		// Click search button		
		driver.findElement(By.xpath("html/body/div/form/div[3]/input")).click();
		// Get text from header of the Selenium page		
		String header = driver.findElement(By.id("button-1036-btnInnerEl")).getText();
		// Verify that header equals "Selenium"		
		Assert.assertEquals(header, "Возний М.П.");
	}*/
	
	/*@Test // Marking this method as part of the test
	public void gotoSeleniumWikiPageFailure() {
		// Go to the Wikipedia home page
		driver.get("https://en.wikipedia.org/");
		// Find the text input element by its id and type "Selenium"
		driver.findElement(By.id("searchInput")).sendKeys("Selenium");
		// Click search button
		driver.findElement(By.id("searchButton")).click();
		// Get text from header of the Selenium page
		String header = driver.findElement(By.id("firstHeading")).getText();
		// Verify that header equals "Selenium WebDriver"
		Assert.assertEquals(header, "Selenium WebDriver");
	}*/
	
	/*@AfterClass // Runs this method after all the test methods in the current class have been run
	public void tearDown() {
		// Close all browser windows and safely end the session
		driver.quit();
	}*/

}