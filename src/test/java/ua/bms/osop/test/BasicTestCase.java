package ua.bms.osop.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import ua.bms.osop.applogic1.ApplicationManager1;
import ua.bms.osop.model.*;

/*
 * Basic class for all test classes.
 * There are some methods are performed in Test's classes Before and/or After Class/Suite.
 * Performs object's initialization of model's classes(ua.bms.osop.model) 
 */
public class BasicTestCase {
	
	protected ApplicationManager1 app;
	
	/*Before Test Class creates new object of Application Manager*/
	@BeforeClass
	public void init() {
		app = new ApplicationManager1();
	}
	
	/*Checks login in system before Test Class, in case logOut - performs loginIn*/
	@BeforeClass
	public void mayBeLogIn() {
		if (app.getUserHelper().isLoggedIn()) {
			return;
		}
		app.getUserHelper().loginAs(userModel);
	}
	
	/*Quits from WebDriver after performing Test Suite*/
	@AfterSuite
	public void stop() {
		app.stop();
	}
	
/*-----------------------------------------------------------------------------------------------------------------*/
	/*Initialization of object "user"*/	
	protected UserModel userModel = new UserModel("vova", "bMS$2016");
	protected UserModel user1 = new UserModel("vova", "failedPassword");
	protected UserModel user2 = new UserModel("failedLogin", "bMS$2016");
	
/*-----------------------------------------------------------------------------------------------------------------*/	
	
	/*Initialization of input fields from Review proceedings on a claim Card(Unit 1) except field with drop-down list*/
	protected static Unit1ProceedingCardModel proceedingCard = new Unit1ProceedingCardModel(
			/*Відповідач(боржник)*/"Відповідач - боржник");
	
/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from Review proceedings on a claim to Procuracy authorities Card(Unit 1) except field with drop-down list*/
	protected static Unit1ProceedingToPrcCardModel proceedingToPrcCard = new Unit1ProceedingToPrcCardModel(
			/*Відповідач*/"Відповідач(до прокуратури)");

/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 1 - "Acts of supervision over pre-trial investigation" Card("Акти нагляду за ДР");(Unit 2) except field with drop-down list*/
	protected static Unit2ActPICardModel actPICard = new Unit2ActPICardModel(
			/*Кваліфікація правопорушення/злочину*/"Кваліфікація злочину8897786675",
			/*Зміст(фабула)*/"Зміст   -- Pvbcshgbcvghsacvgh");
	
/*-----------------------------------------------------------------------------------------------------------------*/
	
	/*Initialization of input fields from Military Administrative Offenses Card(Unit 9) except field with drop-down list*/
	protected static Unit9CardModel mAOCard = new Unit9CardModel(
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
	
/*-----------------------------------------------------------------------------------------------------------------*/	
	
	/*Initialization of input fields from Mass Media Card(Unit 7) except field with drop-down list*/
	protected static Unit7CardModel mMCard = new Unit7CardModel(
			/*Дата виступу*/"28.07.2016",
			/*Назва ЗМІ*/"Назва ЗМІ 099089667545233",
			/*Автор*/"Автор Author 56473657829*^&%#@@!",
			/*Примітка*/"Примітка Remark*&^&$%$^@$@!");

/*-----------------------------------------------------------------------------------------------------------------*/	
	
	/*Initialization of input fields from Claim Card(Unit 6) except field with drop-down list*/
	protected static Unit6CardModel clCard = new Unit6CardModel (
			/*Назва заявника*/"Petrov",
			/*Стислий зміст*/"HUIyugguswcgygw",
			/*Дата надходження до прокуратури*/"15.09.2016");
		
/*----------------------------------------------------------------------------------------------------------------*/
	
	/*Initialization of input fields from Request Card(Unit 8) except field with drop-down list*/
	protected static Unit8CardModel reqCard = new Unit8CardModel (
			/*Дата надходження*/"10.09.2016",
			/*Стислий зміст*/"HUIyugguswcgy32435421мкуп!№;%:*:*+w");
	
/*----------------------------------------------------------------------------------------------------------------*/
	
	/*Initialization of input fields from International Judicial Cooperation Card(Unit 4) except field with drop-down list*/
	protected static Unit4CardModel intCard = new Unit4CardModel (
			/*Дата надходження*/"11.09.2016",
			/*Стислий зміст*/"HUIyugguswc1111111189ycgcvgas35421мкуп!№;%:*:*+w");
	
/*----------------------------------------------------------------------------------------------------------------*/
	
	/*Initialization of input fields from Inspection Unit 5 "Supervision of the observance of laws in the execution of judgments." except field with drop-down list*/
	protected static Unit5InspectionCardModel inspectionCard = new Unit5InspectionCardModel (
			/*Дата проведення перевірки*/"08.09.2016");

/*----------------------------------------------------------------------------------------------------------------*/
	
	/*Initialization of input fields from Response Document Unit 5 "Supervision of the observance of laws in the execution of judgments." except field with drop-down list*/
	protected static Unit5DocumentCardModel documentCard = new Unit5DocumentCardModel ();
	
/*----------------------------------------------------------------------------------------------------------------*/	
	
	/*Initialization of input fields from Charged Person Card Unit 5 "Supervision of the observance of laws in the execution of judgments." except field with drop-down list*/
	protected static Unit5ChargedCardModel chargedCard = new Unit5ChargedCardModel(
			/*Посада*/"Керівник відділу роботи з клієнтами");

}
