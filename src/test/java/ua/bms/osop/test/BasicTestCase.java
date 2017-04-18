package ua.bms.osop.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import ua.bms.osop.applogic.ApplicationManager;
import ua.bms.osop.model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/*
 * Basic class for all test classes.
 * There are some methods are performed in Test's classes Before and/or After Class/Suite.
 * Performs object's initialization of model's classes(ua.bms.osop.model) 
 */
public class BasicTestCase {
	
	protected ApplicationManager app;
	
	/*Before Test Class creates new object of Application Manager*/
	@BeforeClass
	public void init() {
		app = new ApplicationManager();
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
	
	//-----------------------------------
	
	/*static Connection con = null;
	private static Statement stmt;
	public static String DB_URL = "jdbc:mysql://localhost:3306/osopdb";
	public static String DB_USER = "root";
	public static String DB_PASSWORD = "vova";
	@BeforeClass
	public void setUp() throws Exception {
		 try{
			 String dbClass = "com.mysql.jdbc.Driver";
			 Class.forName(dbClass).newInstance();
			 Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			 stmt = con.createStatement();
					 
		 }catch (Exception e) {
			 e.printStackTrace();
		 }
	}*/
	
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

	/*Initialization of input fields from 3 - "Started Crime Proceedings"("Розпочато кримінальних проваджень") Card(Unit 1) except field with drop-down list*/
	protected static Unit1CriminalCardModel criminalCard = new Unit1CriminalCardModel(
			/*Дата реєстрації*/"05.07.2016",
			/*Статті КК України за ознаками яких розпочато кримінальне провадження*/"Стаття 562 пункт 45 ГШПмаентлот",
			/*Фабула*/"Фабула 89758973548 :?%№!  -- Pvbcshgbcvghsacvgh");

	/*protected Unit1CriminalCardModel newCriminalCard() {
		try {
		String query = "select * from unit1_criminalCard";
		ResultSet res = stmt.executeQuery(query);
		while (res.next()) {
			int id = res.getInt(1);
			String regNum = res.getString(2);
			String sec = res.getString(3);
			String theory = res.getString(4);
			return new Unit1CriminalCardModel(
						regNum,
						sec,
						theory);
		}
	}*/
		/*} catch (Exception e) {
			e.printStackTrace();
		}*/

		


	
	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 1 - "Acts of supervision over pre-trial investigation" Card("Акти нагляду за ДР")(Unit 2) except field with drop-down list*/
	protected static Unit2ActPICardModel actPICard = new Unit2ActPICardModel(
			/*Кваліфікація правопорушення/злочину*/"Кваліфікація злочину8897786675",
			/*Дата  початку досудового розслідування:*/"04.12.2015",
			/*Зміст(фабула)*/"Зміст   -- Pvbcshgbcvghsacvgh");
	
	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 2 - "The appeals on the pre-trial investigation"("Апеляційні скарги з питань ДР")(Unit 2) except field with drop-down list*/
	protected static Unit2AppealCardModel appealCard = new Unit2AppealCardModel(
			/*Кваліфікація правопорушення/злочину*/"Кваліфікація злочину8ййййсуа86675",
			/*ПІБ підозрюваного / обвинуваченого*/"Пупко Андрій",
			/*Підстави для оскарження*/"Підстави --0 cvgh");

	protected static Unit2AppealCardModel appealCard2 = new Unit2AppealCardModel(
			/*Кваліфікація правопорушення/злочину*/"Квалі43253 злочину8ййййсуа86675",
			/*ПІБ підозрюваного / обвинуваченого*/"Купрієнко Мирон Веніамінович",
			/*Підстави для оскарження*/"<kf-,kf-,kf4521676");
	
	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 3 - "The Preventive Action"("Запобіжні заходи");(Unit 2) except field with drop-down list*/
	protected static Unit2PreventiveCardModel preventCard = new Unit2PreventiveCardModel(
			/*Кваліфікація правопорушення/злочину*/"Кваліфікація злочину8ййййсуа86675",
			/*Дата  початку досудового розслідування:*/"11.02.2016",
			/*Прізвище*/"Руні",
			/*Ім'я*/"Вейн",
			/*Дата народження*/"18.09.1988");
	
	protected static Unit2PreventiveCardModel preventCard2 = new Unit2PreventiveCardModel(
			/*Кваліфікація правопорушення/злочину*/"Кваліфікація",
			/*Дата  початку досудового розслідування:*/"11.02.2016",
			/*Прізвище*/"Босий",
			/*Ім'я*/"Остап",
			/*Дата народження*/"16.07.1980");
	
	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 4 - "The release from custody"("Звільнення з-під варти")(Unit 2) except field with drop-down list*/
	protected static Unit2ReleaseCardModel releaseCard = new Unit2ReleaseCardModel(
			/*Номер справи у суді*/"Справа №6742868тоіс",
			/*Дата прийняття остаточного рішення у КП стосовно особи*/"25.11.2015");
	
	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 5 - "Acts of supervision over Operational Activities"("Акти нагляду за ОРД")(Unit 2) except field with drop-down list*/
	protected static Unit2ActOACardModel actOACard = new Unit2ActOACardModel(
			/*Дата прийняття рішення*/"11.09.2016");
	
	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 6 - "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії")(Unit 2) except field with drop-down list*/
	protected static Unit2CovertCardModel covertCard = new Unit2CovertCardModel(
			/*Дата рішення суду*/"01.09.2016");
	
	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 1 - "Criminal proceedings"("Кримінальні провадження"); Card(Unit 3) except field with drop-down list*/
	protected static Unit3CriminalProceedingCardModel criminalProceedingCard = new Unit3CriminalProceedingCardModel(
			/*Дата початку досудового розслідування*/"12.06.2015",
			/*Кваліфікація правопорушення*/"лргсроивморШГШР%:;8678456",
			/*Дата надіслання до суду*/"12.06.2015");
	
	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 2 - "Other criminal proceedings"("Інші питання кримінального провадження"); Card(Unit 3) except field with drop-down list*/
	protected static Unit3OtherCriminalProceedingCardModel otherCriminalProceedingCard = new Unit3OtherCriminalProceedingCardModel(
			/*Дата реєстрації*/"12.06.2015",
			/*Коротка фабула*/"Коротка фабулаokicdhwvjhrwv76632324567%&%^&#@@%$^^8467^&$@#$%#",
			/*Дата надіслання до суду*/"12.04.2015");
	
	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 4 - "Criminal cases"("Кримінальні справи"); Card(Unit 3) except field with drop-down list*/
	protected static Unit3CriminalCaseCardModel criminalCaseCard = new Unit3CriminalCaseCardModel(
			/*Дата початку досудового розслідування*/"15.07.2016",
			/*Кваліфікація правопорушення*/"rdfksasrfwsz%:;8678456",
			/*Дата надіслання до суду*/"09.09.2016");
	
	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 2 - "Other criminal proceedings"("Інші питання кримінального провадження"); Card(Unit 3) except field with drop-down list*/
	protected static Unit3OtherCriminalCaseCardModel otherCriminalCaseCard = new Unit3OtherCriminalCaseCardModel(
			/*Дата реєстрації*/"01.05.2016",
			/*Коротка фабула*/"Коротка фабулаokicdh222rwv76632324567%&%^&#@@%$^^8467^&$@#$%#",
			/*Дата надіслання до суду*/"30.09.2016");

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 2 - "Other criminal proceedings"("Інші питання кримінального провадження"); Card(Unit 3) except field with drop-down list*/
	protected static Unit3AccusedModel accusedPerson = new Unit3AccusedModel(
			/*ПІБ*/"Особа");

