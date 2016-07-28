package ua.bms.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import ua.bms.pages.HomePage;
import ua.bms.pages.LoginPage;
import ua.bms.pages.Unit7MassMediaPage;
import ua.bms.pages.Unit9MilitaryPage;

public class Unit7MassMediaTest extends BasicTestCase {
	//private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	
	private HomePage homePage = PageFactory.initElements(getWebDriver(), HomePage.class);
	
	//private Unit9MilitaryPage unit9MilitaryPage = PageFactory.initElements(getWebDriver(), Unit9MilitaryPage.class);;
	
	private Unit7MassMediaPage unit7MassMediaPage;

	@Test (groups = {"unit7"})
	public void testJumpToUnit7Page() throws Exception {

		unit7MassMediaPage = homePage.goToU7();
		assertTrue(unit7MassMediaPage.isOnUnit7Page());
	}
	
	
	@Test (groups = {"unit7"}, dependsOnMethods = {"testJumpToUnit7Page"})
	public void testCreateMassMediaCard() throws Exception {
		
		unit7MassMediaPage.createCardU7(mMCard);
		unit7MassMediaPage.openCardToEdit();
		
		String subjectOfSpeechInField = unit7MassMediaPage.getSubjectOfSpeech();
		
		//protocol number, that was used upon creating the card
		String currentsubjectOfSpeech = mMCard.subjectOfSpeech;
		
		System.out.println("subjectOfSpeechInField = " + subjectOfSpeechInField);
		System.out.println("currentsubjectOfSpeech = " + currentsubjectOfSpeech);
		
		Assert.assertEquals(subjectOfSpeechInField, currentsubjectOfSpeech);
		unit7MassMediaPage.exitFromCard();
		
		//unit9MilitaryPage.exitFromCard();
		//homePage.logOut();
		//assertTrue(homePage.isLoggedOut());
	}
	
}
