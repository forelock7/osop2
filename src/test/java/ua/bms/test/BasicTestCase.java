// Basic class for all tests

package ua.bms.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import ua.bms.applogic1.ApplicationManager1;
import ua.bms.model.Unit7Card;
import ua.bms.model.Unit9Card;
import ua.bms.model.User;

public class BasicTestCase {
	
	protected ApplicationManager1 app;

	@BeforeClass
	public void init() {
		app = new ApplicationManager1();
	}
			
	@AfterSuite
	public void stop() {
		app.stop();
	}
	
/*-----------------------------------------------------------------------------------------------------------------*/
	//Initialization of object "user"	
	protected User user = new User("vova", "bMS$2016");
	protected User user1 = new User("vova", "failedPassword");
	protected User user2 = new User("failedLogin", "bMS$2016");
/*-----------------------------------------------------------------------------------------------------------------*/	
	//Initialization of input fields from Military Administrative Violation Card except field with drop-down list
	protected static Unit9Card aVCard = new Unit9Card(
			/*Дата складання протоколу*/"01.07.2016", 
			/*Дата вчинення правопорушення*/"02.07.2016", 
			/*Фабула*/"Фабула_бот-english", 
			/*ПІБ правопорушника*/"правопорушник_bot", 
			/*Дата народження*/"03.01.1980", 
			/*Назва військової частини, установи*/"Військова частина №47707", 
			/*Посада*/"Перший заступник командира в/ч",
			/*Дата первинного направлення до суду (для обліку у звіті)*/"04.07.2016", 
			/*Дата надходження рішення про повернення судом (для обліку у звіту)*/"05.07.2016", 
			/*Дата повторного направлення (для обліку у звіту)*/"06.07.2016", 
			/*Поле "Дата рішення"*/"07.07.2016", 
			/*Дата надходження рішення суду(для обліку у звіті)*/"08.07.2016", 
			/*Дата початку утримання на гаупвахті*/"09.07.2016");
	
	protected static String someText = "Some text after EDITING 12343434456678767890!@#@#$%^&&*^";
/*-----------------------------------------------------------------------------------------------------------------*/	
	protected static Unit7Card mMCard = new Unit7Card(
			/*Дата виступу*/"28.07.2016",
			/*Назва ЗМІ*/"Назва ЗМІ 099089667545233",
			/*Автор*/"Автор Author 56473657829*^&%#@@!",
			/*Примітка*/"Примітка Remark*&^&$%$^@$@!");

}
