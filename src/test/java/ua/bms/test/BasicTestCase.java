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
	
	//Initialization of input fields from Military Administrative Violation Card except field with drop-down list
	protected AdminViolCardData aVCard = new AdminViolCardData(
			/*Номер протоколу*/"102",
			/*Дата складання протоколу*/"01.07.2016", 
			/*Дата вчинення правопорушення*/"02.07.2016", 
			/*Фабула*/"ФАБУЛА_БОТ-english", 
			/*ПІБ правопорушника*/"ПРАВОПОРУШНИК_БОТ", 
			/*Дата народження*/"03.01.1980", 
			/*Назва військової частини, установи*/"ВІЙСЬКОВА ЧАСТИНА №1", 
			/*Посада*/"Заступник командира військової частини з матеріальних питань(БОТ)",
			/*Дата первинного направлення до суду(для обліку у звіті)*/"04.07.2016", 
			/*Дата надходження рішення про повернення судом (для обліку у звіті)*/"05.07.2016", 
			/*Дата повторного направлення (для обліку у звіті)*/"06.07.2016", 
			/*Поле "Дата рішення" форми "Створення "Рух протоколу"*/"07.07.2016", 
			/*Дата надходження рішення суду(для обліку у звіті)*/"08.07.2016", 
			/*Дата початку утримання на гауптвахті:*/"09.07.2016");

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
	
	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
	
}