	/*-----------------------------------------------------------------------------------------------------------------*/

	/*Initialization of input fields from 2 - "Other criminal proceedings"("Інші питання кримінального провадження"); Card(Unit 3) except field with drop-down list*/
	protected static ArrayList< Unit3AccusedModel > accusedPeople = new ArrayList< Unit3AccusedModel >();

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
	
	/*-----------------------------------------------------------------------------------------------------------------*/	
	
	/*Initialization of input fields from Claim Card(Unit 6) except field with drop-down list*/
	protected static Unit6CardModel clCard = new Unit6CardModel (
			/*Назва заявника*/"Petrov",
			/*Стислий зміст*/"HUIyugguswcgygw",
			/*Дата надходження до прокуратури*/"15.09.2016");
	
	/*-----------------------------------------------------------------------------------------------------------------*/	
	
	/*Initialization of input fields from Mass Media Card(Unit 7) except field with drop-down list*/
	protected static Unit7CardModel mMCard = new Unit7CardModel(
			/*Дата виступу*/"28.07.2016",
			/*Назва ЗМІ*/"Назва ЗМІ 099089667545233",
			/*Автор*/"Автор Author 56473657829*^&%#@@!",
			/*Примітка*/"Примітка Remark*&^&$%$^@$@!");
	
	/*----------------------------------------------------------------------------------------------------------------*/
	
	/*Initialization of input fields from Request Card(Unit 8) except field with drop-down list*/
	protected static Unit8CardModel reqCard = new Unit8CardModel (
			/*Дата надходження*/"10.09.2016",
			/*Стислий зміст*/"HUIyugguswcgy32435421мкуп!№;%:*:*+w");
	
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
	

}
